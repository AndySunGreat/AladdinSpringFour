package com.aladdin.spring.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3964715827760182252L;
	private Long id;
	private String accountNumber; // telephone or email
	private String userName;  // "精英"号
	private String passWord;  
	private String telephoneNumber;
	private String emailAddress;
	private String experience;  // 工作年限
	private String languageDirection; // 语言方向(JAVA,C,C++,C#,PHP)
	private String currentPostion; // 当前岗位	
	private String currentCompany; // 当前服务公司
    private String jinyingLevel; // 精英等级
	private String userLevel; // VIP
	private String jinyingMoney; // 精英金币
	private String gender; // 用户性别
	

	public User(Long id, String accountNumber, String userName, String passWord, String telephoneNumber,
			String emailAddress, String experience, String languageDirection, String currentPostion,
			String currentCompany, String jinyingLevel, String userLevel, String jinyingMoney, String gender) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.experience = experience;
		this.languageDirection = languageDirection;
		this.currentPostion = currentPostion;
		this.currentCompany = currentCompany;
		this.jinyingLevel = jinyingLevel;
		this.userLevel = userLevel;
		this.jinyingMoney = jinyingMoney;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	
	
}
