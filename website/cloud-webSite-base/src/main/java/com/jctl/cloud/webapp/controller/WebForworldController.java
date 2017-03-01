package com.jctl.cloud.webapp.controller;

import com.jctl.cloud.modules.cms.entity.Site;
import com.jctl.cloud.modules.cms.utils.CmsUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dream on 2016/12/20.
 */
@Controller
@RequestMapping("forworld")
public class WebForworldController {

    @RequestMapping("AgrInternet")
    public String AgrInternet(){
        Site site = CmsUtils.getSite(Site.defaultSiteId());
        return "modules/cms/front/themes/"+site.getTheme()+"/prdRef";
    }
}
