package com.qhit.lh.woxr.t2.bean;

/**
 * @author任新杰
 *2017-12-12下午10:57:56TODO
 */
public class Emp {
	private int eid;
	private String empName;
	private String empSex;
	private String birthday;
	private int deptId;
	//一对一关系映射
	private User user;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String empName, String empSex, String birthday,
			int deptId, User user) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empSex = empSex;
		this.birthday = birthday;
		this.deptId = deptId;
		this.user = user;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSex() {
		return empSex;
	}
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
