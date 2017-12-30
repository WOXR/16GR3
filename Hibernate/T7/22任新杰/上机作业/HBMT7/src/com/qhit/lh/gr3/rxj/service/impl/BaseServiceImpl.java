package com.qhit.lh.gr3.rxj.service.impl;

import java.util.List;

import com.qhit.lh.gr3.rxj.bean.User;
import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.rxj.service.BaseService;

/**
 * @author ���½�
 * 2017-12-29����1:40:23
 * TODO
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	/**
	 * ���
	 */
	@Override
	public void add(Object object) {
		baseDao.add(object);
	}
	/**
	 * ɾ��
	 */
	@Override
	public void delete(Object object) {
		baseDao.delete(object);
	}
	/**
	 * �޸�
	 */
	@Override
	public void update(Object object) {
		baseDao.update(object);
	}
	/**
	 * ��ѯ
	 */
	@Override
	public List<Object> query(String formtable) {
		return baseDao.query(formtable);
	}
	/**
	 * ����idȥ��
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
