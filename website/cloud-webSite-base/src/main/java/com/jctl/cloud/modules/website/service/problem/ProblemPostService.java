/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/station">station</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.service.problem;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.service.CrudService;
import com.jctl.cloud.modules.website.entity.problem.ProblemPost;
import com.jctl.cloud.modules.website.dao.problem.ProblemPostDao;

/**
 * 问题提交Service
 * @author mjt
 * @version 2016-12-22
 */
@Service
@Transactional(readOnly = true)
public class ProblemPostService extends CrudService<ProblemPostDao, ProblemPost> {

	public ProblemPost get(String id) {
		return super.get(id);
	}
	
	public List<ProblemPost> findList(ProblemPost problemPost) {
		return super.findList(problemPost);
	}
	
	public Page<ProblemPost> findPage(Page<ProblemPost> page, ProblemPost problemPost) {
		return super.findPage(page, problemPost);
	}
	
	@Transactional(readOnly = false)
	public void save(ProblemPost problemPost) {
		super.save(problemPost);
	}
	
	@Transactional(readOnly = false)
	public void delete(ProblemPost problemPost) {
		super.delete(problemPost);
	}
	
}