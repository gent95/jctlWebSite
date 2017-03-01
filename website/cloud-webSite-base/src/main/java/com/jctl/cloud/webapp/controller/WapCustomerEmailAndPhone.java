package com.jctl.cloud.webapp.controller;

import com.jctl.cloud.modules.website.entity.cusemlandphne.CusEmlAndPhe;
import com.jctl.cloud.modules.website.service.cusemlandphne.CusEmlAndPheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@Controller
@RequestMapping(value = "ceap")
public class WapCustomerEmailAndPhone {

    @Autowired
    private CusEmlAndPheService cusEmlAndPheService;

    @RequestMapping(value = "get")
    public String get(HttpServletRequest request){
        List<CusEmlAndPhe> cusEmlAndPhes = cusEmlAndPheService.findList(new CusEmlAndPhe());
        request.getSession().setAttribute("cusEmlAndPhes",cusEmlAndPhes);
        return "\\modules\\cms\\front\\themes\\basic\\service";
    }


}
