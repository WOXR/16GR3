package com.qhit.lh.gr3.rxj.service;

import java.util.List;

/**
 * @author ���½�
 * 2017-12-31����3:57:10
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
	public Object getObjectById(Object object, int id);
}
