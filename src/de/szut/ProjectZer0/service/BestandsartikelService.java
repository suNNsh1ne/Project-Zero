package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.model.Bestandsartikel;

public interface BestandsartikelService {
	Bestandsartikel findById(int id);
    void saveBestandsartikel(Bestandsartikel user);  
    void deleteBestandsartikelByArtikelstamm(String Artikelstamm);
    List<Bestandsartikel> getAllBestandsartikel();
    void addArtikelstamm(int bestandsartikelId, Artikelstamm artikelstamm);
    Bestandsartikel findBestandsartikelByArtikelstamm(String Artikelstamm);
}
