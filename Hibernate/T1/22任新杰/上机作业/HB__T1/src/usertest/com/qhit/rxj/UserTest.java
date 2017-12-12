package usertest.com.qhit.rxj;

import com.qhit.gr3.rxj.t1.bean.User;
import com.qhit.gr3.rxj.t1.services.BaseService;
import com.qhit.gr3.rxj.t1.services.impl.BaseServiceImpl;

/**
 * @author任新杰
 *2017-12-12上午11:53:49TODO
 */
public class UserTest {
	private BaseService baseService = new BaseServiceImpl();
	public void addTest() {
		//实例化对象
		User user = new User();
		user.setUname("admin");
		user.setPassword("123456");
		user.setSex("F");
		user.setEducation("本科");
		//数据操作
		baseService.add(user);
	}

}

