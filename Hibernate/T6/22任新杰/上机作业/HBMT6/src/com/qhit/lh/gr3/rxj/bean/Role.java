package com.qhit.lh.gr3.rxj.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ÈÎÐÂ½Ü
 * 2017-12-29ÏÂÎç1:09:51
 * TODO
 */
public class Role {
	private Integer rid;
	private String rname;
	private String memo;
	private Set users = new HashSet(0);
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer rid, String rname, String memo, Set users) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.memo = memo;
		this.users = users;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Set getUsers() {
		return users;
	}
	public void setUsers(Set users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", memo=" + memo
				+ ", users=" + users + "]";
	}
	
}
