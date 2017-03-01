package com.jctl.cloud.modules.website.dao.navlist;

import com.jctl.cloud.common.persistence.TreeDao;
import com.jctl.cloud.common.persistence.annotation.MyBatisDao;
import com.jctl.cloud.modules.website.entity.navlist.NavList;

import java.util.List;

/**
 * 导航DAO接口
 * @author kay
 * @version 2016-12-13
 */
@MyBatisDao
public interface NavListDao extends TreeDao<NavList> {

    List<NavList> getNavList();

    List getByParentId(String id);
}