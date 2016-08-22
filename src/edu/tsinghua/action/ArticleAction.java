package edu.tsinghua.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

import edu.tsinghua.bean.Article;
import edu.tsinghua.biz.ArticleBiz;

public class ArticleAction implements Action,SessionAware,ModelDriven<Article> {
	Article article=new Article();
	Map<String,Object> session;
	ArticleBiz articleBiz;
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public ArticleBiz getArticleBiz() {
		return articleBiz;
	}
	public void setArticleBiz(ArticleBiz articleBiz) {
		this.articleBiz = articleBiz;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public Article getModel() {
		// TODO Auto-generated method stub
		return article;
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
	public String deletearticle(){
		articleBiz.deletearticle(article);
		List<Article> nbList=articleBiz.getAllArticle();
		session.put("articleList", nbList);
		return "admin";
	}
	public String addorupdatearticle(){
		if(session.get("onearticle")==null){
			articleBiz.addarticle(article);
			List<Article> nbList=articleBiz.getAllArticle();
			session.put("articleList", nbList);
			return "admin";
		}else{
			articleBiz.updatearticle(article);
			List<Article> nbList=articleBiz.getAllArticle();
			session.put("articleList", nbList);
			session.remove("onearticle");
			return "admin";
		}
	}

}
