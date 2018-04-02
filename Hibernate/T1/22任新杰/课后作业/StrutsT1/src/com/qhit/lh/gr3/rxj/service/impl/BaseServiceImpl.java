package com.qhit.lh.gr3.rxj.service.impl;

import java.util.List;

import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.rxj.service.BaseService;

/**
 * @author ÈÎÐÂ½Ü
 * 2017-12-31ÏÂÎç3:59:00
 * TODO
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object object) {
		baseDao.add(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object object) {
		baseDao.delete(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object object) {
		baseDao.update(object);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.service.BaseService#query(java.lang.String)
	 */
	@Override
	public List<Object> query(String formtable) {
		return baseDao.query(formtable);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.t2.service.BaseService#getObjectById(java.lang.Object, int)
	 */
	@Override
	public Object getObjectById(Object object, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(object, id);
	}

}