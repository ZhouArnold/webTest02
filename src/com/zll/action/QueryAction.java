package com.zll.action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zll.biz.QueryList;

public class QueryAction extends ActionSupport {
	private String count;

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
	public String queryAction(){
		ActionContext ctx = ActionContext.getContext();
		int c=Integer.parseInt(count);
		String sql = "select * from cust limit ?";
		List ls=null;
		QueryList ql = new QueryList();
		try {
			ls= ql.doQuery(sql,c);
			ctx.put("list", ls);
			return SUCCESS;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		return ERROR;
	}
	
}
