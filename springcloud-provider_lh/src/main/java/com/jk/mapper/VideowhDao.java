package com.jk.mapper;

import com.jk.model.Student;
import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideowhDao {

    @Select("select * from t_teacher t,t_video v where t.teacherId=v.tid")
    List<Teacher> queryvideowh();
    @Select("select * from t_teacher t,t_video v where t.teacherId=v.tid and t.teacherId=#{teacherId}")
    List<Teacher> queryTeacher(Integer teacherId);
    @Select("select * from t_teacher t,t_video v where t.teacherId=v.tid  and t.teacherId=#{teacherId}")
    List<Teacher> queryvideowhById(Integer teacherId);

    void addTeacher(Teacher teacher);

    void updData(Student student);
}
