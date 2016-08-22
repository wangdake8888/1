package edu.tsinghua.bean;

public class User {
	private int userId;
	private String userName;
	private String passWord;
	private String userType;
	private String passWord1;
    private String tel;
	private String address;
	
	public String getPassWord1() {
		return passWord1;
	}
	public void setPassWord1(String passWord1) {
		this.passWord1 = passWord1;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public User(int userId, String userName, String passWord, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
	}
	public User() {
		super();
	}
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public User(int userId, String userName, String passWord, String userType,
			String passWord1, String tel, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
		this.passWord1 = passWord1;
		this.tel = tel;
		this.address = address;
	}
	public User(String userName, String passWord, String userType,
			String passWord1, String tel, String address) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
		this.passWord1 = passWord1;
		this.tel = tel;
		this.address = address;
	}
	

}
