package com.qhit.lh.gr3.rxj.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author ���½�
 * 2017-12-29����1:28:17
 * TODO
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object object) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������transaction
		Transaction transaction = session.beginTransaction();
		//�������
		session.save(object);
		//�ύ����
		transaction.commit();					
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delete(Object object) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();	
		//��������transaction
		Transaction transaction = session.beginTransaction();
		//�������
		session.delete(object);	
		//�ύ����
		transaction.commit();					
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object object) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();			
		//��������transaction
		Transaction transaction = session.beginTransaction();	
		//�������
		session.update(object);		
		//�ύ����
		transaction.commit();				
		HibernateSessionFactory.closeSession();	

	}

	@Override
	public List<Object> query(String formtable) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();		
		//��������transaction
		Transaction transaction = session.beginTransaction();		
		//��ȡ��ѯ����
		Query query = session.createQuery(formtable);	
		@SuppressWarnings("unchecked")
		//��ȡ����
		List<Object> list = query.list();	
		//�ύ����
		transaction.commit();							
		HibernateSessionFactory.closeSession();		
		return list;
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2����������
		Transaction ts = session.beginTransaction();
		//3����ȡ��ѯ������
		Object object = session.get(clazz, id);
		//4,�ύ����
		ts.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();
		return object;
	}

}
