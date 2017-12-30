package com.qhit.lh.gr3.rxj.service.impl;

import java.util.List;

import com.qhit.lh.gr3.rxj.bean.User;
import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.rxj.service.BaseService;

/**
 * @author 任新杰
 * 2017-12-29下午1:40:23
 * TODO
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	/**
	 * 添加
	 */
	@Override
	public void add(Object object) {
		baseDao.add(object);
	}
	/**
	 * 删除
	 */
	@Override
	public void delete(Object object) {
		baseDao.delete(object);
	}
	/**
	 * 修改
	 */
	@Override
	public void update(Object object) {
		baseDao.update(object);
	}
	/**
	 * 查询
	 */
	@Override
	public List<Object> query(String formtable) {
		return baseDao.query(formtable);
	}
	/**
	 * 根据id去查
	 */
	@Override
	public Object getObjectById(Class clazz, int id) {
		return baseDao.getObjectById(clazz, id);
	}
	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
