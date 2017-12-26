package com.qhit.lh.gr3.rxj.t8;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.rxj.bean.Emp;
import com.qhit.lh.gr3.rxj.util.HibernateSessionFactory;

/**
 * @author 任新杰
 *2017年12月25日上午11:02:06
 *TODO
 */
public class DeptTest {
	/**
	 * 查询每个部门的员工人数，显示出部门信息和人数
	 */
	@Test
	public void getDeptInfo(){
		//1.获取session对象
			Session session = HibernateSessionFactory.getSession();
			//通过session创建criteria条件查询器
			Criteria criteria = session.createCriteria(Emp.class)
					.setFetchMode("emps", FetchMode.JOIN)
					.createAlias("emps", "e");
			
			//设置分组条件和查询结果
			ProjectionList proList = Projections.projectionList()
					.add(Projections.groupProperty("deptId"))
					.add(Projections.groupProperty("deptName"))
					.add(Projections.groupProperty("address"))
					.add(Projections.count("e.eid"));
			//关联条件查询器和结果
			criteria.setProjection(proList);
			//3.通过criteria条件查询器进行查询
			List<Object[]> list = criteria.list();
			//4.遍历输出
			for (Object[] obj : list) {
				System.out.println(""+obj[0]+obj[1]+obj[2]+obj[3]);
			}
	}
}
