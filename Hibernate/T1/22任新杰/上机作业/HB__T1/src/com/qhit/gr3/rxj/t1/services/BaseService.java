package com.qhit.gr3.rxj.t1.services;

import java.util.List;

public interface BaseService {

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
