package com.zll.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zll.action.LoginAction;

public class SimpleInterceptor extends AbstractInterceptor {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		LoginAction action = (LoginAction) arg0.getAction();
		System.out.println(name + "拦截器动作--------开始登陆Action的时间为" + new Date());
		long start = System.currentTimeMillis();
		String result = arg0.invoke();
		System.out.println(name+"拦截器动作==========执行完Action的时间为"+new Date());
		long end = System.currentTimeMillis();
		System.out.println("一共用了"+(end-start)+"毫秒");
		System.out.println(result);
		// TODO Auto-generated method stub
		return result;
	}

}
