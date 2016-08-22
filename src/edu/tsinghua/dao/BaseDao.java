package edu.tsinghua.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class BaseDao {

	
	private  SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

	public Session getSession(){
		
	
		
		return sessionFactory.openSession();
	}
	
	/**
	 * ÊÍ·Å×ÊÔ´
	 * */
	public void closeSession(Session session){
		if(session!=null){
			
			session.close();
		}
	}
}
