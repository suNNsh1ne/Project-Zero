package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.ArtikelstammDAO;
import de.szut.ProjectZer0.model.Artikelstamm;

@Service("ArtikelstammService")
@Transactional
public class ArtikelstammServiceImpl {
    @Autowired
    private ArtikelstammDAO dao;

 
    public void saveArtikelstamm(Artikelstamm Artikelstamm) {
        dao.saveArtikelstamm(Artikelstamm);
    }
 
    public void updateArtikelstamm(Artikelstamm Artikelstamm) {
    	Artikelstamm entity = dao.findById(Artikelstamm.getArtikelstammId());
        if(entity!=null){
        	entity.setBezeichnung((Artikelstamm.getBezeichnung()));
        }
    }
 
    public void deleteArtikelstammByBezeichnung(String Bezeichnung){
        dao.deleteArtikelstammByBezeichnung(Bezeichnung);
    }
    
 
    public List<Artikelstamm> getAllArtikelstamm() {
    	return dao.getAllArtikelstamm();
    }
 
    public Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung) {
    	return dao.findArtikelstammByBezeichnung(Bezeichnung);
    }


}
