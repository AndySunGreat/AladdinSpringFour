package com.aladdin.spring.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3964715827760182252L;
	private Long id;
	private String accountNumber; // telephone or email
	private String userName;
	private String passWord;
	private String telephoneNumber;
	private String emailAddress;
	private String userLevel; // VIP
	
	public User(Long id, String accountNumber, String userName, String passWord, String telephoneNumber,
			String emailAddress, String userLevel) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.userLevel = userLevel;
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
