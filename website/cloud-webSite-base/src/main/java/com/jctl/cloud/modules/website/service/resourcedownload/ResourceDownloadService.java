/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/station">station</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.service.resourcedownload;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.service.CrudService;
import com.jctl.cloud.modules.website.entity.resourcedownload.ResourceDownload;
import com.jctl.cloud.modules.website.dao.resourcedownload.ResourceDownloadDao;

/**
 * 资源下载Service
 * @author mjt
 * @version 2016-12-26
 */
@Service
@Transactional(readOnly = true)
public class ResourceDownloadService extends CrudService<ResourceDownloadDao, ResourceDownload> {

	public ResourceDownload get(String id) {
		return super.get(id);
	}
	
	public List<ResourceDownload> findList(ResourceDownload resourceDownload) {
		return super.findList(resourceDownload);
	}
	
	public Page<ResourceDownload> findPage(Page<ResourceDownload> page, ResourceDownload resourceDownload) {
		return super.findPage(page, resourceDownload);
	}
	
	@Transactional(readOnly = false)
	public void save(ResourceDownload resourceDownload) {
		super.save(resourceDownload);
	}
	
	@Transactional(readOnly = false)
	public void delete(ResourceDownload resourceDownload) {
		super.delete(resourceDownload);
	}
	
}