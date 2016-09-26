package com.aladdin.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.aladdin.spring.model.User;

@Component
public class UserDAO {

	// Dummy database. Initialize with some dummy values.
	private static List users;
	{
		users = new ArrayList();
		users.add(new User(101L, "18624382583", "AndySun", "guanjiang", "18624382583","andysungj@126.com","VIP", null, null, null, null, null, null, null));
		users.add(new User(201L, "andysungj@126.com", "MattSun", "guanjiang", "18624382583","andysungj@126.com","P1", null, null, null, null, null, null, null));
		users.add(new User(301L, "18698627443", "MarryZhang", "glory", "18624382583","guanjiang0616@126.com","P1", null, null, null, null, null, null, null));
	}

	/**
	 * Returns list of users from dummy database.
	 * 
	 * @return list of users
	 */
	public List list() {
		return users;
	}

	/**
	 * Return customer object for given id from dummy database. If customer is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            customer id
	 * @return customer object for given id
	 */
	public User get(Long id) {

		for(int i=0;i<users.size();i++){
			User c = (User) users.get(i);
//		for (Customer c : users) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	public User getLoginByAcctNum(String accountNumber){
		
		for(int i=0;i<users.size();i++){
			User c = (User) users.get(i);
			if(c.getAccountNumber().equals(accountNumber)){
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
	public User create(User user) {
		user.setId(System.currentTimeMillis());
		users.add(user);
		return user;
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
		for(int i=0;i<users.size();i++){
			User c = (User) users.get(i);
		//for (Customer c : users) {
			if (c.getId().equals(id)) {
				users.remove(c);
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
	public User update(Long id, User user) {

		for(int i=0;i<users.size();i++){
			User c = (User) users.get(i);
		//for (Customer c : users) {
			if (c.getId().equals(id)) {
				user.setId(c.getId());
				users.remove(c);
				users.add(user);
				return user;
			}
		}

		return null;
	}

}