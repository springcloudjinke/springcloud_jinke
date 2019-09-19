package com.jk.service;

import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface VideoServiceApi {

    @RequestMapping(value = "/queryVideo", method = RequestMethod.POST)
    PageUtil queryVideo(@RequestBody ParameUtil parameUtil);

}
