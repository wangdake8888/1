package edu.tsinghua.biz;

import java.util.List;

import edu.tsinghua.bean.Article;
import edu.tsinghua.dao.ArticleDao;

public class ArticleBiz {
	ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	public List<Article> getAllArticle(){
		return articleDao.getAllArticle();
	}
	public int deletearticle(Article article){	
		return articleDao.deletearticle(article);
	}
	public Article getOnearticle(int id){	
		return articleDao.getOnearticle(id);
	}
	public int addarticle(Article article){
		return articleDao.addarticle(article);
	}
	public int updatearticle(Article article){
		return articleDao.updatearticle(article);
	}
}
