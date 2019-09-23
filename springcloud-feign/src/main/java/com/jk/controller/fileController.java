package com.jk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jk.model.FileEntity;
import com.jk.service.FileService;
import com.jk.util.FileUploadTool;

@RequestMapping("file")
@Controller
public class fileController {
	@Autowired
	private FileService fileservice;

	/*
	 * 进入到上传页面
	 *
	 * */
	@RequestMapping(value="/login")
	public String login() {
		System.out.println("dashjkdha:");
		return "html/dhy/upload";
	}

	@RequestMapping(value="/showVideo")
	public String showVideo() {
		System.out.println("dashjkdha:");
		return "html/dhy/showVideo";
	}

	@RequestMapping(value="/test")
	public String test() {

		return "html/dhy/test";
	}

	/*
	 * 查询所有
	 *
	 * */
	@RequestMapping(value="/result",method=RequestMethod.GET)
	public String result(Model model) {
		List<FileEntity> entity = fileservice.findAll();
		model.addAttribute("entity", entity);
		return "result";
	}
	/*
	 * 上传文件
	 *
	 * */
	@RequestMapping(value = "/upload_aa")
	@ResponseBody
	public ModelAndView upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile,
							   HttpServletRequest request, ModelMap map) {
		String message = "";
		FileEntity entity = new FileEntity();
		String logoPathDir = request.getParameter("shipin");
		System.out.println("-------" + logoPathDir + "----------------------------------");
		FileUploadTool fileUploadTool = new FileUploadTool();
		try {
			entity = fileUploadTool.createFile(logoPathDir, multipartFile, request);
			if (entity != null) {
				fileservice.saveFile(entity);
				message = "上传成功";
				map.put("entity", entity);
				map.put("result", message);
			} else {
				message = "上传失败";
				map.put("result", message);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("result", map);
	}


	//查询goods表
	@RequestMapping("queryVideo2")
	@ResponseBody
	public DataGridResult queryVideo(ParameUtil parameUtil){

		DataGridResult dataGridResult = new DataGridResult();

		PageUtil pageUtil = fileservice.queryVideo2(parameUtil);

		dataGridResult.setTotal(pageUtil.getSumSize());
		dataGridResult.setRows(pageUtil.getList());

		return dataGridResult;

	}


}