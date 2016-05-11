package de.szut.ProjectZer0.dao;

import java.util.List;

import de.szut.ProjectZer0.model.Artikelstamm;

public interface ArtikelstammDAO {
	Artikelstamm findById(int id);
    void saveArtikelstamm(Artikelstamm artikelstamm);  
    public void deleteArtikelstammById(String id);
    List<Artikelstamm> getAllArtikelstamm();
    Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung);

}
