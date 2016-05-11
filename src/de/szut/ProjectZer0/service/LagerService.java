package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Lager;

public interface LagerService {
	Lager findById(int id);
    void saveLager(Lager lager);  
    void deleteLagerByName(String name);
    public void deleteLagerById(String id);
    List<Lager> getAllLager();
    Lager findLagerByName(String name);
     
}
