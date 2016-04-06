package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.model.Wareneingang;

public class WareneingangDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveWareneingang(Wareneingang wareneingang) {


		sessionfactory.getCurrentSession().saveOrUpdate(wareneingang);
	}
	@Transactional
	public void delWareneingang(Wareneingang wareneingang) {
		hibernateTemplate.delete(wareneingang);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Wareneingang> listWareneingang() {
		return (List<Wareneingang>) hibernateTemplate.find("from Wareneingang");
	}
	
	@Transactional
	public Wareneingang getWareneingang(Integer id) {
				return (Wareneingang)sessionfactory.getCurrentSession().get(Wareneingang.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Wareneingang> getByName(String wareneingangname) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Wareneingang where name =" + wareneingangname);
		//evtl änderung vornehmen
		List<Wareneingang> list = query.list();
		return list;
	}
}
