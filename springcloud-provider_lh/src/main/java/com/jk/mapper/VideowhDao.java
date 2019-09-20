package com.jk.mapper;

import com.jk.model.Goods;
import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideowhDao {
    @Select("select * from t_goods")
    List<Goods> queryvideowh();

    void addTeacher(Teacher teacher);
}
