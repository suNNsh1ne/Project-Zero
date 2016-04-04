package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Bestandsartikel;

public interface BestandsartikelDAO {
	public void saveBestandsartikel(Bestandsartikel bestandsartikel);
	public List<Bestandsartikel> listBestandsartikel() ;
	public Bestandsartikel getBestandsartikel(Integer id);
	public void delBestandsartikel(Bestandsartikel bestandsartikel);
	public List<Bestandsartikel> getByName(String bestandsartikelname);

}
