package usertest.com.qhit.rxj;

import com.qhit.gr3.rxj.t1.bean.User;
import com.qhit.gr3.rxj.t1.services.BaseService;
import com.qhit.gr3.rxj.t1.services.impl.BaseServiceImpl;

/**
 * @author���½�
 *2017-12-12����11:53:49TODO
 */
public class UserTest {
	private BaseService baseService = new BaseServiceImpl();
	public void addTest() {
		//ʵ��������
		User user = new User();
		user.setUname("admin");
		user.setPassword("123456");
		user.setSex("F");
		user.setEducation("����");
		//���ݲ���
		baseService.add(user);
	}

}

