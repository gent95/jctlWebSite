package com.jctl.cloud.web;

//import com.jctl.station.modules.website.entity.recruit.Recruit;
//import com.jctl.station.modules.website.service.recruit.RecruitService;
//import org.springframework.beans.factory.annotation.Autowired;
import com.jctl.cloud.joinus.JoinUs;
import com.jctl.cloud.joinus.JoinUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
@Controller
@RequestMapping(value = "joinus")
public class WapJoinUsController {

    @Autowired
  //  private RecruitService recruitService;
    private JoinUsService joinUsService;
    @RequestMapping(value = "get")
    public String get(HttpServletRequest request){
        List<JoinUs> JoinUsList = joinUsService.findList(new JoinUs());
        request.getSession().setAttribute("JoinUsList",JoinUsList);
        return "modules/cms/front/themes/basic/joinus/recriuit";
    }
    @RequestMapping(value = "detail")
    public String detail(HttpServletRequest request,String id){
        JoinUs joinus=joinUsService.get(id);
        request.getSession().setAttribute("joinUs",joinus);
        return "modules/cms/front/themes/basic/joinus/detail";
    }
}
