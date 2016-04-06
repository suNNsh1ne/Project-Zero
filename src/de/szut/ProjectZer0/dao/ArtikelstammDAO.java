package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Artikelstamm;

public interface ArtikelstammDAO {
	public void saveArtikelstamm(Artikelstamm artikelstamm);
	public List<Artikelstamm> listArtikelstamm() ;
	public Artikelstamm getArtikelstamm(Integer id);
	public void delArtikelstamm(Artikelstamm artikelstamm);
	public List<Artikelstamm> getByName(String artikelstammname);

}
