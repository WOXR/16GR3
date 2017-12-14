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
	 * ���Ա����������һ���û�
	 */
	@Test
	public void add() {
		//����Ա������
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		
		//����һ���˻�
		User user = new User();
		user.setUserName("tom");
		user.setPassWord("123456");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ��ǰ�˻�������Ա��
		
		//��������
		baseService.add(emp);
		
		}
	public void delete() {
		
	}
	public void update() {
	
	}
	public void query() {
	
	}

}
