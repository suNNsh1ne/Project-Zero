package de.szut.ProjectZer0.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.szut.ProjectZer0.hibernate.util.HibernateUtil;
import de.szut.ProjectZer0.model.User;

// noch umschreiben

public class LoginService {
	
	public boolean validateUser(String user_id, String password)
	{
		User user = getUserByUserId(user_id);
		
		if(user != null && user.getId().equals(user_id) && user.getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public User getUserByUserId(String user_id) {
		Session session = HibernateUtil.openSession();
		Transaction trans = null;
		User user = null;
		
		try{
			trans = session.getTransaction();
			trans.begin();
			Query query = session.createQuery("SELECT password FROM "+ User.class.getName() +" WHERE username = 'Bill'");
			user = (User)query.uniqueResult();
			System.out.println(user);
			trans.commit();
		}
		catch(Exception e)
		{
			if(trans != null)
			{
				trans.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return user;
	}
    public List<User> getListOfUsers(){
        List<User> list = new ArrayList<User>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from User").list();                       
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
