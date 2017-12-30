package com.qhit.lh.gr3.rxj.service;

import java.util.List;


import com.qhit.lh.gr3.rxj.bean.User;

/**
 * @author ���½�
 * 2017-12-29����1:34:53
 * TODO
 */
public interface BaseService {
	/**
	 * 
	 * @param object
	 * �������
	 */
	public void add(Object object);
	/**
	 * 
	 * @param object
	 * ɾ������
	 */
	public void delete(Object object);
	/**
	 * 
	 * @param object
	 * �޸�����
	 */
	public void update(Object object);
	/**
	 * 
	 * @param formtable
	 * @return
	 * ��ѯ����
	 */
	public List<Object> query(String formtable);
	
	/**
	 * @param Object
	 * @param id
	 * @return
	 * ����idȥ��
	 */
	@SuppressWarnings("rawtypes")
	public Object getObjectById(Class clazz, int id);
	/**
	 * @param name
	 * @return
	 * ��������ģ����
	 */
	public List<User> getUserByName(String name);
}
