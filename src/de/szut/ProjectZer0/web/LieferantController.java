package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import de.szut.ProjectZer0.model.Lieferant;
import de.szut.ProjectZer0.service.LieferantService;
/*
 * Dieser Controller ist für das Mapping des Models bzw. der Tabelle Lieferant zuständig.
 * Es existieren Mappings für die JSPs zum anlegen neuer Datensätze (LieferantNew) 
 * sowie dem anzeigen (LieferantList) dieser.
 */

@Controller
public class LieferantController {

	@Autowired
	LieferantService lieferantService;

	@RequestMapping(value = {"/generateLieferanten"}, method = RequestMethod.GET)
	public String generateLieferanten(ModelMap model) {
		Lieferant lieferant1 = new Lieferant();
		Lieferant lieferant2 = new Lieferant();
		lieferant1.setAnsprechpartner("Klaus");
		lieferant1.setAdresse("Delmenhorst");
		lieferant2.setAnsprechpartner("Peter");
		lieferant2.setAdresse("Bremen");
		lieferantService.saveLieferant(lieferant1);
		lieferantService.saveLieferant(lieferant2);
        return "home";
	}
	
	/*
	 * Dieses Mapping erstellt ein leeres Lieferant Objekt und gibt 
	 * dieses über die ModelMap an die JSP weiter.
	 */
	@RequestMapping(value = { "/lieferantNew" }, method = RequestMethod.GET)
	public String lieferantNew(HttpServletRequest req, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			Lieferant lieferant = new Lieferant();
			model.addAttribute("Lieferant", lieferant);
			model.addAttribute("edit", false);
			return "lieferantNew";
		}
		return "redirect:login";
	}

	/*
	 * Dieses Mapping empfängt das nun mit Daten gefüllte Objekt und 
	 * speichert es über unseren LieferantService in der Datenbank.
	 */
	@RequestMapping(value = { "/lieferantNew" }, method = RequestMethod.POST)
	public String saveLieferant(HttpServletRequest req, Lieferant lieferant, BindingResult result, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {

			if (result.hasErrors()) {
				return "lieferantNew";
			}

			lieferantService.saveLieferant(lieferant);

			// model.addAttribute("success", "Lieferant " +
			// lieferant.getBezeichnung() + " registered successfully.");
			return "redirect:lieferantList";
		}
		return "redirect:login";
	}

	/*
	 * Dieses Mapping zum anzeigen aller Datensätze der Lieferant Tabelle in der Datenbank da.
	 * Alle Datensätze werden über den LieferantService aus der Datenbank geholt und über die 
	 * ModelMap an die JSP übergeben
	 */
	@RequestMapping(value = { "/lieferantList" }, method = RequestMethod.GET)
	public String listAllLieferant(HttpServletRequest req, ModelMap model) {
		if (req.getSession().getAttribute("user") != null) {
			List<Lieferant> lieferant = lieferantService.getAllLieferant();
			model.addAttribute("Lieferant", lieferant);
			return "lieferantList";
		}
		return "redirect:login";
	}
	
	/*
	 * Dieses Mapping dient dazu einen bestimmten Lieferanten aus der Tabelle zu löschen
	 */
	@RequestMapping(value = "/lieferantDel", method = RequestMethod.POST)
	public String lieferantDelete(ModelMap model, @RequestParam String lieferantId){
		
		lieferantService.deleteLieferantById(lieferantId);
		return "redirect:lieferantList";
	}
}
