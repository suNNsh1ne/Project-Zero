package de.szut.ProjectZer0.service;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.BestandsartikelDAO;
import de.szut.ProjectZer0.model.Artikelstamm;
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
    		entity.setAnzahl(Bestandsartikel.getAnzahl());
        }
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

	@Override
	public void addArtikelstamm(int bestandsartikelId, Artikelstamm artikelstamm) {
		Bestandsartikel object = dao.findById(bestandsartikelId);
		if(object!=null){
		 object.setArtikelstamm(artikelstamm);
		}
		
	}

	@Override
	public void deleteBestandsartikelById(String id) {
		dao.deleteBestandsartikelById(id);
		
	}
}
