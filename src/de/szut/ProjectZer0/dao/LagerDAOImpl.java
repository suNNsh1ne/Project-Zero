package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import de.szut.ProjectZer0.model.Lager;

@Repository("LagerDAO")
public class LagerDAOImpl extends AbstractDAO<Integer, Lager> implements LagerDAO{
	
	 
    public Lager findById(int id) {
        return getByKey(id);
    }
 
    public void saveLager(Lager Lager) {
        persist(Lager);
    }
 
    public void deleteLagerByName(String name) {
        Query query = getSession().createSQLQuery("delete from Lager where username = :username");
        query.setString("ssn", name);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Lager> getAllLager() {
        Criteria criteria = createEntityCriteria();
        return (List<Lager>) criteria.list();
    }
 
    public Lager findLagerByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("name", name));
        return (Lager) criteria.uniqueResult();
    }
}
