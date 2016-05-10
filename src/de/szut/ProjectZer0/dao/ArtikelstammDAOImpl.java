package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import de.szut.ProjectZer0.model.Artikelstamm;

@Repository("ArtikelstammDAO")
public class ArtikelstammDAOImpl extends AbstractDAO<Integer, Artikelstamm> implements ArtikelstammDAO{
    public Artikelstamm findById(int id) {
        return getByKey(id);
    }
 
    public void saveArtikelstamm(Artikelstamm Artikelstamm) {
        persist(Artikelstamm);
    }
 
    public void deleteArtikelstammByBezeichnung(String Bezeichnung) {
        Query query = getSession().createSQLQuery("delete from Artikelstamm where Bezeichnung = :Bezeichnung");
        query.setString("ssn", Bezeichnung);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Artikelstamm> getAllArtikelstamm() {
        Criteria criteria = createEntityCriteria();
        return (List<Artikelstamm>) criteria.list();
    }
 
    public Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("Bezeichnung", Bezeichnung));
        return (Artikelstamm) criteria.uniqueResult();
    }
}
