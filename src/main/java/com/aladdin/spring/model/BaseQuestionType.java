package com.aladdin.spring.model;

/**
 * Created by AndySun on 2016/9/24.
 */
public class BaseQuestionType {
    private Long questionTypeId;
    private String questionTypeName;  

    public BaseQuestionType(Long questionTypeId, String questionTypeName) {
        this.questionTypeId = questionTypeId;
        this.questionTypeName = questionTypeName;
    }

    public Long getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Long questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }
}
