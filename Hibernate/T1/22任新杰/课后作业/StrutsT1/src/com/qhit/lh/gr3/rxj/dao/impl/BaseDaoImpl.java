package com.qhit.lh.gr3.rxj.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author 任新杰
 * 2017-12-31下午3:50:50
 * TODO
 */
public class BaseDaoImpl implements BaseDao {
	@Override
	public void add(Object object) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务transaction
		Transaction transaction = session.beginTransaction();
		//传入参数
		session.save(object);				
		//提交事务
		transaction.commit();
		//释放资源
		HibernateSessionFactory.closeSession();	
						
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object object) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();		
		//开启事务transaction
		Transaction transaction = session.beginTransaction();	
		//传入参数
		session.delete(object);	
		//提交事务
		transaction.commit();		
		//释放资源
		HibernateSessionFactory.closeSession();

	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object object) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();		
		//开启事务transaction
		Transaction transaction = session.beginTransaction();
		//传入参数
		session.update(object);			
		//提交事务
		transaction.commit();	
		//释放资源
		HibernateSessionFactory.closeSession();

	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#query(java.lang.String)
	 */
	@Override
	public List<Object> query(String formtable) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();	
		//开启事务transaction
		Transaction transaction = session.beginTransaction();
		//获取查询对象
		Query query = session.createQuery(formtable);
		//获取数据
		List<Object> list = query.list();
		//提交事务
		transaction.commit();	
		//释放资源
		HibernateSessionFactory.closeSession();		
		//返回参数
		return list;								
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.t2.dao.BaseDao#getObjectById(java.lang.Object, int)
	 */
	@Override
	public Object getObjectById(Object object, int id) {
		//1,获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2，开启事务
		Transaction ts = session.beginTransaction();
		//3，获取查询器对象
		object = session.get(object.getClass(), id);
		//4,提交事务
		ts.commit();
		//5，释放资源
		HibernateSessionFactory.closeSession();
		return object;
	}
	


}