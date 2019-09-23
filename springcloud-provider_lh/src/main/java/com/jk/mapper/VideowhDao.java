package com.jk.mapper;

import com.jk.model.Goods;
import com.jk.model.Student;
import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface VideowhDao {
    @Select("select * from t_teacher t,t_video v where t.teacherId=v.tid")
    List<Teacher> queryvideowh();
@Select("select * from t_teacher t,t_video v where t.teacherId=v.tid and t.teacherId=#{teacherId}")
    List<Teacher> queryTeacher(Integer teacherId);
    @Select("select * from t_teacher t,t_video v where t.teacherId=v.tid  and t.teacherId=#{teacherId}")
    List<Teacher> queryvideowhById(Integer teacherId);

    void addTeacher(Teacher teacher);
@Update("update  t_student set member=1,memberDate=now(),memberTime=date_add(memberTime, interval #{day} day) where id=#{id}")
    void addHuiYuan(Integer id, Integer day);
    @Update("update  t_student set member=1,memberTime=date_add(memberTime, interval #{day} day) where id=#{id}")
    void addHuiYuan2(Integer id, Integer day);

@Update("update t_student set member=2, memberDate=null where id=#{id}")
    void updateHuiYuan(Integer id);
}
