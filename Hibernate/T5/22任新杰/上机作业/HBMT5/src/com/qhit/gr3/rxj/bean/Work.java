package com.qhit.gr3.rxj.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 任新杰
 * 2017年12月26日下午5:15:55
 * TODO
 */
public class Work {
	private Integer workid;
	private String wname;
	
	private Set<User> users = new HashSet<User>();

	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Work(Integer workid, String wname, Set<User> users) {
		super();
		this.workid = workid;
		this.wname = wname;
		this.users = users;
	}

	public Integer getWorkid() {
		return workid;
	}

	public void setWorkid(Integer workid) {
		this.workid = workid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
