package edu.tsinghua.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import edu.tsinghua.bean.User;

import edu.tsinghua.biz.UserBiz;

public class LoginAction implements Action,SessionAware,ModelDriven<User>{

	private User user=new User();
	Map<String,Object> session;
	UserBiz userBiz; 

	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String login(){
		User user1=userBiz.login(user);
		;
		
		if(user1.getUserId()>0){
			if("admin".equals(user1.getUserName())&&"admin".equals(user1.getPassWord())){
				
				return "admin";
			}else{
				return "customer";
			}
			
			
		}else{
			return LOGIN;
		}
		
	}
	

}
