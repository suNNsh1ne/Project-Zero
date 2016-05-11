package de.szut.ProjectZer0.dao;

import java.util.List;

import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;

public interface WarenausgangDAO {
	Bestandsartikel findById(int id);
	public void deleteWarenausgangById(String id);
    List<Bestandsartikel> getAllBestandsartikel();
}
