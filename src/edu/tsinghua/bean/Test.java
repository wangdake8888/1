package edu.tsinghua.bean;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ParseException {
		//@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf=(SessionFactory) factory.getBean("sessionFactory");
		Session session = sf.openSession();
		// 4.����Transaction ���� ������ɾ�����һ��interface
		Transaction ts = session.beginTransaction();
		//Date fdate = new Date(System.currentTimeMillis());
		User user = new User(1,"admin","admin","admin","123456","123456","�廪��ѧ");
		User user1 = new User(2,"aa","aa","aa","1454648","1454648","������ѧ");
		User user2 = new User(3,"ba","ba","ba","4796468","1454648","�����ѧ");
		
		//Date date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2011-01-20");
		//@SuppressWarnings("deprecation")
		Date date=new Date(System.currentTimeMillis());
        Article article = new Article(1,"����˶��ܸ��Ƽ��⻺���ɳ�","adad","����ʡ�������󷢴�ˮ","2015-8-17");
        Article article1 = new Article(2,"�����ɳ�","4546546 ","���ը��ˮ","2015-8-17");
		session.save(user);
		session.save(user1);
		session.save(user2);
		session.save(article);
		session.save(article1);
		ts.commit();
		session.close();
	}

}

