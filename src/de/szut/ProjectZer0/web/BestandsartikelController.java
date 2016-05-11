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
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.service.ArtikelstammService;
import de.szut.ProjectZer0.service.BestandsartikelService;
/*
 * Dieser Controller ist für das Mapping des Models bzw. der Tabelle Bestandsartikel zuständig.
 * Es existieren Mappings für die JSPs zum anlegen neuer Datensätze (BestandsartikelNew) 
 * sowie dem anzeigen (BestandsartikelList) dieser.
 */

@Controller
public class BestandsartikelController {
	@Autowired
	BestandsartikelService bestandsartikelService;

	/*
	 * Dieses Mapping erstellt ein leeres Bestandsartikel Objekt und gibt 
	 * dieses über die ModelMap an die JSP weiter.
	 */
	@RequestMapping(value = { "/bestandsartikelNew" }, method = RequestMethod.GET)
	public String bestandsartikelNew(HttpServletRequest req, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			Bestandsartikel bestandsartikel = new Bestandsartikel();
			model.addAttribute("Bestandsartikel", bestandsartikel);
			model.addAttribute("edit", false);
			return "bestandsartikelNew";
		}
		return "redirect:login";
	}

	/*
	 * Dieses Mapping empfängt das nun mit Daten gefüllte Objekt und 
	 * speichert es über unseren BestandsartikelService in der Datenbank.
	 */
	@RequestMapping(value = { "/bestandsartikelNew" }, method = RequestMethod.POST)
	public String saveBestandsartikel(HttpServletRequest req, @ModelAttribute Bestandsartikel bestandsartikel, BindingResult result,
			ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			if (result.hasErrors()) {
				return "bestandsartikelNew";
			}
			
			bestandsartikelService.saveBestandsartikel(bestandsartikel);
			
			// model.addAttribute("success", "Bestandsartikel " +
			// bestandsartikel.getBezeichnung() + " registered successfully.");
			return "redirect:bestandsartikelList";
		}
		return "redirect:login";
	}

	/*
	 * Dieses Mapping zum anzeigen aller Datensätze der Bestandsartikel Tabelle in der Datenbank da.
	 * Alle Datensätze werden über den BestandsartikelService aus der Datenbank geholt und über die 
	 * ModelMap an die JSP übergeben
	 */
	@RequestMapping(value = { "/bestandsartikelList" }, method = RequestMethod.GET)
	public String listAllBestandsartikel(HttpServletRequest req, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			List<Bestandsartikel> bestandsartikel = bestandsartikelService.getAllBestandsartikel();
			model.addAttribute("Bestandsartikel", bestandsartikel);
			return "bestandsartikelList";
		}
		return "redirect:login";
	}
}
