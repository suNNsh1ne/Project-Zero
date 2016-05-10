package de.szut.ProjectZer0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.szut.ProjectZer0.dao.WareneingangDAO;
import de.szut.ProjectZer0.model.Wareneingang;

@Service("WareneingangService")
@Transactional
public class WareneingangServiceImpl implements WareneingangService {

	@Autowired
    private WareneingangDAO dao;
	
	@Override
	public Wareneingang findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Wareneingang> getAllBestandsartikel() {
		return dao.getAllBestandsartikel();
	}

}
