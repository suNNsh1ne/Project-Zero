package de.szut.ProjectZer0.service;

import java.util.List;
import de.szut.ProjectZer0.model.Artikelstamm;


public interface ArtikelstammService {
	Artikelstamm findById(int id);
    void saveArtikelstamm(Artikelstamm artikelstamm);  
    void deleteArtikelstammByBezeichnung(String Bezeichnung);
    List<Artikelstamm> getAllArtikelstamm();
    Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung);
}
