package com.qhit.lh.gr3.rxj.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.rxj.dao.BaseDao;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author ���½�
 * 2017-12-31����3:50:50
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
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();	
						
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#delete(java.lang.Object)
	 */
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
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();

	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#update(java.lang.Object)
	 */
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
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();

	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.hb_t1.dao.BaseDao#query(java.lang.String)
	 */
	@Override
	public List<Object> query(String formtable) {
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();	
		//��������transaction
		Transaction transaction = session.beginTransaction();
		//��ȡ��ѯ����
		Query query = session.createQuery(formtable);
		//��ȡ����
		List<Object> list = query.list();
		//�ύ����
		transaction.commit();	
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();		
		//���ز���
		return list;								
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.cj.t2.dao.BaseDao#getObjectById(java.lang.Object, int)
	 */
	@Override
	public Object getObjectById(Object object, int id) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2����������
		Transaction ts = session.beginTransaction();
		//3����ȡ��ѯ������
		object = session.get(object.getClass(), id);
		//4,�ύ����
		ts.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();
		return object;
	}
	


}