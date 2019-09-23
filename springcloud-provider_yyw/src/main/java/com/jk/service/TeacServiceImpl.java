package com.jk.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.dao.TeacDao;
import com.jk.dao.UserDao;
import com.jk.model.Student;
import com.jk.model.Teacher;
import com.jk.model.User;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TeacServiceImpl implements TeacServiceApi {

    @Autowired
    private TeacDao teacDao;

    //查询审核讲师
    @Override
    public PageUtil queryTeac(ParameUtil parameUtil) {
        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());
        Map map = new HashMap<>();
        map.put("teacherName",parameUtil.getTeacherName());
        List<Teacher> list = teacDao.queryTeac(map);
        PageInfo<Teacher> pageInfo = new PageInfo<>(list);
        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());
        page.setList(list);
        return page;

    }

    //拒绝审核
    @Override
    public void refuse(Integer id) {
        teacDao.refuse(id);
    }

    //审核通过
    @Override
    public void pass(Integer id) {
        teacDao.pass(id);
    }

    //查询讲师
    @Override
    public PageUtil queryTeacShow(ParameUtil parameUtil) {
        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());
        Map map = new HashMap<>();
        map.put("teacherName",parameUtil.getTeacherName());
        List<Teacher> list = teacDao.queryTeacShow(map);
        PageInfo<Teacher> pageInfo = new PageInfo<>(list);
        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());
        page.setList(list);
        return page;
    }
    //查询学生
    @Override
    public PageUtil queryStudent(ParameUtil parameUtil) {
        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());
        Map map = new HashMap<>();
        map.put("account",parameUtil.getAccount());
        List<Student> list = teacDao.queryStudent(map);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());
        page.setList(list);
        return page;
    }
    //前登陆
    @Override
    public Student queryStuName(String account) {
        return teacDao.queryStuName(account);
    }

    //查询学生会员信息
    @Override
    public PageUtil queryStudentShow(ParameUtil parameUtil) {

        PageHelper.startPage(parameUtil.getPageNumber(),parameUtil.getPageSize());
        Map map = new HashMap<>();
        map.put("account",parameUtil.getAccount());
        List<Student> list = teacDao.queryStudentShow(map);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        PageUtil page= new PageUtil((int)pageInfo.getTotal(),parameUtil.getPageNumber(), parameUtil.getPageSize());
        page.setList(list);
        return page;
    }
}
