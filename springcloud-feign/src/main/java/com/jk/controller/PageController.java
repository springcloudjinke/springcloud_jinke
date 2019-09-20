/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PageController
 * Author:   李辉
 * Date:     2019/9/17 19:34
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 李辉           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.Goods;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.print.DocFlavor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 李辉
 * @create 2019/9/17
 * @since 1.0.0
 */
@Controller
@RequestMapping("page")
public class PageController {

    //主页面
    @RequestMapping("main")
    public String main(){
        return  "main";
    }


    //主页面
    @RequestMapping("index")
    public String index(){
        return  "index";
    }
//ruzhu
    @RequestMapping("ruzhu")
    public String ruzhu(){
        return  "ruzhu";
    }

    //视频
    @RequestMapping("ship")
    public ModelAndView ship(Integer teacherId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ship");
        mv.addObject("teacherId",teacherId);
        return  mv;
    }

}