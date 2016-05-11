package de.szut.ProjectZer0.service;

import java.util.List;
import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Lieferant;


public interface ArtikelstammService {
	Artikelstamm findById(int id);
    void saveArtikelstamm(Artikelstamm artikelstamm);  
    public void deleteArtikelstammById(String id);
    List<Artikelstamm> getAllArtikelstamm();
    void addLieferant(int artikelstammId, Lieferant lieferant);
    void addBestandsartikel(int artikelstammId, Bestandsartikel bestandsartikel);
    Artikelstamm findArtikelstammByBezeichnung(String Bezeichnung);
}
