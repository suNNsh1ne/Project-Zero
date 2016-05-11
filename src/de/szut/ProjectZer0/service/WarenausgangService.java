package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;

public interface WarenausgangService {
	Bestandsartikel findById(int id);
	public void deleteWarenausgangById(String id);
    List<Bestandsartikel> getAllBestandsartikel();
}
