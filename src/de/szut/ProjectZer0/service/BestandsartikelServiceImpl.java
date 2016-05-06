package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.BestandsartikelDAO;
import de.szut.ProjectZer0.model.Bestandsartikel;

@Service("BestandsartikelService")
@Transactional
public class BestandsartikelServiceImpl implements BestandsartikelService {
 
    @Autowired
    private BestandsartikelDAO dao;

 
    public void saveBestandsartikel(Bestandsartikel Bestandsartikel) {
        dao.saveBestandsartikel(Bestandsartikel);
    }
 
    public void updateBestandsartikel(Bestandsartikel Bestandsartikel) {
        Bestandsartikel entity = dao.findById(Bestandsartikel.getBestandsartikelId());
        if(entity!=null){
        	entity.setArtikelstamm(Bestandsartikel.getArtikelstamm());
    		entity.setAnzahl(Bestandsartikel.getAnzahl());
    		entity.setLager(Bestandsartikel.getLager());
    		entity.setWarenausgang(Bestandsartikel.getWarenausgang());
    		entity.setWareneingang(Bestandsartikel.getWareneingang());
        }
    }
 
    public void deleteBestandsartikelByArtikelstamm(String Artikelstamm){
        dao.deleteBestandsartikelByArtikelstamm(Artikelstamm);
    }
    
 
    public List<Bestandsartikel> getAllBestandsartikel() {
    	return dao.getAllBestandsartikel();
    }
 
    public Bestandsartikel findBestandsartikelByArtikelstamm(String Artikelstamm) {
    	return dao.findBestandsartikelByArtikelstamm(Artikelstamm);
    }

	@Override
	public Bestandsartikel findById(int id) {
		return dao.findById(id);
	}
}
