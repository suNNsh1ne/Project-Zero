package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.model.Mitarbeiter;

public class MitarbeiterDAOImpl implements MitarbeiterDAO{
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveMitarbeiter(Mitarbeiter mitarbeiter) {


		sessionfactory.getCurrentSession().saveOrUpdate(mitarbeiter);
	}
	@Transactional
	public void delMitarbeiter(Mitarbeiter mitarbeiter) {
		hibernateTemplate.delete(mitarbeiter);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Mitarbeiter> listMitarbeiter() {
		return (List<Mitarbeiter>) hibernateTemplate.find("from Mitarbeiter");
	}
	
	@Transactional
	public Mitarbeiter getMitarbeiter(Integer id) {
				return (Mitarbeiter)sessionfactory.getCurrentSession().get(Mitarbeiter.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Mitarbeiter> getByName(String mitarbeitername) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Mitarbeiter where name =" + mitarbeitername);
		//evtl änderung vornehmen
		List<Mitarbeiter> list = query.list();
		return list;
	}
}
