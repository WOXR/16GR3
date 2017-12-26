package com.qhit.lh.gr3.rxj.t8;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.rxj.bean.User;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author 任新杰
 *2017年12月25日上午11:29:22
 *TODO
 */
public class UserTest {
	@Test
	public void login(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(User.class)
				.add(Restrictions.eq("userName", ""))
				.add(Restrictions.eq("password", ""));
		
		List<User> list = criteria.list();
		
		if(list != null && list.size()>0){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
	}
}
