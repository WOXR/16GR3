package com.qhit.lh.woxr.t2.bean;

public class User {
	private int userId;
	private String userName;
	private String passWord;
	
	private  Emp emp;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String passWord, Emp emp) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.emp = emp;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
}
