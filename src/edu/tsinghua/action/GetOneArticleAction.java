package edu.tsinghua.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

import edu.tsinghua.bean.Article;
import edu.tsinghua.biz.ArticleBiz;

public class GetOneArticleAction implements Action,SessionAware{
	int articleId;
	Map<String,Object> session;
	ArticleBiz articleBiz;
	

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
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
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
    public String getonearticle(){
    	Article article=articleBiz.getOnearticle(articleId);
    	session.put("onearticle", article);
    	return "admin";
    }
}
