package com.jctl.cloud.api.led;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

@Controller
@RequestMapping(value = "${adminPath}/cms/led")
public class LedControllerVersion1 {


    @RequestMapping("led")
    public String index(){
        return "led/led";
    }

}
