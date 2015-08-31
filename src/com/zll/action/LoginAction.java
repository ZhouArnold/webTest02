package com.zll.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zll.biz.QueryList;

public class LoginAction extends ActionSupport{
	private String count;
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		
//		System.out.println(getUsername());
//		System.out.println(getPassword());
		
		if("abc".equals(username)&&"123".equals(password)){
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("user", username);
			return SUCCESS;
		}
		return ERROR;
			
			
			
		
	}
}
