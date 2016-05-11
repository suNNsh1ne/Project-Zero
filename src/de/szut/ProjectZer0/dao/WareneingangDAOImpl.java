package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import de.szut.ProjectZer0.model.Wareneingang;

@Repository("WareneingangDAO")
public class WareneingangDAOImpl extends AbstractDAO<Integer, Wareneingang> implements WareneingangDAO{

	@Override
	public Wareneingang findById(int id) {
		return getByKey(id);
	}
	
	public void deleteWareneingangById(String id) {
        Query query = getSession().createSQLQuery("delete from Wareneingang where WARENEINGANG_ID = :wareneingangId").setParameter("wareneingangId", id);
        query.executeUpdate();
    }

	@SuppressWarnings("unchecked")
	public List<Wareneingang> getAllBestandsartikel() {
		Criteria criteria = createEntityCriteria();
        return (List<Wareneingang>) criteria.list();
	}

}
