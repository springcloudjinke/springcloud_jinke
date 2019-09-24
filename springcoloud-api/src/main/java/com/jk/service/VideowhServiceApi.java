package com.jk.service;

import com.jk.model.Goods;
import com.jk.model.Student;
import com.jk.model.Teacher;
import com.jk.model.Video;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ClassName: VideowhServiceApi
 * describe:
 *
 * @author wanghang
 * @date 2019/09/17 20:56
 */
public interface VideowhServiceApi {

  @RequestMapping(value = "/queryvideowh")
    List<Teacher> queryvideowh();
    @RequestMapping(value = "/queryTeacher")
    List<Teacher> queryTeacher(@RequestParam("teacherId") Integer teacherId);
    @RequestMapping(value = "/queryvideowhById")
    List<Teacher> queryvideowhById(@RequestParam("teacherId")  Integer teacherId);

  //讲师新增
  @RequestMapping("addTeacher")
    void addTeacher(@RequestBody Teacher teacher);

  //个人中心 -- 个人资料修改
  @RequestMapping("updData")
    void updData(@RequestBody Student student);

  //个人中心--查询我的课程 mongodb
  @RequestMapping("queryMyCourse")
  PageUtil queryMyCourse(ParameUtil param);
}
