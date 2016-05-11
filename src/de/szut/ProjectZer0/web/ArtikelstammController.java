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

	@RequestMapping(value = { "/artikelstammNew" }, method = RequestMethod.GET)
	public String artikelstammNew(HttpServletRequest req, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			Artikelstamm artikelstamm = new Artikelstamm();
			model.addAttribute("Artikelstamm", artikelstamm);
			model.addAttribute("Lieferanten", lieferantenService.getAllLieferant());
			model.addAttribute("edit", false);
			return "artikelstammNew";
		}
		return "redirect:login";
	}

	@RequestMapping(value = { "/artikelstammNew" }, method = RequestMethod.POST)
    public String saveArtikelstamm(@ModelAttribute("Artikelstamm")Artikelstamm artikelstamm,HttpServletRequest req, BindingResult result,
            ModelMap model) {
	if (req.getSession().getAttribute("user") != null){
        artikelstammService.saveArtikelstamm(artikelstamm);
 
        //model.addAttribute("success", "Artikelstamm " + artikelstamm.getBezeichnung() + " registered successfully.");
        return "artikelstammList";
}return"redirect:login";

	}

	@RequestMapping(value = {"/artikelstammList"}, method = RequestMethod.GET)
	public String listAllArtikelstamm(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("user") != null)
		{
			model.addAttribute("Artikelstamm", artikelstammService.getAllArtikelstamm());
			return "artikelstammList";
		}
		return "redirect:login";
	}
}
