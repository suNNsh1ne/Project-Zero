package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.model.Artikelstamm;

public class ArtikelstammDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveArtikelstamm(Artikelstamm artikelstamm) {


		sessionfactory.getCurrentSession().saveOrUpdate(artikelstamm);
	}
	@Transactional
	public void delArtikelstamm(Artikelstamm artikelstamm) {
		hibernateTemplate.delete(artikelstamm);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Artikelstamm> listArtikelstamm() {
		return (List<Artikelstamm>) hibernateTemplate.find("from Artikelstamm");
	}
	
	@Transactional
	public Artikelstamm getArtikelstamm(Integer id) {
				return (Artikelstamm)sessionfactory.getCurrentSession().get(Artikelstamm.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Artikelstamm> getByName(String artikelstammname) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Artikelstamm where name =" + artikelstammname);
		//evtl änderung vornehmen
		List<Artikelstamm> list = query.list();
		return list;
	}
}
