package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Bestandsartikel;
import de.szut.ProjectZer0.service.BestandsartikelService;

@Controller
public class BestandsartikelController {
	@Autowired
	BestandsartikelService bestandsartikelService;
	
	@RequestMapping(value = {"/bestandsartikelNew"}, method = RequestMethod.GET)
	public String bestandsartikelNew(ModelMap model) {
		Bestandsartikel bestandsartikel = new Bestandsartikel();
        model.addAttribute("Bestandsartikel", bestandsartikel);
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
        return "redirect:bestandsartikelList";
    }
	
	@RequestMapping(value = {"/bestandsartikelList"}, method = RequestMethod.GET)
	public String listAllBestandsartikel(ModelMap model)
	{
		List<Bestandsartikel> bestandsartikel = bestandsartikelService.getAllBestandsartikel();
		model.addAttribute("Bestandsartikel", bestandsartikel);
		return "bestandsartikelList";
	}
}
