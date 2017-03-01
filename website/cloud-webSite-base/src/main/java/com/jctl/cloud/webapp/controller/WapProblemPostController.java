package com.jctl.cloud.webapp.controller;

import com.jctl.cloud.modules.website.entity.problem.ProblemPost;
import com.jctl.cloud.modules.website.service.problem.ProblemPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 212/20 0020.
 */
@Controller
@RequestMapping(value = "problemPost")
public class WapProblemPostController {
    @Autowired
    private ProblemPostService problemPostService;

    @RequestMapping(value = "postMsg")
    public String postMsg(ProblemPost problemPost){
        System.out.print("提交成功!"+problemPost);
        problemPostService.save(problemPost);
        return "\\modules\\cms\\front\\themes\\basic\\probPost";
    }

    @RequestMapping(value="get")
    public String getJSP(){
        System.out.println("进来了");
        return "\\modules\\cms\\front\\themes\\basic\\probPost";
    }
}
