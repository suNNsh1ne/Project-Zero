package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Mitarbeiter;
import de.szut.ProjectZer0.service.MitarbeiterService;

@Controller
public class MitarbeiterController {

	@Autowired
	MitarbeiterService mitarbeiterService;
	
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
}
