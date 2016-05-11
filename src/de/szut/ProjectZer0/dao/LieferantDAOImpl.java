package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import de.szut.ProjectZer0.model.Lieferant;

@Repository("LieferantDAO")
public class LieferantDAOImpl extends AbstractDAO<Integer, Lieferant> implements LieferantDAO{
	
	 
    public Lieferant findById(int id) {
        return getByKey(id);
    }
 
    public void saveLieferant(Lieferant Lieferant) {
        persist(Lieferant);
    }
 
    public void deleteLieferantByAnsprechpartner(String Ansprechpartner) {
        Query query = getSession().createSQLQuery("delete from Lieferant where Ansprechpartner = :Ansprechpartner").setParameter("Ansprechpartner", Ansprechpartner);
        query.executeUpdate();
    }
    
    public void deleteLieferantById(String id) {
        Query query = getSession().createSQLQuery("delete from Lieferant where LIEFERANT_ID = :lieferantId").setParameter("lieferantId", id);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Lieferant> getAllLieferant() {
        Criteria criteria = createEntityCriteria();
        return (List<Lieferant>) criteria.list();
    }
 
    public Lieferant findLieferantByAnsprechpartner(String Ansprechpartner) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("Ansprechpartner", Ansprechpartner));
        return (Lieferant) criteria.uniqueResult();
    }
}
