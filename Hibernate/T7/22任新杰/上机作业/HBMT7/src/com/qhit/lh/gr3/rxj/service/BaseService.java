package com.qhit.lh.gr3.rxj.service;

import java.util.List;


import com.qhit.lh.gr3.rxj.bean.User;

/**
 * @author 任新杰
 * 2017-12-29下午1:34:53
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
	@SuppressWarnings("rawtypes")
	public Object getObjectById(Class clazz, int id);
	/**
	 * @param name
	 * @return
	 * 根据名字模糊查
	 */
	public List<User> getUserByName(String name);
}
