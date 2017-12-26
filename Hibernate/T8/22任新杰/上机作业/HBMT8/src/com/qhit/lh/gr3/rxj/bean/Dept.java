package com.qhit.lh.gr3.rxj.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 任新杰
 *2017年12月25日上午9:33:37
 *TODO
 */
public class Dept {
	private Integer deptId;
	private String deptName;
	private String address;
	
	//一对多
	private Set<Emp> emps = new HashSet<>();

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(Integer deptId, String deptName, String address, Set<Emp> emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
		this.emps = emps;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	
}
