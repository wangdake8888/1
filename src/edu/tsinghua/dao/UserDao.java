package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.tsinghua.bean.User;


public class UserDao extends BaseDao{

	//µÇÂ½
	public User login(User user){
		Session session=getSession();
		String hql="from User where userName=:name and passWord=:pwd";
		Query query=session.createQuery(hql);
		query.setString("name", user.getUserName());
		query.setString("pwd", user.getPassWord());
		
		List<User> lu=query.list();
		closeSession(session);
		if(lu.size()==0){
			return null;
		}else{
			return lu.get(0);
		}
		
	}
	//
	
	
	
	
	
	
	
	
	
	
	
}
