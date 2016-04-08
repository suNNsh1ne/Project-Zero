package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Mitarbeiter;

public interface MitarbeiterService {
	Mitarbeiter findById(int id);
    void saveUser(Mitarbeiter user);  
    void deleteUserByUsername(String username);
    List<Mitarbeiter> getAllMitarbeiter();
    Mitarbeiter findUserByUsername(String username);
     
}
