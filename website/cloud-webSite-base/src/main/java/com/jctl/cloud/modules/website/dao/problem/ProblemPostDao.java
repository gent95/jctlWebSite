/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/smartcity">JeeSite</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.dao.problem;

import com.jctl.cloud.common.persistence.CrudDao;
import com.jctl.cloud.common.persistence.annotation.MyBatisDao;
import com.jctl.cloud.modules.website.entity.problem.ProblemPost;

/**
 * 问题提交DAO接口
 * @author mjt
 * @version 2016-12-22
 */
@MyBatisDao
public interface ProblemPostDao extends CrudDao<ProblemPost> {
	
}