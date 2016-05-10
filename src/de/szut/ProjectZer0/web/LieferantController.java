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
