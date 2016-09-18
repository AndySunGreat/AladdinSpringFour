package com.aladdin.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aladdin.spring.dao.QuestionBankDAO;
import com.aladdin.spring.model.QuestionBank;

@RestController
public class QuestionBankRestController {

	
	@Autowired
	private QuestionBankDAO questionBankDAO;

	
	@GetMapping("/questionBanks")
	public List getQuestionBanks() {
		return questionBankDAO.list();
	}

	@GetMapping("/questionBanks/{id}")
	public ResponseEntity getQuestionBank(@PathVariable("id") Long id) {

		QuestionBank questionBank = questionBankDAO.get(id);
		if (questionBank == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(questionBank, HttpStatus.OK);
	}

	@PostMapping(value = "/questionBanks")
	public ResponseEntity createQuestionBank(@RequestBody QuestionBank questionBank) {

		questionBankDAO.create(questionBank);

		return new ResponseEntity(questionBank, HttpStatus.OK);
	}

	@DeleteMapping("/questionBanks/{id}")
	public ResponseEntity deleteQuestionBank(@PathVariable Long id) {

		if (null == questionBankDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

	@PutMapping("/questionBanks/{id}")
	public ResponseEntity updateQuestionBank(@PathVariable Long id, @RequestBody QuestionBank questionBank) {

		questionBank = questionBankDAO.update(id, questionBank);

		if (null == questionBank) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(questionBank, HttpStatus.OK);
	}

}
