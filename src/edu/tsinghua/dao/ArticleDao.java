package edu.tsinghua.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.tsinghua.bean.Article;

public class ArticleDao extends BaseDao{
	public List<Article> getAllArticle(){
		Session session=getSession();
		String hql="from Article";
		Query query=session.createQuery(hql);
		List<Article> npList=query.list();
		session.close();
		return npList;
	}
	public int deletearticle(Article article){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.delete(article);
			transaction.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}
	public Article getOnearticle(int id){
		Session session=getSession();
		
		String hql="from Article where articleId=:articleId";
		Query query=session.createQuery(hql);
		query.setInteger("articleId", id);
		List<Article> npList=query.list();
		//session.close();
		if(npList.size()>0){
			return npList.get(0);
		}else{
			return null;
		}
		
		
	}
	public int addarticle(Article article){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(article);
			transaction.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	public int updatearticle(Article article){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.update(article);
			transaction.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
}
