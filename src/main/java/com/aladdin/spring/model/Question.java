package com.aladdin.spring.model;

import java.io.Serializable;
import java.util.List;

public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6407707422140749874L;
	
	private Long questionId;
	private String questionBankName; // Java Core,
	private String questionCategoryName; // Java,C,C#
	private String questionTypeName; //单选,多选,判断,问答
	private String questionSubject; //问题
	private List<ChooseItems> chooseItemsList;
	private String answers;  //A,B
	private String questionComments;
	private String answerJson;
	
	
	
	public Question(Long questionId,String questionBankName, String questionCategoryName, String questionTypeName, String questionSubject,
			List<ChooseItems> chooseItemsList, String answers, String questionComments) {
		super();
		this.questionId = questionId;
		this.questionBankName = questionBankName;
		this.questionCategoryName = questionCategoryName;
		this.questionTypeName = questionTypeName;
		this.questionSubject = questionSubject;
		this.chooseItemsList = chooseItemsList;
		this.answers = answers;
		this.questionComments = questionComments;
	}
	
	
	
	public String getQuestionBankName() {
		return questionBankName;
	}



	public void setQuestionBankName(String questionBankName) {
		this.questionBankName = questionBankName;
	}



	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionSubject() {
		return questionSubject;
	}
	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}
	public List<ChooseItems> getChooseItemsList() {
		return chooseItemsList;
	}
	public void setChooseItemsList(List<ChooseItems> chooseItemsList) {
		this.chooseItemsList = chooseItemsList;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public String getQuestionComments() {
		return questionComments;
	}
	public void setQuestionComments(String questionComments) {
		this.questionComments = questionComments;
	}
	public String getQuestionCategoryName() {
		return questionCategoryName;
	}
	public void setQuestionCategoryName(String questionCategoryName) {
		this.questionCategoryName = questionCategoryName;
	}
	public String getQuestionTypeName() {
		return questionTypeName;
	}
	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}
	public String getAnswerJson() {
		return answerJson;
	}
	public void setAnswerJson(String answerJson) {
		this.answerJson = answerJson;
	}
	
}
