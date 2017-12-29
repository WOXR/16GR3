package com.qhit.gr3.rxj.bean;

/**
 * @author 任新杰
 * 2017年12月26日下午5:13:37
 * TODO
 */
public class User {
	private Integer uid;
	private String uname;
	private String sex;
	private Integer workid;
	
	private Account account;
	private Work work;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String sex, Integer workid,
			Account account, Work work) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.sex = sex;
		this.workid = workid;
		this.account = account;
		this.work = work;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getWorkid() {
		return workid;
	}
	public void setWorkid(Integer workid) {
		this.workid = workid;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Work getWork() {
		return work;
	}
	public void setWork(Work work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", sex=" + sex
				+ ", workid=" + workid + ", account=" + account + ", work="
				+ work + "]";
	}
	
	
}
