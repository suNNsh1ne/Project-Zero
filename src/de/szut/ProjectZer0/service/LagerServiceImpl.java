package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.LagerDAO;
import de.szut.ProjectZer0.model.Lager;

@Service("LagerService")
@Transactional
public class LagerServiceImpl implements LagerService {
 
    @Autowired
    private LagerDAO dao;

 
    public void saveLager(Lager Lager) {
        dao.saveLager(Lager);
    }
 
    public void updateLager(Lager Lager) {
        Lager entity = dao.findById(Lager.getLagerID());
        if(entity!=null){
        	entity.setName(Lager.getName());
        	entity.setAuslastung(Lager.getAuslastung());
        	entity.setOrt(Lager.getOrt());
        	entity.setKapazität(Lager.getKapazität());
        }
    }
 
    public void deleteLagerByName(String username){
        dao.deleteLagerByName(username);
    }
    
 
    public List<Lager> getAllLager() {
    	return dao.getAllLager();
    }
 
    public Lager findLagerByName(String username) {
    	return dao.findLagerByName(username);
    }

	@Override
	public Lager findById(int id) {
		return dao.findById(id);
	}
}
