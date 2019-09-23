package com.jk.service.impl;


import com.jk.mapper.VideowhDao;
import com.jk.model.Goods;
import com.jk.model.Student;
import com.jk.model.Teacher;
import com.jk.model.Video;
import com.jk.service.VideowhServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * ClassName: VideowhServiceImpl
 * describe:
 *
 * @author wanghang
 * @date 2019/09/18 9:30
 */
@RestController
public class VideowhServiceImpl implements VideowhServiceApi {

    @Autowired
    private VideowhDao videowhDao;
//首页
    @Override
    @RequestMapping(value = "/queryvideowh")
    public List<Teacher> queryvideowh() {
        return videowhDao.queryvideowh();
    }
    //ship   页面
    @Override
    @RequestMapping(value = "/queryTeacher")
    public List<Teacher> queryTeacher(@RequestParam("teacherId") Integer teacherId) {
        return videowhDao.queryTeacher(teacherId);
    }

    //查询 每个老师的视频
    @Override
    @RequestMapping(value = "/queryvideowhById")
    public List<Teacher> queryvideowhById(@RequestParam("teacherId") Integer teacherId) {
        return videowhDao.queryvideowhById(teacherId);
    }
//新增老师
    @Override
    @RequestMapping("addTeacher")
    public void addTeacher(@RequestBody Teacher teacher) {

        videowhDao.addTeacher(teacher);

    }
    //新增会员
    @Override
    @RequestMapping("addHuiYuan")
    public void addHuiYuan(@RequestParam("id") Integer id, @RequestParam("day")  Integer day) {

        videowhDao.addHuiYuan(id,day);
    }
    //新增会员
    @Override
    @RequestMapping("addHuiYuan")
    public void addHuiYuan2(@RequestParam("id") Integer id, @RequestParam("day")  Integer day) {
        videowhDao.addHuiYuan2(id,day);
    }

    @Override
    @RequestMapping("addHuiYuan")
    public Student queryHui(@RequestParam("id") Integer id) {
        return videowhDao.queryHui(id);
    }

    @Override
    @RequestMapping("queryHuiYuan")
    public void updateHuiYuan(@RequestParam("id")Integer id) {
        videowhDao.updateHuiYuan(id);
    }
}
