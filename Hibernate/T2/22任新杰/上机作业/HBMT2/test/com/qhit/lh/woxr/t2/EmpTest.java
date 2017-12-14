package com.qhit.lh.woxr.t2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.woxr.t2.bean.Emp;
import com.qhit.lh.woxr.t2.bean.User;
import com.qhit.lh.woxr.t2.services.BaseService;
import com.qhit.lh.woxr.t2.services.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	/**
	 * 添加员工，并分配一个用户
	 */
	@Test
	public void add() {
		//声明员工对象
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		
		//分配一个账户
		User user = new User();
		user.setUserName("tom");
		user.setPassWord("123456");
		//建立一对一关系
		emp.setUser(user);//指定当前员工的账户
		user.setEmp(emp);//指定当前当前账户所属的员工
		
		//级联操作
		baseService.add(emp);
		
		}
	public void delete() {
		
	}
	public void update() {
	
	}
	public void query() {
	
	}

}
