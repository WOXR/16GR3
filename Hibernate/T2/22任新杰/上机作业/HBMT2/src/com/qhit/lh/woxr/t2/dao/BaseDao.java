package com.qhit.lh.woxr.t2.dao;

import java.util.List;

/**
 * @author ���½�
 *2017-12-12����10:28:32TODO
 */
public interface BaseDao {
	
	/**
	 * @param obj
	 * ��
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * ɾ
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * ��
	 */
	public void update(Object obj);
	
	/**
	 * @param obj
	 * @return
	 * ��
	 */
	public List<Object> getAll(String fromObject);
}
