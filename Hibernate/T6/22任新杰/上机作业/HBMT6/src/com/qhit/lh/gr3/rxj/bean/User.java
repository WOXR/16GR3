package com.qhit.lh.gr3.rxj.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ÈÎÐÂ½Ü
 * 2017-12-29ÏÂÎç1:13:37
 * TODO
 */
public class User {
	private Integer uid;
	private String uname;
	private String password;
	private Set roles = new HashSet(0);
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String password, Set roles) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.roles = roles;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set getRoles() {
		return roles;
	}
	public void setRoles(Set roles) {
		this.roles = roles;
	}
	
	
}
