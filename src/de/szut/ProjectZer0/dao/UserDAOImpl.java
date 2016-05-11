package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

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
        Query query = getSession().createSQLQuery("delete from User where username = :user").setParameter("user", username);
        query.executeUpdate();
    }
    
    public void deleteUserById(String id) {
        Query query = getSession().createSQLQuery("delete from User where USER_ID = :userId").setParameter("userId", id);
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
}
