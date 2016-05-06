package de.szut.ProjectZer0.dao;

import java.util.List;

import de.szut.ProjectZer0.model.Bestandsartikel;


public interface BestandsartikelDAO {
	Bestandsartikel findById(int id);
    void saveBestandsartikel(Bestandsartikel bestandsartikel);  
    void deleteBestandsartikelByArtikelstamm(String Artikelstamm);
    List<Bestandsartikel> getAllBestandsartikel();
    Bestandsartikel findBestandsartikelByArtikelstamm(String Artikelstamm);
}
