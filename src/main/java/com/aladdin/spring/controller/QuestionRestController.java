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

import com.aladdin.spring.dao.QuestionDAO;
import com.aladdin.spring.model.Question;

@RestController
public class QuestionRestController {

	
	@Autowired
	private QuestionDAO questionDAO;

	
	@GetMapping("/question")
	public List getAllQuestions() {
		return questionDAO.list();
	}

	@GetMapping("/question/{id}")
	public ResponseEntity getQuestion(@PathVariable("id") Long id) {

		Question question = questionDAO.get(id);
		if (question == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(question, HttpStatus.OK);
	}

	@PostMapping(value = "/question")
	public ResponseEntity createQuestion(@RequestBody Question question) {

		questionDAO.create(question);

		return new ResponseEntity(question, HttpStatus.OK);
	}

	@DeleteMapping("/question/{id}")
	public ResponseEntity deleteQuestion(@PathVariable Long id) {

		if (null == questionDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

	@PutMapping("/question/{id}")
	public ResponseEntity updateQuestionBank(@PathVariable Long id, @RequestBody Question question) {

		question = questionDAO.update(id, question);

		if (null == question) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(question, HttpStatus.OK);
	}

}
