package com.qhit.lh.gr3.rxj.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	//�����Ӧ�������
	private String content;
	//��ȡ���ύ������
	private String uname;
	
	@Override
	public String execute() throws Exception {
		content = "���"+uname;
		
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