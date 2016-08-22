package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;


public class AllAction implements Action,SessionAware{

	Map<String,Object> session;
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
