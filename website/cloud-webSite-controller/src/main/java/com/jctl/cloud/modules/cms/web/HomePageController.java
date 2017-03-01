package com.jctl.cloud.modules.cms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jctl.cloud.common.web.BaseController;

@Controller
@RequestMapping(value = "${adminPath}/cms/home")
public class HomePageController extends BaseController {
	@RequestMapping("/got")
	public  String  durp(){
		return  "modules/cms/homePage";
	}


}
