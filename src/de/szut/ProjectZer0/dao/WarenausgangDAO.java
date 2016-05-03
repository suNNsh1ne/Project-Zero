package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Warenausgang;

public interface WarenausgangDAO {
	Warenausgang findById(int id);
    List<Warenausgang> getAllBestandsartikel();
}
