package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Wareneingang;

public interface WareneingangDAO {
	Wareneingang findById(int id);
	public void deleteWareneingangById(String id);
    List<Wareneingang> getAllBestandsartikel();
}
