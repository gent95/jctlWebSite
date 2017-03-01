package com.jctl.cloud.webapp.controller;

import com.jctl.cloud.modules.website.entity.resourcedownload.ResourceDownload;
import com.jctl.cloud.modules.website.service.resourcedownload.ResourceDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
@Controller
@RequestMapping(value = "resourceDow")
public class WapResourceDownload {

    @Autowired
    private ResourceDownloadService resourceDownloadService;

    @RequestMapping(value = "get")
    public String get(HttpServletRequest request,ResourceDownload resourceDownload){
        List<ResourceDownload> resourceDownloads = resourceDownloadService.findList(resourceDownload);
        request.getSession().setAttribute("resDows",resourceDownloads);
        return "\\modules\\cms\\front\\themes\\basic\\downlist";
    }

    @RequestMapping(value = "downtext")
    public String getDownText(HttpServletRequest request, ResourceDownload resourceDownload){
        request.getSession().setAttribute("resDow",resourceDownloadService.get(resourceDownload));
        return "\\modules\\cms\\front\\themes\\basic\\datadown";
    }
}
