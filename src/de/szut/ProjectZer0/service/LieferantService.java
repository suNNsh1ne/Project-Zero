package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Lieferant;

public interface LieferantService {
	Lieferant findById(int id);
    void saveLieferant(Lieferant lieferant);  
    void deleteLieferantByAnsprechpartner(String Ansprechpartner);
    public void deleteLieferantById(String id);
    List<Lieferant> getAllLieferant();
    Lieferant findLieferantByAnsprechpartner(String Ansprechpartner);
}
