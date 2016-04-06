package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Mitarbeiter;

public interface MitarbeiterDAO {
	public void saveMitarbeiter(Mitarbeiter mitarbeiter);
	public List<Mitarbeiter> listMitarbeiter() ;
	public Mitarbeiter getMitarbeiter(Integer id);
	public void delMitarbeiter(Mitarbeiter mitarbeiter);
	public List<Mitarbeiter> getByName(String mitarbeitername);

}
