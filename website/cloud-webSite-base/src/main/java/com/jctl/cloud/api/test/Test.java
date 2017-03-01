package com.jctl.cloud.api.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/7 0007.
 */
@Controller
@RequestMapping("test")
public class Test {


    @RequestMapping("tree")
    public String tree() {
        return "test/tree";
    }

    @RequestMapping("table")
    public String table() {
        return "test/table";
    }


    @RequestMapping("alliancePartner")
    public String alliancePartner() {
        return "test/head/font/alliancePartner";
    }
}
