package com.jk.mapper;

import com.jk.model.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {

    @Select("select * from t_tearcher")
    List<Teacher> queryVideo(Map map);
}
