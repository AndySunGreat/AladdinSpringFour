package com.aladdin.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aladdin.spring.model.ChooseItems;
import com.aladdin.spring.model.Customer;
import com.aladdin.spring.model.QuestionBank;

@Component
public class QuestionBankDAO {
	// testing
	// Dummy database. Initialize with some dummy values.
	private static List<ChooseItems> chooseItemsList1;
	private static List<ChooseItems> chooseItemsList2;
	private static List<ChooseItems> chooseItemsList3;
	private static List questionBanks;
	{
		chooseItemsList1 = new ArrayList<ChooseItems>();
		chooseItemsList1.add(new ChooseItems("A","�ܹ���������","comments1",true));
		chooseItemsList1.add(new ChooseItems("B","���ܹ���������","comments2",false));
		chooseItemsList2 = new ArrayList<ChooseItems>();
		//A start()       B run()       C exit()       D getPriority() ABD
		chooseItemsList2.add(new ChooseItems("A","start() ","comments1",true));
		chooseItemsList2.add(new ChooseItems("B","run()","comments2",true));
		chooseItemsList2.add(new ChooseItems("C","exit()","comments2",false));
		chooseItemsList2.add(new ChooseItems("D","getPriority()","comments2",true));
		chooseItemsList3 = new ArrayList<ChooseItems>();
		chooseItemsList3.add(new ChooseItems("A","pingpong","comments1",true));
		chooseItemsList3.add(new ChooseItems("B","pongping","comments2",true));
		chooseItemsList3.add(new ChooseItems("C","pingpong��pongping���п��� ","comments2",false));
		chooseItemsList3.add(new ChooseItems("D","�������","comments2",true));
		
		questionBanks = new ArrayList();
		questionBanks.add(new QuestionBank(101L, "Java", "��ѡ", "Java ���ܴ��� volatile ������",chooseItemsList1,"A","questionComments"));
		questionBanks.add(new QuestionBank(201L, "Java", "��ѡ","������Щ��Thread��ķ�������",chooseItemsList2,"ABD",""));
	
		questionBanks.add(new QuestionBank(301L, "Java", "��ѡ","�����������н����/n  "
				+ "public static void main(String args[]) { /n"
				+ "Thread t = new Thread() /n"
				+ "public void run() { /n"
				+ "pong(); /n } /n }; /n t.run(); /n"
				+ "System.out.print(\'ping\'); /n"
				+ "} /n",chooseItemsList3,"B","���������￼����Thread����start()��run()�����������ˡ�start()��������һ���̣߳�������start������ϵͳ�ŻῪ��һ���µ��̣߳���������run()������ִ�����񣬶������ĵ���run()�͸�������ͨ������һ���ģ��Ѿ�ʧȥ�̵߳������ˡ����������һ���̵߳�ʱ��һ��Ҫʹ��start()������run()��"));
	
		}
	

	
	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List list() {
		return questionBanks;
	}

	/**
	 * Return customer object for given id from dummy database. If customer is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            customer id
	 * @return customer object for given id
	 */
	public QuestionBank get(Long id) {

		for(int i=0;i<questionBanks.size();i++){
			QuestionBank c = (QuestionBank) questionBanks.get(i);
//		for (Customer c : customers) {
			if (c.getQuestionId().equals(id)) {
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
	public QuestionBank create(QuestionBank questionBank) {
		questionBank.setQuestionId(System.currentTimeMillis());
		questionBanks.add(questionBank);
		return questionBank;
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
		for(int i=0;i<questionBanks.size();i++){
			QuestionBank c = (QuestionBank) questionBanks.get(i);
		//for (Customer c : customers) {
			if (c.getQuestionId().equals(id)) {
				questionBanks.remove(c);
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
	public QuestionBank update(Long id, QuestionBank questionBank) {

		for(int i=0;i<questionBanks.size();i++){
			QuestionBank c = (QuestionBank) questionBanks.get(i);
		//for (Customer c : customers) {
			if (c.getQuestionId().equals(id)) {
				questionBank.setQuestionId(c.getQuestionId());
				questionBanks.remove(c);
				questionBanks.add(questionBank);
				return questionBank;
			}
		}

		return null;
	}

}