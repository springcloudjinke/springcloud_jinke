package com.jk.service;

import com.jk.model.Goods;
import com.jk.model.Video;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: VideowhServiceApi
 * describe:
 *
 * @author wanghang
 * @date 2019/09/17 20:56
 */
public interface VideowhServiceApi {

  @RequestMapping(value = "/queryvideowh",method = RequestMethod.POST)
    List<Goods> queryvideowh();
}