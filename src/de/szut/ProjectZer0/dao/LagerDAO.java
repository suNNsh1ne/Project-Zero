package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Lager;

public interface LagerDAO {
	public void saveLager(Lager lager);
	public List<Lager> listLager() ;
	public Lager getLager(Integer id);
	public void delLager(Lager lager);
	public List<Lager> getByName(String lagername);

}
