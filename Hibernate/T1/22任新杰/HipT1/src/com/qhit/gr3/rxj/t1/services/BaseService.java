package com.qhit.gr3.rxj.t1.services;

import java.util.List;

public interface BaseService {

	/**
	 * @param obj
	 * Ôö
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * É¾
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * ¸Ä
	 */
	public void update(Object obj);
	
	/**
	 * @param obj
	 * @return
	 * ²é
	 */
	public List<Object> getAll(String fromObject);
}
