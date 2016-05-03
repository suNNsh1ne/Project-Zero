package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import de.szut.ProjectZer0.model.Warenausgang;

@Repository("WarenausgangDAO")
public class WarenausgangDAOImpl extends AbstractDAO<Integer, Warenausgang> implements WarenausgangDAO{

	@Override
	public Warenausgang findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<Warenausgang> getAllBestandsartikel() {
		Criteria criteria = createEntityCriteria();
        return (List<Warenausgang>) criteria.list();
	}

}
