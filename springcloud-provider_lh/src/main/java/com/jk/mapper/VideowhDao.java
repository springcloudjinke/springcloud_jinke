package com.jk.mapper;

import com.jk.model.Goods;
import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideowhDao {
    @Select("select * from t_teacher t,t_video v where t.videoid=v.videoid")
    List<Teacher> queryvideowh();
@Select("select * from t_teacher t,t_video v where t.videoid=v.videoid and t.teacherId=#{teacherId}")
    List<Teacher> queryTeacher(Integer teacherId);
    @Select("select * from t_teacher t,t_video v where t.videoid=v.videoid  and t.teacherId=#{teacherId}")
    List<Teacher> queryvideowhById(Integer teacherId);
}
