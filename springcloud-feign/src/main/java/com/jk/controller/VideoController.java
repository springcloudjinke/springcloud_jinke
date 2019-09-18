package com.jk.controller;

import com.jk.service.VideoService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("video")
@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("queryVideo")
    @ResponseBody
    public DataGridResult queryVideo(ParameUtil parameUtil){

        DataGridResult dataGridResult = new DataGridResult();

        PageUtil pageUtil = videoService.queryVideo(parameUtil);

        dataGridResult.setTotal(pageUtil.getSumSize());
        dataGridResult.setRows(pageUtil.getList());

        return dataGridResult;

    }

}
