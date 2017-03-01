/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/jctl/station">station</a> All rights reserved.
 */
package com.jctl.cloud.modules.website.service.cusemlandphne;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.common.service.CrudService;
import com.jctl.cloud.modules.website.entity.cusemlandphne.CusEmlAndPhe;
import com.jctl.cloud.modules.website.dao.cusemlandphne.CusEmlAndPheDao;

/**
 * 客户电话和邮箱管理Service
 * @author mjt
 * @version 2016-12-26
 */
@Service
@Transactional(readOnly = true)
public class CusEmlAndPheService extends CrudService<CusEmlAndPheDao, CusEmlAndPhe> {

	public CusEmlAndPhe get(String id) {
		return super.get(id);
	}
	
	public List<CusEmlAndPhe> findList(CusEmlAndPhe cusEmlAndPhe) {
		return super.findList(cusEmlAndPhe);
	}
	
	public Page<CusEmlAndPhe> findPage(Page<CusEmlAndPhe> page, CusEmlAndPhe cusEmlAndPhe) {
		return super.findPage(page, cusEmlAndPhe);
	}
	
	@Transactional(readOnly = false)
	public void save(CusEmlAndPhe cusEmlAndPhe) {
		super.save(cusEmlAndPhe);
	}
	
	@Transactional(readOnly = false)
	public void delete(CusEmlAndPhe cusEmlAndPhe) {
		super.delete(cusEmlAndPhe);
	}
	
}