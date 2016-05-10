package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.MitarbeiterDAO;
import de.szut.ProjectZer0.model.Mitarbeiter;


@Service("MitarbeiterService")
@Transactional
public class MitarbeiterServiceImpl implements MitarbeiterService {
 
    @Autowired
    private MitarbeiterDAO dao;

 
    public void saveMitarbeiter(Mitarbeiter Mitarbeiter) {
        dao.saveMitarbeiter(Mitarbeiter);
    }
 
    public void updateMitarbeiter(Mitarbeiter Mitarbeiter) {
    	Mitarbeiter entity = dao.findById(Mitarbeiter.getMitarbeiterId());
        if(entity!=null){
        	entity.setName(Mitarbeiter.getName());
        }
    }
 
    public void deleteMitarbeiterByName(String Name){
        dao.deleteMitarbeiterByName(Name);
    }
    
 
    public List<Mitarbeiter> getAllMitarbeiter() {
    	return dao.getAllMitarbeiter();
    }
 
    public Mitarbeiter findMitarbeiterByName(String Name) {
    	return dao.findMitarbeiterByName(Name);
    }

	@Override
	public Mitarbeiter findById(int id) {
		return dao.findById(id);
	}
	

}
