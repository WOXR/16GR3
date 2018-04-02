package com.qhit.lh.gr3.rxj.service;

import java.util.List;

/**
 * @author 任新杰
 * 2017-12-31下午3:57:10
 * TODO
 */
public interface BaseService {
	/**
	 * 
	 * @param object
	 * 添加数据
	 */
	public void add(Object object);
	/**
	 * 
	 * @param object
	 * 删除数据
	 */
	public void delete(Object object);
	/**
	 * 
	 * @param object
	 * 修改数据
	 */
	public void update(Object object);
	/**
	 * 
	 * @param formtable
	 * @return
	 * 查询数据
	 */
	public List<Object> query(String formtable);
	
	/**
	 * @param Object
	 * @param id
	 * @return
	 * 根据id去查
	 */
	public Object getObjectById(Object object, int id);
}
