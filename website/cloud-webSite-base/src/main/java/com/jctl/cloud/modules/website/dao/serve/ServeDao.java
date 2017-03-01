/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/smartcity">JeeSite</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.dao.serve;

import com.jctl.cloud.common.persistence.CrudDao;
import com.jctl.cloud.common.persistence.annotation.MyBatisDao;
import com.jctl.cloud.modules.website.entity.serve.Serve;

import java.util.List;

/**
 * 服务DAO接口
 * @author msl
 * @version 2016-12-26
 */
@MyBatisDao
public interface ServeDao extends CrudDao<Serve> {

    List<Serve> findByNavId(Serve serve);
}