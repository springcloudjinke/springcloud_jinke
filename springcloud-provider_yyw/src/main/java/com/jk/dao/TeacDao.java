package com.jk.dao;

import com.jk.model.Student;
import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface TeacDao {
    List<Teacher> queryTeac(Map map);

    @Update("update t_teacher t set t.status=2 where teacherId =#{id}")
    void refuse(Integer id);

    @Update("update t_teacher t set t.status=1 where teacherId = #{id}")
    void pass(Integer id);

    List<Teacher> queryTeacShow(Map map);

    List<Student> queryStudent(Map map);

    
}
