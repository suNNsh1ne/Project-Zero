package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Lieferant;

public interface LieferantDAO {
	public void saveLieferant(Lieferant lieferant);
	public List<Lieferant> listLieferant() ;
	public Lieferant getLieferant(Integer id);
	public void delLieferant(Lieferant lieferant);
	public List<Lieferant> getByName(String lieferantname);

}
