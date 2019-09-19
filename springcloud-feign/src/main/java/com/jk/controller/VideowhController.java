package com.jk.controller;

import com.jk.model.Goods;
import com.jk.model.Video;
import com.jk.service.VideowhService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import feign.Body;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/queryvideowh", method = RequestMethod.POST)
    @ResponseBody
    public List<Goods> queryvideowh(Model model) {
        List<Goods> list = new ArrayList<>();
        String key = "Video";
        if (redisTemplate.hasKey(key)) {
            list = (List<Goods>) redisTemplate.opsForValue().get(key);
        } else {
            list = VideowhService.queryvideowh();
            redisTemplate.opsForValue().set(key, list);
            redisTemplate.expire(key, 10, TimeUnit.MINUTES);
        }
        System.out.println(111111);
        return list;

    }


}
