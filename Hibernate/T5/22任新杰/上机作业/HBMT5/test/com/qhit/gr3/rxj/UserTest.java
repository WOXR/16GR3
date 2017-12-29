package com.qhit.gr3.rxj;

import org.junit.Test;

import com.qhit.gr3.rxj.bean.User;
import com.qhit.gr3.rxj.bean.Work;
import com.qhit.gr3.rxj.service.BaseService;
import com.qhit.gr3.rxj.service.impl.BaseServiceImpl;

/**
 * @author 任新杰
 * 2017年12月26日下午5:48:48
 * TODO
 */
public class UserTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		//创建部门
		Work work = new Work();
		work.setWname("政治部");
		//没有员工
		
		//有新员工
		User wjk = new User();
		wjk.setUname("王金康");
		wjk.setSex("M");
		
		work.getUsers().add(wjk);
		
		baseService.add(wjk);
	}
	
	@Test
	public void delete(){
		Work work = (Work) baseService.getObjectById(Work.class, 4);
		
		baseService.delete(work);
	}
	
	@Test
	public void update(){
		Work work = (Work) baseService.getObjectById(Work.class, 2);
		work.setWname("驻美中国大使馆");
		
		baseService.update(work);
	}
	
	@Test
	public void query(){
		Work work = (Work) baseService.getObjectById(Work.class, 7);
		
		for(User user : work.getUsers()){
			System.out.println(user.toString());
		}
	}
}
