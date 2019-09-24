package com.jk.controller;

import com.jk.model.Student;
import com.jk.model.User;
import com.jk.service.TeacService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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

    //查询学生
    @RequestMapping("queryStudent")
    @ResponseBody
    public DataGridResult queryStudent(@RequestBody ParameUtil parameUtil) {
        PageUtil pageUtil = teacService.queryStudent(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setRows(pageUtil.getList());
        result.setTotal(pageUtil.getSumSize());

        return result;
    }


    //前登陆
    @RequestMapping("loginStu")
    @ResponseBody
    public String login(Student student, HttpServletRequest request) {
        //验证账号
        Student loginUser = teacService.queryStuName(student.getAccount());

        if (loginUser == null) {
            return "userError";
        }
        //验证密码
        if (!loginUser.getPassword().equals(student.getPassword())) {
            return "pwError";
        }
        //登录成功
        request.getSession().setAttribute("luser", loginUser);
        return "success";
    }


    //查询会员学生
    @RequestMapping("queryStudentShow")
    @ResponseBody
    public DataGridResult queryStudentShow(@RequestBody ParameUtil parameUtil) {
        PageUtil pageUtil = teacService.queryStudentShow(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setRows(pageUtil.getList());
        result.setTotal(pageUtil.getSumSize());
        return result;
    }





}
