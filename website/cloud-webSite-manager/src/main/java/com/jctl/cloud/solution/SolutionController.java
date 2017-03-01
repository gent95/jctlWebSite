/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jctl.cloud.solution;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jctl.cloud.navlist.NavListService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jctl.cloud.common.config.Global;
import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.web.BaseController;
import com.jctl.cloud.common.utils.StringUtils;

import java.util.Date;

/**
 * 解决方案Controller
 * @author ll
 * @version 2016-12-20
 */
@Controller
@RequestMapping(value = "${adminPath}/website/solution/solution")
public class SolutionController extends BaseController {

	@Autowired
	private SolutionService solutionService;
	@Autowired
	private NavListService navListService;
	@ModelAttribute
	public Solution get(@RequestParam(required = false) String id) {
		Solution entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = solutionService.get(id);
		}
		if (entity == null) {
			entity = new Solution();
		}
		return entity;
	}

	@RequiresPermissions("website:solution:solution:view")
	@RequestMapping(value = {"list", ""})
	public String list(Solution solution, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Solution> page = solutionService.findPage(new Page<Solution>(request, response), solution);
		model.addAttribute("page", page);
		return "modules/website/solution/solutionList";
	}

	@RequiresPermissions("website:solution:solution:view")
	@RequestMapping(value = "form")
	public String form(Solution solution, Model model) {
		model.addAttribute("solution", solution);
		return "modules/website/solution/solutionForm";
	}

	@RequiresPermissions("website:solution:solution:edit")
	@RequestMapping(value = "save")
	public String save(Solution solution, Model model, RedirectAttributes redirectAttributes) {
		try{
			if (!beanValidator(model, solution)) {
				return form(solution, model);
			}
			if (solution.getIsNewRecord()) {
				solution.setAddTime(new Date());
			} else {
				solution.setUpdateTime(new Date());
			}
			solutionService.save(solution);
			addMessage(redirectAttributes, "保存解决方案成功");
		}catch (Exception e){e.printStackTrace();}

		return "redirect:" + Global.getAdminPath() + "/website/solution/solution/?repage";
	}

	@RequiresPermissions("website:solution:solution:edit")
	@RequestMapping(value = "delete")
	public String delete(Solution solution, RedirectAttributes redirectAttributes) {
		solutionService.delete(solution);
		addMessage(redirectAttributes, "删除解决方案成功");
		return "redirect:" + Global.getAdminPath() + "/website/solution/solution/?repage";
	}


}