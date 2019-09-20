package com.jk.controller;

import com.jk.service.TeacService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("teac")
public class TeacController {

    @Autowired
    private TeacService teacService;

    //查询审核讲师
    @RequestMapping("queryTeac")
    @ResponseBody
    public DataGridResult queryTeac(@RequestBody ParameUtil parameUtil) {
        PageUtil pageUtil = teacService.queryTeac(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setRows(pageUtil.getList());
        result.setTotal(pageUtil.getSumSize());

        return result;
    }


    //审核拒绝
    @RequestMapping("refuse")
    @ResponseBody
    public void refuse(Integer id){
        teacService.refuse(id);
    }
    //审核通过
    @RequestMapping("pass")
    @ResponseBody
    public void pass(Integer id){
        teacService.pass(id);
    }

    //查询讲师
    @RequestMapping("queryTeacShow")
    @ResponseBody
    public DataGridResult queryTeacShow(@RequestBody ParameUtil parameUtil) {
        PageUtil pageUtil = teacService.queryTeacShow(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setRows(pageUtil.getList());
        result.setTotal(pageUtil.getSumSize());

        return result;
    }








}
