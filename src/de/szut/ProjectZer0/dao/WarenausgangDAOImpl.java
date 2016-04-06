package de.szut.ProjectZer0.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import de.szut.ProjectZer0.model.Warenausgang;

public class WarenausgangDAOImpl {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional
	public void saveWarenausgang(Warenausgang warenausgang) {


		sessionfactory.getCurrentSession().saveOrUpdate(warenausgang);
	}
	@Transactional
	public void delWarenausgang(Warenausgang warenausgang) {
		hibernateTemplate.delete(warenausgang);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Warenausgang> listWarenausgang() {
		return (List<Warenausgang>) hibernateTemplate.find("from Warenausgang");
	}
	
	@Transactional
	public Warenausgang getWarenausgang(Integer id) {
				return (Warenausgang)sessionfactory.getCurrentSession().get(Warenausgang.class, id);
	}

	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Warenausgang> getByName(String warenausgangname) {
		Query query = sessionfactory.getCurrentSession().createQuery("from Warenausgang where name =" + warenausgangname);
		//evtl änderung vornehmen
		List<Warenausgang> list = query.list();
		return list;
	}
}
