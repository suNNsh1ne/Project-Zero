package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Wareneingang;

public interface WareneingangDAO {
	public void saveWareneingang(Wareneingang wareneingang);
	public List<Wareneingang> listWareneingang() ;
	public Wareneingang getWareneingang(Integer id);
	public void delWareneingang(Wareneingang wareneingang);
	public List<Wareneingang> getByName(String wareneingangname);

}
