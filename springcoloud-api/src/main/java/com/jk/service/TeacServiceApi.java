package com.jk.service;

import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface TeacServiceApi {
    @RequestMapping(value = "/queryTeac")
    PageUtil queryTeac(@RequestBody  ParameUtil parameUtil);

    @RequestMapping(value = "/refuse")
    void refuse(@RequestParam("id") Integer id);

    @RequestMapping(value = "/pass")
    void pass(@RequestParam("id") Integer id);

    @RequestMapping(value = "/queryTeacShow")
    PageUtil queryTeacShow(@RequestBody  ParameUtil parameUtil);

    @RequestMapping(value = "/queryStudent")
    PageUtil queryStudent(@RequestBody ParameUtil parameUtil);

}
