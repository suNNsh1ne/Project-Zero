package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import de.szut.ProjectZer0.model.User;

public class UserDAOImpl implements UserDAO{
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void saveUser(User user) {
		hibernateTemplate.delete(user);
		
	}
	
	public void delUser(User user) {
		hibernateTemplate.delete(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> listUser() {
		return hibernateTemplate.find("from User");
	}

	public User getUser(Integer id) {
		return (User)hibernateTemplate.get(User.class,  id);
	}

	
	@SuppressWarnings("unchecked")
	public List<User> getByName(String username) {
		return hibernateTemplate.find("from User where name =" + username);
	}

}
