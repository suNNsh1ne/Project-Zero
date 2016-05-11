package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Lager;

public interface LagerDAO {
	Lager findById(int id);
    void saveLager(Lager user);  
    void deleteLagerByName(String name);
    public void deleteLagerById(String id);
    List<Lager> getAllLager();
    Lager findLagerByName(String name);
}
