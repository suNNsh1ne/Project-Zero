package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Lieferant;
import de.szut.ProjectZer0.service.LieferantService;

@Controller
public class LieferantController {

	@Autowired
	LieferantService lieferantService;
	
	@RequestMapping(value = {"/generateLieferanten"}, method = RequestMethod.GET)
	public String generateLieferanten(ModelMap model) {
		Lieferant lieferant1 = new Lieferant();
		Lieferant lieferant2 = new Lieferant();
		lieferant1.setAnsprechpartner("Klaus");
		lieferant1.setAddresse("Delmenhorst");
		lieferant2.setAnsprechpartner("Peter");
		lieferant2.setAddresse("Bremen");
		lieferantService.saveLieferant(lieferant1);
		lieferantService.saveLieferant(lieferant2);
        return "home";
	}
	
	@RequestMapping(value = {"/lieferantNew"}, method = RequestMethod.GET)
	public String lieferantNew(ModelMap model) {
		Lieferant lieferant = new Lieferant();
        model.addAttribute("Lieferant", lieferant);
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
        return "redirect:lieferantList";
    }
	
	@RequestMapping(value = {"/lieferantList"}, method = RequestMethod.GET)
	public String listAllLieferant(ModelMap model)
	{
		List<Lieferant> lieferant = lieferantService.getAllLieferant();
		model.addAttribute("Lieferant", lieferant);
		return "lieferantList";
	}
}
