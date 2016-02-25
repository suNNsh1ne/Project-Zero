package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.model.User;

public class UserDAOImpl implements UserDAO{
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void generateTestUsers(){
		for(int i = 0; i < 10; i++){
			User u = new User();
			u.setId(i);
			u.setPassword(null);
			u.setUsername(Integer.toString(i));
			sessionfactory.getCurrentSession().saveOrUpdate(u);
		}
	}
	
	@Transactional
	public void saveUser(User user) {
		sessionfactory.getCurrentSession().saveOrUpdate(user);
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
		return (User)sessionfactory.getCurrentSession().get(User.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> getByName(String username) {
		Query query = sessionfactory.getCurrentSession().createQuery("from User where name =" + username);
		//evtl änderung vornehmen
		List<User> list = query.list();
		return list;
	}

}
