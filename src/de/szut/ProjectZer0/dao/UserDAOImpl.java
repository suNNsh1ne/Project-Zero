package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.model.User;

@Repository("UserDAO")
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO{
	
	 
    public User findById(int id) {
        return getByKey(id);
    }
 
    public void saveUser(User User) {
        persist(User);
    }
 
    public void deleteUserByUsername(String username) {
        Query query = getSession().createSQLQuery("delete from User where username = :username");
        query.setString("ssn", username);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<User> getAllUser() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }
 
    public User findUserByUsername(String username) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("username", username));
        return (User) criteria.uniqueResult();
    }
	
	
	/*
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
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
		return (List<User>) hibernateTemplate.find("from User");
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
	}*/

}
