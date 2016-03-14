package de.szut.ProjectZer0.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.model.User;

public class UserDAOImpl implements UserDAO{
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private SessionFactory mySessionFactory;
	

	
	public void generateTestUser(){
		Session session = mySessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		User u = new User();
		u.setPassword("");
		u.setUsername("test");
		
		session.save(u);
		tx.commit();
	}
	
	@Transactional
	public void saveUser(User user) {
		mySessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	@Transactional
	public void delUser(User user) {
		hibernateTemplate.delete(user);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> listUser() {
		return hibernateTemplate.find("from User");
	}
	
	@Transactional
	public User getUser(Integer id) {
		return (User)mySessionFactory.getCurrentSession().get(User.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> getByName(String username) {
		Query query = mySessionFactory.getCurrentSession().createQuery("from User where name =" + username);
		//evtl änderung vornehmen
		List<User> list = query.list();
		return list;
	}

}
