package edu.tsinghua.biz;

import edu.tsinghua.bean.User;
import edu.tsinghua.dao.UserDao;



public class UserBiz {

	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user){
		return userDao.login(user);
	}
	
}
