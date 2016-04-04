package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.model.Bestandsartikel;

public class BestandsartikelDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveBestandsartikel(Bestandsartikel bestandsartikel) {


		sessionfactory.getCurrentSession().saveOrUpdate(bestandsartikel);
	}
	@Transactional
	public void delBestandsartikel(Bestandsartikel bestandsartikel) {
		hibernateTemplate.delete(bestandsartikel);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Bestandsartikel> listBestandsartikel() {
		return (List<Bestandsartikel>) hibernateTemplate.find("from Bestandsartikel");
	}
	
	@Transactional
	public Bestandsartikel getBestandsartikel(Integer id) {
				return (Bestandsartikel)sessionfactory.getCurrentSession().get(Bestandsartikel.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Bestandsartikel> getByName(String bestandsartikelname) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Bestandsartikel where name =" + bestandsartikelname);
		//evtl änderung vornehmen
		List<Bestandsartikel> list = query.list();
		return list;
	}
}
