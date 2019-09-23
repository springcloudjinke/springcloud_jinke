package com.jk.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.mapper.FileMapper;
import com.jk.model.FileEntity;
import com.jk.model.Goods;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FileServiceImpl implements FileServiceApi {

    @Autowired
    private FileMapper fileMapper;
    @Override
    public void saveFile(FileEntity entity) {
        fileMapper.saveFile(entity);

    }

    @Override
    public FileEntity findByid(long id) {

        return fileMapper.findByid(id);
    }

    @Override
    public List<FileEntity> findAll() {

        return fileMapper.findAll();
    }

    @Override
    public PageUtil queryVideo2(ParameUtil parameUtil) {
        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());

        Map map = new HashMap<>();

        /* map.put("name",parameUtil.getName());*/
        /*            System.err.println(parameUtil.getName());*/
        List<FileEntity> list = fileMapper.queryVideo2(map);

        PageInfo<FileEntity> pageInfo = new PageInfo<>(list);

        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());

        page.setList(list);

        return page;
    }
}
