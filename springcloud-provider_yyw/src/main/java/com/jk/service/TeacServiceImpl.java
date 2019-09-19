package com.jk.service;

import com.jk.dao.TeacDao;
import com.jk.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacServiceImpl {

    @Autowired
    private TeacDao teacDao;

}
