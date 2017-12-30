package com.qhit.lh.gr3.rxj.t6;

import java.util.List;

import com.qhit.lh.gr3.rxj.bean.Role;
import com.qhit.lh.gr3.rxj.bean.User;
import com.qhit.lh.gr3.rxj.service.BaseService;
import com.qhit.lh.gr3.rxj.service.impl.BaseServiceImpl;

/**
 * @author ���½�
 * 2017-12-30����5:45:55
 * TODO
 */
public class Test {
	private BaseService baseservice = new BaseServiceImpl();

	@SuppressWarnings("unchecked")
	@Test
	public void add() {
		Role role = new Role();

		role.setRname("���Ÿ�����");
		role.setMemo("������");

		User user1 = (User) baseservice.getObjectById(User.class, 1);
		User user2 = (User) baseservice.getObjectById(User.class, 2);

		role.getUsers().add(user1);
		role.getUsers().add(user2);

		baseservice.add(role);
	}

	@Test
	public void delete() {
		Role role = (Role) baseservice.getObjectById(Role.class, 7);
		baseservice.delete(role);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void update() {
		Role role = (Role) baseservice.getObjectById(Role.class, 8);

		role.setMemo("��������Ա");

		User user1 = (User) baseservice.getObjectById(User.class, 3);
		User user2 = (User) baseservice.getObjectById(User.class, 4);

		role.getUsers().add(user1);
		role.getUsers().add(user2);
		baseservice.update(role);
	}

	@Test
	public void query() {
		List<User> list = (List) baseservice.query("from User");
		for (User user : list) {
			System.out.println(user.toString());
		}
	}

	@Test
	public void getRole() {
		Role role = (Role) baseservice.getObjectById(Role.class, 3);
		System.out.println(role.toString());
		System.out.println("������˺�");
		for (Object object : role.getUsers()) {
			System.out.println(object.toString());
		}
	}

	@Test
	public void getUser() {
		User user = (User) baseservice.getObjectById(User.class, 1);
		System.out.println(user.toString());
		System.out.println("����Ľ�ɫ");
		for (Object object : user.getRoles()) {
			System.out.println(object.toString());
		}
	}
	
	//��������ģ����
		@Test
		public void getUserByName(){
			List<User> list=baseservice.getUserByName("%1%");
			for(User user : list){
				System.out.println(user.getUid()+":"+user.getUname());
				
			}
		}
}