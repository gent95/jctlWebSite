/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/station">station</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.service.webdict;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.service.CrudService;
import com.jctl.cloud.modules.website.entity.webdict.WebSiteDict;
import com.jctl.cloud.modules.website.dao.webdict.WebSiteDictDao;

/**
 * 字典Service
 * @author kay
 * @version 2016-12-13
 */
@Service
@Transactional(readOnly = true)
public class WebSiteDictService extends CrudService<WebSiteDictDao, WebSiteDict> {

	public WebSiteDict get(String id) {
		return super.get(id);
	}
	
	public List<WebSiteDict> findList(WebSiteDict webSiteDict) {
		return super.findList(webSiteDict);
	}
	
	public Page<WebSiteDict> findPage(Page<WebSiteDict> page, WebSiteDict webSiteDict) {
		return super.findPage(page, webSiteDict);
	}
	
	@Transactional(readOnly = false)
	public void save(WebSiteDict webSiteDict) {
		super.save(webSiteDict);
	}
	
	@Transactional(readOnly = false)
	public void delete(WebSiteDict webSiteDict) {
		super.delete(webSiteDict);
	}
	
}