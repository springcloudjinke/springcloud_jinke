package com.jk.controller;

import com.jk.service.TeacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teac")
public class TeacController {

    @Autowired
    private TeacService teacService;


}
