package com.qhit.lh.gr3.rxj.dao;

import java.util.List;

/**
 * @author ���½�
 * 2017-12-31����3:49:36
 * TODO
 */
public interface BaseDao {
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
	 * @param obj
	 * @param id
	 * @return
	 * ����idȥ��
	 */
	public Object getObjectById(Object object, int id);
}