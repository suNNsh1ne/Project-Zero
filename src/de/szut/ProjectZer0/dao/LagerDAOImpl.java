package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.model.Lager;

public class LagerDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveLager(Lager lager) {


		sessionfactory.getCurrentSession().saveOrUpdate(lager);
	}
	@Transactional
	public void delLager(Lager lager) {
		hibernateTemplate.delete(lager);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Lager> listLager() {
		return (List<Lager>) hibernateTemplate.find("from Lager");
	}
	
	@Transactional
	public Lager getLager(Integer id) {
				return (Lager)sessionfactory.getCurrentSession().get(Lager.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Lager> getByName(String lagername) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Lager where name =" + lagername);
		//evtl änderung vornehmen
		List<Lager> list = query.list();
		return list;
	}
}
