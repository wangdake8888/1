package edu.tsinghua.bean;

import java.io.Serializable;



public class Article implements Serializable{
	private int articleId;
	private String articleBiaoTi;
	private String articleZhaiYao;
	private String articleNeiRong;
	private String ShiJian;
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getArticleBiaoTi() {
		return articleBiaoTi;
	}
	public void setArticleBiaoTi(String articleBiaoTi) {
		this.articleBiaoTi = articleBiaoTi;
	}
	public String getArticleZhaiYao() {
		return articleZhaiYao;
	}
	public void setArticleZhaiYao(String articleZhaiYao) {
		this.articleZhaiYao = articleZhaiYao;
	}
	public String getArticleNeiRong() {
		return articleNeiRong;
	}
	public void setArticleNeiRong(String articleNeiRong) {
		this.articleNeiRong = articleNeiRong;
	}


	public String getShiJian() {
		return ShiJian;
	}
	public void setShiJian(String shiJian) {
		ShiJian = shiJian;
	}
	
	public Article(int articleId, String articleBiaoTi, String articleZhaiYao,
			String articleNeiRong, String shiJian) {
		super();
		this.articleId = articleId;
		this.articleBiaoTi = articleBiaoTi;
		this.articleZhaiYao = articleZhaiYao;
		this.articleNeiRong = articleNeiRong;
		ShiJian = shiJian;
	}
	public Article() {
		super();
	}
	public Article(int articleId) {
		super();
		this.articleId = articleId;
	}
	
    
}
