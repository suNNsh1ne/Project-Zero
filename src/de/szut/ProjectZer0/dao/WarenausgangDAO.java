package de.szut.ProjectZer0.dao;

import java.util.List;

import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;

public interface WarenausgangDAO {
	Bestandsartikel findById(int id);
    List<Bestandsartikel> getAllBestandsartikel();
}
