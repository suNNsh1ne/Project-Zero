package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;

@Repository("WarenausgangDAO")
public class WarenausgangDAOImpl extends AbstractDAO<Integer, Bestandsartikel> implements WarenausgangDAO{

	@Override
	public Bestandsartikel findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<Bestandsartikel> getAllBestandsartikel() {
		Criteria criteria = createEntityCriteria();
        return (List<Bestandsartikel>) criteria.list();
	}

}
