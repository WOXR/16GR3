package com.qhit.gr3.rxj.bean;

/**
 * @author 任新杰
 * 2017年12月26日下午5:11:00
 * TODO
 */
public class Account {
	private Integer aid;
	private String uname;
	private String password;
	
	private User user;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer aid, String uname, String password, User user) {
		super();
		this.aid = aid;
		this.uname = uname;
		this.password = password;
		this.user = user;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
