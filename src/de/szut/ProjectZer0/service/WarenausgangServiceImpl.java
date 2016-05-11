package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.WarenausgangDAO;
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;

@Service("WarenausgangService")
@Transactional
public class WarenausgangServiceImpl implements WarenausgangService {

	@Autowired
    private WarenausgangDAO dao;
	
	@Override
	public Bestandsartikel findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Bestandsartikel> getAllBestandsartikel() {
		return dao.getAllBestandsartikel();
	}

}
