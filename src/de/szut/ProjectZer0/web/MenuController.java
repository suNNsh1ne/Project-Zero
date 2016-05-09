package de.szut.ProjectZer0.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.model.Lager;
import de.szut.ProjectZer0.model.Lieferant;
import de.szut.ProjectZer0.model.Mitarbeiter;
import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.ArtikelstammService;
import de.szut.ProjectZer0.service.BestandsartikelService;
import de.szut.ProjectZer0.service.LagerService;
import de.szut.ProjectZer0.service.LieferantService;
import de.szut.ProjectZer0.service.MitarbeiterService;
import de.szut.ProjectZer0.service.UserService;

// home.jsp erreichbar über Menü

@Controller
public class MenuController {   
	
	@Autowired
	UserService userService;
    
	@Autowired
	ArtikelstammService artikelstammService;
	
	@Autowired
	MitarbeiterService mitarbeiterService;
	
	@Autowired
	BestandsartikelService bestandsartikelService;
	
	@Autowired
	LagerService lagerService;
	
	@Autowired
	LieferantService lieferantService;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = {"/userlist"}, method = RequestMethod.GET)
	public String listAllUser(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("user") != null)
		{
			List<User> user = userService.getAllUser();
			model.addAttribute("User", user);
			return "userList";
		}
		else
		{
			return "error";
		}
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
	
	@RequestMapping(value = {"/artikelstammList"}, method = RequestMethod.GET)
	public String listAllArtikelstamm(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("artikelstamm") != null)
		{
			List<Artikelstamm> artikelstamm = artikelstammService.getAllArtikelstamm();
			model.addAttribute("Artikelstamm", artikelstamm);
			return "artikelstammList";
		}
		else
		{
			return "error";
		}
	}
	
	
	
	@RequestMapping(value = {"/mitarbeiterNew"}, method = RequestMethod.GET)
	public String mitarbeiterNew(ModelMap model) {
		Mitarbeiter mitarbeiter = new Mitarbeiter();
        model.addAttribute("Mitarbeiter", mitarbeiter);
        model.addAttribute("edit", false);
        return "mitarbeiterNew";
	}
	
	@RequestMapping(value = { "/mitarbeiterNew" }, method = RequestMethod.POST)
    public String saveMitarbeiter(Mitarbeiter mitarbeiter, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "mitarbeiterNew";
        }
         
        mitarbeiterService.saveMitarbeiter(mitarbeiter);
 
        //model.addAttribute("success", "Mitarbeiter " + mitarbeiter.getBezeichnung() + " registered successfully.");
        return "mitarbeiterList";
    }
	
	@RequestMapping(value = {"/mitarbeiterList"}, method = RequestMethod.GET)
	public String listAllMitarbeiter(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("mitarbeiter") != null)
		{
			List<Mitarbeiter> mitarbeiter = mitarbeiterService.getAllMitarbeiter();
			model.addAttribute("Mitarbeiter", mitarbeiter);
			return "mitarbeiterList";
		}
		else
		{
			return "error";
		}
	}
	
	
	
	@RequestMapping(value = {"/bestandsartikelNew"}, method = RequestMethod.GET)
	public String bestandsartikelNew(ModelMap model) {
		Bestandsartikel bestandsartikel = new Bestandsartikel();
        model.addAttribute("bestandsartikel", bestandsartikel);
        model.addAttribute("edit", false);
        return "bestandsartikelNew";
	}
	
	@RequestMapping(value = { "/bestandsartikelNew" }, method = RequestMethod.POST)
    public String saveBestandsartikel(Bestandsartikel bestandsartikel, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "bestandsartikelNew";
        }
         
        bestandsartikelService.saveBestandsartikel(bestandsartikel);
 
        //model.addAttribute("success", "Bestandsartikel " + bestandsartikel.getBezeichnung() + " registered successfully.");
        return "bestandsartikelList";
    }
	
	@RequestMapping(value = {"/bestandsartikelList"}, method = RequestMethod.GET)
	public String listAllBestandsartikel(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("bestandsartikel") != null)
		{
			List<Bestandsartikel> bestandsartikel = bestandsartikelService.getAllBestandsartikel();
			model.addAttribute("Bestandsartikel", bestandsartikel);
			return "bestandsartikelList";
		}
		else
		{
			return "error";
		}
	}
	
	
	
	@RequestMapping(value = {"/lagerNew"}, method = RequestMethod.GET)
	public String lagerNew(ModelMap model) {
		Lager lager = new Lager();
        model.addAttribute("Lager", lager);
        model.addAttribute("edit", false);
        return "lagerNew";
	}
	
	@RequestMapping(value = { "/lagerNew" }, method = RequestMethod.POST)
    public String saveLager(Lager lager, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "lagerNew";
        }
         
        lagerService.saveLager(lager);
 
        //model.addAttribute("success", "Lager " + lager.getBezeichnung() + " registered successfully.");
        return "lagerList";
    }
	
	@RequestMapping(value = {"/lagerList"}, method = RequestMethod.GET)
	public String listAllLager(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("lager") != null)
		{
			List<Lager> lager = lagerService.getAllLager();
			model.addAttribute("Lager", lager);
			return "lagerList";
		}
		else
		{
			return "error";
		}
	}
	
	
	
	@RequestMapping(value = {"/lieferantNew"}, method = RequestMethod.GET)
	public String lieferantNew(ModelMap model) {
		Lieferant lieferant = new Lieferant();
        model.addAttribute("lieferant", lieferant);
        model.addAttribute("edit", false);
        return "lieferantNew";
	}
	
	@RequestMapping(value = { "/lieferantNew" }, method = RequestMethod.POST)
    public String saveLieferant(Lieferant lieferant, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "lieferantNew";
        }
         
        lieferantService.saveLieferant(lieferant);
 
        //model.addAttribute("success", "Lieferant " + lieferant.getBezeichnung() + " registered successfully.");
        return "lieferantList";
    }
	
	@RequestMapping(value = {"/lieferantList"}, method = RequestMethod.GET)
	public String listAllLieferant(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("lieferant") != null)
		{
			List<Lieferant> lieferant = lieferantService.getAllLieferant();
			model.addAttribute("Lieferant", lieferant);
			return "lieferantList";
		}
		else
		{
			return "error";
		}
	}
}
