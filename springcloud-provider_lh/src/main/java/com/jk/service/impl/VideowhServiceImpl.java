package com.jk.service.impl;


import com.jk.mapper.VideowhDao;
import com.jk.model.Goods;
import com.jk.model.Teacher;
import com.jk.model.Video;
import com.jk.service.VideowhServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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

    @Override
    public List<Goods> queryvideowh() {
        return videowhDao.queryvideowh();
    }

    @Override
    public void addTeacher(Teacher teacher) {

        videowhDao.addTeacher(teacher);

    }
}
