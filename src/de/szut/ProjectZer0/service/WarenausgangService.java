package de.szut.ProjectZer0.service;

import java.util.List;

import de.szut.ProjectZer0.model.Warenausgang;

public interface WarenausgangService {
	Warenausgang findById(int id);
    List<Warenausgang> getAllBestandsartikel();
}
