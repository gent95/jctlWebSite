package com.jctl.cloud.api.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by kay on 2016/11/21 0021.
 */
@Controller
@RequestMapping(value = "map")
public class MapControllerVersion1 {


    /**
     * 跳转至百度地图页面
     * @return
     */
    @RequestMapping("baiDuMap")
    public String baiDuMap(){
        return "common/map/map";
    }
}
