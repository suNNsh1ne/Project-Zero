package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import de.szut.ProjectZer0.dao.WarenausgangDAO;
import de.szut.ProjectZer0.model.Warenausgang;

public class WarenausgangServiceImpl implements WarenausgangService {

	@Autowired
    private WarenausgangDAO dao;
	
	@Override
	public Warenausgang findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Warenausgang> getAllBestandsartikel() {
		return dao.getAllBestandsartikel();
	}

}
