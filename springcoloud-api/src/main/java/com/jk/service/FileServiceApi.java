package com.jk.service;

import com.jk.model.FileEntity;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FileServiceApi {

    @RequestMapping(value = "/saveFile",method = RequestMethod.POST)
    public void saveFile(@RequestBody final FileEntity entity);

    @RequestMapping(value = "/FileEntity",method = RequestMethod.POST)
    public FileEntity findByid(@RequestParam("id") long id) ;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List<FileEntity> findAll();

    @RequestMapping(value = "/queryVideo2",method = RequestMethod.POST)
    PageUtil queryVideo2(@RequestBody final ParameUtil parameUtil);
}
