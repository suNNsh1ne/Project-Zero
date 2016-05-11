package de.szut.ProjectZer0.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.ArtikelstammDAO;
import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Lieferant;

@Service("ArtikelstammService")
@Transactional
public class ArtikelstammServiceImpl implements ArtikelstammService{
	
    @Autowired
    private ArtikelstammDAO dao;

 
    public void saveArtikelstamm(Artikelstamm Artikelstamm) {
        dao.saveArtikelstamm(Artikelstamm);
    }
 
    public void updateArtikelstamm(Artikelstamm Artikelstamm) {
    	Artikelstamm entity = dao.findById(Artikelstamm.getArtikelstammId());
        if(entity!=null){
        	entity.setBezeichnung((Artikelstamm.getBezeichnung()));
        	entity.setBeschreibung((Artikelstamm.getBeschreibung()));
        	entity.setKategorie((Artikelstamm.getKategorie()));
        	entity.setPreis((Artikelstamm.getPreis()));
        }
    }
    
 
    public List<Artikelstamm> getAllArtikelstamm() {
    	return dao.getAllArtikelstamm();
    }
 
    public Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung) {
    	return dao.findArtikelstammByBezeichnung(Bezeichnung);
    }

	@Override
	public Artikelstamm findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void addLieferant(int artikelstammId, Lieferant lieferant) {
		Artikelstamm object = dao.findById(artikelstammId);
        if(object!=null){
        	Set<Lieferant> tempLieferant = object.getLieferantZuweisung();
        	tempLieferant.add(lieferant);
        	object.setLieferantZuweisung(tempLieferant);
        }
		
	}

	@Override
	public void addBestandsartikel(int artikelstammId, Bestandsartikel bestandsartikel) {
		Artikelstamm object = dao.findById(artikelstammId);
        if(object!=null){
        	Set<Bestandsartikel> tempBestandsartikel = object.getBestandsartikel();
        	tempBestandsartikel.add(bestandsartikel);
        	object.setBestandsartikel(tempBestandsartikel);
        }
	}

	@Override
	public void deleteArtikelstammById(String id) {
		dao.deleteArtikelstammById(id);
		
	}


}
