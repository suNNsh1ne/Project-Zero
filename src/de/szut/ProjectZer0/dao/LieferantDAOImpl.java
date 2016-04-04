package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.model.Lieferant;

public class LieferantDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveLieferant(Lieferant lieferant) {


		sessionfactory.getCurrentSession().saveOrUpdate(lieferant);
	}
	@Transactional
	public void delLieferant(Lieferant lieferant) {
		hibernateTemplate.delete(lieferant);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Lieferant> listLieferant() {
		return (List<Lieferant>) hibernateTemplate.find("from Lieferant");
	}
	
	@Transactional
	public Lieferant getLieferant(Integer id) {
				return (Lieferant)sessionfactory.getCurrentSession().get(Lieferant.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Lieferant> getByName(String lieferantname) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Lieferant where name =" + lieferantname);
		//evtl änderung vornehmen
		List<Lieferant> list = query.list();
		return list;
	}
}
