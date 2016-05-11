package de.szut.ProjectZer0.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Warenausgang;
import de.szut.ProjectZer0.service.WarenausgangService;

@Controller
public class WarenausgangController {
	@Autowired
	WarenausgangService warenausgangService;
	
	@RequestMapping(value = {"/warenausgangList"}, method = RequestMethod.GET)
	public String listAllWarenausgang(ModelMap model)
	{
		List<Bestandsartikel> bestandsartikel = warenausgangService.getAllBestandsartikel();
		model.addAttribute("Bestandsartikel", bestandsartikel);
		return "warenausgangList";
	}
}
