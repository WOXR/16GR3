package com.qhit.lh.gr3.rxj.service.impl;

import java.util.List;

import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.rxj.service.BaseService;



public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	public void add(Object obj) {
		baseDao.add(obj);
	}

	public void delete(Object obj) {
		baseDao.delete(obj);
	}

	public void update(Object obj) {
		baseDao.update(obj);
	}

	public List<Object> queryAll(String tableName) {
		return baseDao.queryAll(tableName);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
