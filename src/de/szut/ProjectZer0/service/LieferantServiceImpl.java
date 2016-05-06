package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.LieferantDAO;
import de.szut.ProjectZer0.model.Lieferant;

@Service("LieferantService")
@Transactional
public class LieferantServiceImpl implements LieferantService {
 
    @Autowired
    private LieferantDAO dao;

 
    public void saveLieferant(Lieferant Lieferant) {
        dao.saveLieferant(Lieferant);
    }
 
    public void updateLieferant(Lieferant Lieferant) {
    	Lieferant entity = dao.findById(Lieferant.getLieferantId());
        if(entity!=null){
        	entity.setAnsprechpartner(Lieferant.getAnsprechpartner());
        	entity.setAdresse(Lieferant.getAdresse());
        	entity.setArtikelstämme(Lieferant.getArtikelstämme());
        	entity.setWareneingang(Lieferant.getWareneingang());
        }
    }
 
    public void deleteLieferantByAnsprechpartner(String Ansprechpartner){
        dao.deleteLieferantByAnsprechpartner(Ansprechpartner);
    }
    
 
    public List<Lieferant> getAllLieferant() {
    	return dao.getAllLieferant();
    }
 
    public Lieferant findLieferantByAnsprechpartner(String Ansprechpartner) {
    	return dao.findLieferantByAnsprechpartner(Ansprechpartner);
    }

	@Override
	public Lieferant findById(int id) {
		return dao.findById(id);
	}
}
