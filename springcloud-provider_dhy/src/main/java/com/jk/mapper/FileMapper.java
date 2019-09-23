package com.jk.mapper;

import com.jk.model.FileEntity;
import com.jk.model.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface FileMapper {
    void saveFile(FileEntity entity);

    FileEntity findByid(long id);

    List<FileEntity> findAll();

    @Select("select * from videoup")
    List<FileEntity> queryVideo2(Map map);
}
