package com.qhit.gr3.rxj.t1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.gr3.rxj.t1.dao.BaseDao;
import com.qhit.gr3.rxj.t1.utils.HibernateSessionFactory;

/**
 * @author ���½�
 *2017-12-12����10:29:59TODO
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2.��������
		Transaction tx = session.beginTransaction();
		//3.ִ��
		session.save(obj);
		//4���ύ����
		tx.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.wjk.t1.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2.��������
		Transaction tx = session.beginTransaction();
		//3.ִ��
		session.save(obj);
		//4���ύ����
		tx.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.wjk.t1.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2.��������
		Transaction tx = session.beginTransaction();
		//3.ִ��
		session.save(obj);
		//4���ύ����
		tx.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();

	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.grs.wjk.t1.dao.BaseDao#getAll(java.lang.Object)
	 */
	@Override
	public List<Object> getAll(String fromObject) {
		//1,��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2.��������
		Transaction tx = session.beginTransaction();
		//3.��ȡ��ѯ������
		Query query = session.createQuery(fromObject);
		List<Object> list = query.list();
		//4���ύ����
		tx.commit();
		//5���ͷ���Դ
		HibernateSessionFactory.closeSession();
		return list;
	}

}
