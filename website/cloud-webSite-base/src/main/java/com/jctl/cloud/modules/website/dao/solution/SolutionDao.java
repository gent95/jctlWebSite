/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/smartcity">JeeSite</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.dao.solution;

import com.jctl.cloud.common.persistence.CrudDao;
import com.jctl.cloud.common.persistence.annotation.MyBatisDao;
import com.jctl.cloud.modules.website.entity.solution.Solution;

/**
 * 解决方案DAO接口
 * @author ll
 * @version 2016-12-20
 */
@MyBatisDao
public interface SolutionDao extends CrudDao<Solution> {

   Solution getSolutionByNavId(Solution navId);

/*   List<Solution> getListByNavId(Solution navId);*/
}