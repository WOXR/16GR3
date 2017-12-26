package com.qhit.lh.gr3.rxj.t8;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.rxj.bean.Emp;
import com.qhit.lh.gr3.rxj.service.BaseService;
import com.qhit.lh.gr3.rxj.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author 任新杰
 *2017年12月25日上午10:52:04
 *TODO
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void getEmpLikeName(){
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//通过session创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("empName", "张%"));
		//3.通过criteria条件查询器进行查询
		List<Emp> list = criteria.list();
		//4.遍历输出
		for(Emp emp : list){
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
	}
		@Test
	public void getEmpByDeptName(){
		//1.获取session对象
		Session session = HibernateSessionFactory.getSession();
		//通过session创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.deptName", "政治部"));
		//3.通过criteria条件查询器进行查询
		List<Emp> list = criteria.list();
		//4.遍历输出
		for(Emp emp : list){
			System.out.println(emp.getEid()+":"+emp.getEmpName());
		}
	}
}
