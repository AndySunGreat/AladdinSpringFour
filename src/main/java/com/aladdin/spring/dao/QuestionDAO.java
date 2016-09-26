package com.aladdin.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aladdin.spring.model.ChooseItems;
import com.aladdin.spring.model.Question;

@Component
public class QuestionDAO {
	// testing
	// Dummy database. Initialize with some dummy values.
	private static List<ChooseItems> chooseItemsList1;
	private static List<ChooseItems> chooseItemsList2;
	private static List<ChooseItems> chooseItemsList3;
	private static List questionBanks;
	{
		chooseItemsList1 = new ArrayList<ChooseItems>();
		chooseItemsList1.add(new ChooseItems("A","能够创建数据","comments1",true));
		chooseItemsList1.add(new ChooseItems("B","不能够创建数据","comments2",false));
		chooseItemsList2 = new ArrayList<ChooseItems>();
		//A start()       B run()       C exit()       D getPriority() ABD
		chooseItemsList2.add(new ChooseItems("A","start() ","comments1",true));
		chooseItemsList2.add(new ChooseItems("B","run()","comments2",true));
		chooseItemsList2.add(new ChooseItems("C","exit()","comments2",false));
		chooseItemsList2.add(new ChooseItems("D","getPriority()","comments2",true));
		chooseItemsList3 = new ArrayList<ChooseItems>();
		chooseItemsList3.add(new ChooseItems("A","pingpong","comments1",true));
		chooseItemsList3.add(new ChooseItems("B","pongping","comments2",true));
		chooseItemsList3.add(new ChooseItems("C","pingpong和pongping都有可能 ","comments2",false));
		chooseItemsList3.add(new ChooseItems("D","都不输出","comments2",true));
		
		questionBanks = new ArrayList();
		questionBanks.add(new Question(101L,"Java Core", "Java", "单选", "Java 中能创建 volatile 数组吗？",chooseItemsList1,"A","questionComments"));
		questionBanks.add(new Question(201L,"Java Core","Java", "多选","下面哪些是Thread类的方法（）",chooseItemsList2,"ABD",""));
	
		questionBanks.add(new Question(301L,"Java Core", "Java", "单选","下面程序的运行结果：/n  "
				+ "public static void main(String args[]) { /n"
				+ "Thread t = new Thread() /n"
				+ "public void run() { /n"
				+ "pong(); /n } /n }; /n t.run(); /n"
				+ "System.out.print(\'ping\'); /n"
				+ "} /n",chooseItemsList3,"B","解析：这里考的是Thread类中start()和run()方法的区别了。start()用来启动一个线程，当调用start方法后，系统才会开启一个新的线程，进而调用run()方法来执行任务，而单独的调用run()就跟调用普通方法是一样的，已经失去线程的特性了。因此在启动一个线程的时候一定要使用start()而不是run()。"));
	
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
	public Question get(Long id) {

		for(int i=0;i<questionBanks.size();i++){
			Question c = (Question) questionBanks.get(i);
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
	public Question create(Question question) {
		question.setQuestionId(System.currentTimeMillis());
		questionBanks.add(question);
		return question;
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
			Question c = (Question) questionBanks.get(i);
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
	public Question update(Long id, Question question) {

		for(int i=0;i<questionBanks.size();i++){
			Question c = (Question) questionBanks.get(i);
		//for (Customer c : customers) {
			if (c.getQuestionId().equals(id)) {
				question.setQuestionId(c.getQuestionId());
				questionBanks.remove(c);
				questionBanks.add(question);
				return question;
			}
		}

		return null;
	}

}