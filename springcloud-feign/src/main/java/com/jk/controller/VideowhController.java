package com.jk.controller;

import com.jk.model.Goods;
import com.jk.model.Teacher;
import com.jk.service.VideowhService;
import com.jk.util.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: VideowhController
 * describe:
 *
 * @author wanghang
 * @date 2019/09/17 20:49
 */

@Controller
@RequestMapping("videowh")
public class VideowhController {

    @Autowired
    private VideowhService VideowhService;

    @Autowired
    private RedisTemplate redisTemplate;


   //查询首页
    @RequestMapping(value = "queryvideowh")
    @ResponseBody
    public List<Goods> queryvideowh(Model model) {
        List<Goods> list = new ArrayList<>();
        String key = "Video";
        if (redisTemplate.hasKey(key)){
            list = (List<Goods>) redisTemplate.opsForValue().get(key);
        }else {
            list = VideowhService.queryvideowh();
            redisTemplate.opsForValue().set(key,list);
            redisTemplate.expire(key, 10, TimeUnit.MINUTES);
        }
        return list;
        }

        //身份证照片
    @RequestMapping("updaloadImg")
    @ResponseBody
    public String uploadImg(MultipartFile imgg)throws IOException {
        if (imgg == null || imgg.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(imgg);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        //System.out.println(split[0]);
        return split[0];
    }

    //头像照片
    @RequestMapping("updaloadImg1")
    @ResponseBody
    public String updaloadImg1(MultipartFile img)throws IOException {
        if (img == null || img.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(img);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        //System.out.println(split[0]);
        return split[0];
    }

    //讲师入驻
    @RequestMapping("addTeacher")
    @ResponseBody
    public void addTeacher(Teacher teacher){

        VideowhService.addTeacher(teacher);

    }
}
