/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/station">station</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.service.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.service.CrudService;
import com.jctl.cloud.modules.website.entity.serve.Serve;
import com.jctl.cloud.modules.website.dao.serve.ServeDao;

/**
 * 服务Service
 * @author msl
 * @version 2016-12-26
 */
@Service
@Transactional(readOnly = true)
public class ServeService extends CrudService<ServeDao, Serve> {

	@Autowired
	private ServeDao serveDao;

	public Serve get(String id) {
		return super.get(id);
	}
	
	public List<Serve> findList(Serve serve) {
		return super.findList(serve);
	}
	
	public Page<Serve> findPage(Page<Serve> page, Serve serve) {
		return super.findPage(page, serve);
	}
	
	@Transactional(readOnly = false)
	public void save(Serve serve) {
		super.save(serve);
	}
	
	@Transactional(readOnly = false)
	public void delete(Serve serve) {
		super.delete(serve);
	}

    public List<Serve> findByNavId(Serve serve) {
		return serveDao.findByNavId(serve);
    }
}