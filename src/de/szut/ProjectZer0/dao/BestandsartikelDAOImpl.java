package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import de.szut.ProjectZer0.model.Bestandsartikel;

@Repository("BestandsartikelDAO")
public class BestandsartikelDAOImpl extends AbstractDAO<Integer, Bestandsartikel> implements BestandsartikelDAO{
	
	 
    public Bestandsartikel findById(int id) {
        return getByKey(id);
    }
 
    public void saveBestandsartikel(Bestandsartikel Bestandsartikel) {
        persist(Bestandsartikel);
    }
 
    public void deleteBestandsartikelByArtikelstamm(String Artikelstamm) {
        Query query = getSession().createSQLQuery("delete from Bestandsartikel where username = :username");
        query.setString("ssn", Artikelstamm);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Bestandsartikel> getAllBestandsartikel() {
        Criteria criteria = createEntityCriteria();
        return (List<Bestandsartikel>) criteria.list();
    }
 
    public Bestandsartikel findBestandsartikelByArtikelstamm(String Artikelstamm) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("Artikelstamm", Artikelstamm));
        return (Bestandsartikel) criteria.uniqueResult();
    }
}
