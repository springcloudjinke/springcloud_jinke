package com.jk.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.mapper.VideoMapper;
import com.jk.model.Teacher;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VideoServiceImpl implements VideoServiceApi {

    @Autowired
    private VideoMapper videoMapper;


    @Override
    public PageUtil queryVideo(ParameUtil parameUtil) {

        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());

        Map map = new HashMap<>();

       /* map.put("name",parameUtil.getName());*/
        /*            System.err.println(parameUtil.getName());*/
        List<Teacher> list = videoMapper.queryVideo(map);

        PageInfo<Teacher> pageInfo = new PageInfo<>(list);

        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());

        page.setList(list);

        return page;
    }
}
