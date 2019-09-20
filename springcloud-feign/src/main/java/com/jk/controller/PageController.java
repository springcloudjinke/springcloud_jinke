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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    //讲师入驻页面
    @RequestMapping("ruzhu")
    public String ruzhu(){
        return  "ruzhu";
    }

}