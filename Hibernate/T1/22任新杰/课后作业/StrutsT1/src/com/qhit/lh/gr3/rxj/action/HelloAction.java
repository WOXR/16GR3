package com.qhit.lh.gr3.rxj.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	//保存回应结果数据
	private String content;
	//获取表单提交的数据
	private String uname;
	
	@Override
	public String execute() throws Exception {
		content = "你好"+uname;
		
		return Action.SUCCESS ;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}
			
}