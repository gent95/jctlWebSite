package com.jctl.cloud.wap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 手机访问控制页面
 * Created by liukai on 2017/1/13 0013.
 */
@Controller
@RequestMapping("mobile")
public class WapMoblieController {
    @RequestMapping("")
    public String wapIndex(){
        return "wap/index";
    }


}
