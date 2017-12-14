package com.qhit.lh.woxr.t2.dao;

import java.util.List;

/**
 * @author 任新杰
 *2017-12-12上午10:28:32TODO
 */
public interface BaseDao {
	
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * @param obj
	 * @return
	 * 查
	 */
	public List<Object> getAll(String fromObject);
}
