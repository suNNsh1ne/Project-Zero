package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import de.szut.ProjectZer0.model.Mitarbeiter;

@Repository("MitarbeiterDAO")
public class MitarbeiterDAOImpl extends AbstractDAO<Integer, Mitarbeiter> implements MitarbeiterDAO{
    public Mitarbeiter findById(int id) {
        return getByKey(id);
    }
 
    public void saveMitarbeiter(Mitarbeiter Mitarbeiter) {
        persist(Mitarbeiter);
    }
 
    @SuppressWarnings("unchecked")
    public List<Mitarbeiter> getAllMitarbeiter() {
        Criteria criteria = createEntityCriteria();
        return (List<Mitarbeiter>) criteria.list();
    }
    
    public void deleteMitarbeiterByName(String Name) {
        Query query = getSession().createSQLQuery("delete from Mitarbeiter where Name = :Name");
        query.setString("ssn", Name);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Mitarbeiter> getAllUser() {
        Criteria criteria = createEntityCriteria();
        return (List<Mitarbeiter>) criteria.list();
    }
 
    public Mitarbeiter findMitarbeiterByName(String Name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("Name", Name));
        return (Mitarbeiter) criteria.uniqueResult();
    }
}
