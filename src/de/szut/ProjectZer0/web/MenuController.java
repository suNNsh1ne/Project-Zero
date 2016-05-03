package de.szut.ProjectZer0.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.ArtikelstammService;
import de.szut.ProjectZer0.service.UserService;

// home.jsp erreichbar über Menü

@Controller
@RequestMapping("/menu")
public class MenuController {      
    
	//@Autowired
	ArtikelstammService artikelstammService;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/mitarbeiter")
	public String mitarbeiter() {
		
		return "mitarbeiter";
	}
	
	@RequestMapping("/artikelstammList")
	public String artikelstamm() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "artikelstammList";
	}
	
	@RequestMapping("/bestandsartikel")
	public String bestandsartikel() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "bestandsartikel";
	}
	
	@RequestMapping("/lieferant")
	public String lieferant() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "lieferant";
	}
	
	@RequestMapping(value = {"/artikelstammNew"}, method = RequestMethod.GET)
	public String artikelstammNew(ModelMap model) {
		Artikelstamm artikelstamm = new Artikelstamm();
        model.addAttribute("Artikelstamm", artikelstamm);
        model.addAttribute("edit", false);
        return "artikelstammNew";
	}
	
	@RequestMapping(value = { "/artikelstammNew" }, method = RequestMethod.POST)
    public String saveArtikelstamm(Artikelstamm artikelstamm, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "artikelstammNew";
        }
         
        artikelstammService.saveArtikelstamm(artikelstamm);
 
        //model.addAttribute("success", "Artikelstamm " + artikelstamm.getBezeichnung() + " registered successfully.");
        return "artikelstammList";
    }
}
