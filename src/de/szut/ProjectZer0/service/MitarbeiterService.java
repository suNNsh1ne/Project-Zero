package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Mitarbeiter;

public interface MitarbeiterService {
	Mitarbeiter findById(int id);
    void saveMitarbeiter(Mitarbeiter mitarbeiter);  
    void deleteMitarbeiterByName(String Name);
    public void deleteMitarbeiterById(String id);
    List<Mitarbeiter> getAllMitarbeiter();
    Mitarbeiter findMitarbeiterByName(String Name);
     
}
