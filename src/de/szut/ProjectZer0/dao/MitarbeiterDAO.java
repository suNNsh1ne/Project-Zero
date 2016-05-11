package de.szut.ProjectZer0.dao;

import java.util.List;

import de.szut.ProjectZer0.model.Mitarbeiter;

public interface MitarbeiterDAO {
	Mitarbeiter findById(int id);
    void saveMitarbeiter(Mitarbeiter mitarbeiter);  
    void deleteMitarbeiterByName(String Name);
    public void deleteMitarbeiterById(String id);
    List<Mitarbeiter> getAllMitarbeiter();
    Mitarbeiter findMitarbeiterByName(String Name);

}
