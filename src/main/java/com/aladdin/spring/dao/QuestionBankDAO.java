package com.aladdin.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aladdin.spring.model.BaseQuestionBank;
import com.aladdin.spring.model.ChooseItems;
@Component
public class QuestionBankDAO {
	// testing
	private static List orderQuestionBanks;
	{
		orderQuestionBanks = new ArrayList<BaseQuestionBank>();
		orderQuestionBanks.add(new BaseQuestionBank(10L,"Java Core","ic_friends", null, null, null, null));
		orderQuestionBanks.add(new BaseQuestionBank(11L,"Spring MVC","ic_favorites", null, null, null, null));
		orderQuestionBanks.add(new BaseQuestionBank(12L,"Javascript","ic_nearby", null, null, null, null));
		orderQuestionBanks.add(new BaseQuestionBank(13L,"HTML/CSS","ic_recents", null, null, null, null));
		orderQuestionBanks.add(new BaseQuestionBank(14L,"Mybatis","ic_friends", null, null, null, null));
		orderQuestionBanks.add(new BaseQuestionBank(15L,"Oracle","ic_favorites", null, null, null, null));
	}
	

	
	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List list() {
		return orderQuestionBanks;
	}

	/**
	 * Return customer object for given id from dummy database. If customer is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            customer id
	 * @return customer object for given id
	 */
	public BaseQuestionBank get(Long id) {

		for(int i=0;i<orderQuestionBanks.size();i++){
			BaseQuestionBank c = (BaseQuestionBank) orderQuestionBanks.get(i);
//		for (Customer c : customers) {
			if (c.getBankId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new customer in dummy database. Updates the id and insert new
	 * customer in list.
	 * 
	 * @param customer
	 *            Customer object
	 * @return customer object with updated id
	 */
	public BaseQuestionBank create(BaseQuestionBank orderQuestionBank) {
		orderQuestionBank.setBankId(System.currentTimeMillis());
		orderQuestionBanks.add(orderQuestionBank);
		return orderQuestionBank;
	}

	/**
	 * Delete the customer object from dummy database. If customer not found for
	 * given id, returns null.
	 * 
	 * @param id
	 *            the customer id
	 * @return id of deleted customer object
	 */
	public Long delete(Long id) {
		for(int i=0;i<orderQuestionBanks.size();i++){
			BaseQuestionBank c = (BaseQuestionBank) orderQuestionBanks.get(i);
		//for (Customer c : customers) {
			if (c.getBankId().equals(id)) {
				orderQuestionBanks.remove(c);
				return id;
			}
		}

		return null;
	}

	/**
	 * Update the customer object for given id in dummy database. If customer
	 * not exists, returns null
	 * 
	 * @param id
	 * @param customer
	 * @return customer object with id
	 */
	public BaseQuestionBank update(Long id, BaseQuestionBank baseQuestionBank) {

		for(int i=0;i<orderQuestionBanks.size();i++){
			BaseQuestionBank c = (BaseQuestionBank) orderQuestionBanks.get(i);
		//for (Customer c : customers) {
			if (c.getBankId().equals(id)) {
				baseQuestionBank.setBankId(c.getBankId());
				orderQuestionBanks.remove(c);
				orderQuestionBanks.add(baseQuestionBank);
				return baseQuestionBank;
			}
		}

		return null;
	}

}