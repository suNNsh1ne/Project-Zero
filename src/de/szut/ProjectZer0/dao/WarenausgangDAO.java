package de.szut.ProjectZer0.dao;

import java.util.List;
import de.szut.ProjectZer0.model.Warenausgang;


public interface WarenausgangDAO {
	public void saveWarenausgang(Warenausgang warenausgang);
	public List<Warenausgang> listWarenausgang() ;
	public Warenausgang getWarenausgang(Integer id);
	public void delWarenausgang(Warenausgang warenausgang);
	public List<Warenausgang> getByName(String warenausgangname);

}
