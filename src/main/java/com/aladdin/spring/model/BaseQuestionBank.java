package com.aladdin.spring.model;


import java.util.Date;

/**
 * Created by AndySun on 2016/9/24.
 */
public class BaseQuestionBank {
    private Long bankId;  
    private String bankName; 
    private Long categoryId;   
    private Date orderDatetime; 
    private Date modifyDatetime; 
    private String author; 
    private String bankIconImgName;

    public BaseQuestionBank(Long bankId, String bankName,String bankIconImgName, 
    		Long categoryId, Date orderDatetime, Date modifyDatetime, String author) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.categoryId = categoryId;
        this.orderDatetime = orderDatetime;
        this.modifyDatetime = modifyDatetime;
        this.author = author;
        this.bankIconImgName = bankIconImgName;
    }



	public String getBankIconImgName() {
		return bankIconImgName;
	}



	public void setBankIconImgName(String bankIconImgName) {
		this.bankIconImgName = bankIconImgName;
	}



	public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Date getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(Date orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
