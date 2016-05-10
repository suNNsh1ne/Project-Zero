package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Artikelstamm;
import de.szut.ProjectZer0.service.ArtikelstammService;
import de.szut.ProjectZer0.service.LieferantService;

@Controller
public class ArtikelstammController {
	@Autowired
	ArtikelstammService artikelstammService;
	@Autowired 
	LieferantService lieferantenService;
	
	@RequestMapping(value = {"/artikelstammNew"}, method = RequestMethod.GET)
	public String artikelstammNew(ModelMap model) {
		Artikelstamm artikelstamm = new Artikelstamm();
        model.addAttribute("Artikelstamm", artikelstamm);
        model.addAttribute("Lieferanten", lieferantenService.getAllLieferant());
        model.addAttribute("edit", false);
        return "artikelstammNew";
	}
	
	@RequestMapping(value = { "/artikelstammNew" }, method = RequestMethod.POST)
    public String saveArtikelstamm(@ModelAttribute("Artikelstamm")Artikelstamm artikelstamm, BindingResult result,
            ModelMap model) {
 
        artikelstammService.saveArtikelstamm(artikelstamm);
 
        //model.addAttribute("success", "Artikelstamm " + artikelstamm.getBezeichnung() + " registered successfully.");
        return "artikelstammList";
    }
	
	@RequestMapping(value = {"/artikelstammList"}, method = RequestMethod.GET)
	public String listAllArtikelstamm(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("artikelstamm") != null)
		{
			model.addAttribute("Artikelstamm", artikelstammService.getAllArtikelstamm());
			return "artikelstammList";
		}
		else
		{
			return "error";
		}
	}
}
