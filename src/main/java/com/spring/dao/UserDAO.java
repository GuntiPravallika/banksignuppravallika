package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Account;
import com.spring.domain.User;
@Transactional
@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Account> getAccountList() {									
		Session session = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		Criteria crt = session.createCriteria(Account.class);
		List<Account> accList = crt.list();
		return accList;
	}

	public Account getAccountByAccountNumber(String accountNo) {
		Session session = this.sessionFactory.getCurrentSession();
		Account a = (Account) session.load(Account.class, new String(accountNo));

		return a;
	}

	public int setUserNameAndPassword(Account a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(a);
		session.close();
		return 1;
	}
}
