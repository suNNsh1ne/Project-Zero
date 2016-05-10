package de.szut.ProjectZer0.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Lager;
import de.szut.ProjectZer0.service.LagerService;

@Controller
public class LagerController {
	@Autowired
	LagerService lagerService;
	
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
	public String listAllLager(ModelMap model)
	{
		List<Lager> lager = lagerService.getAllLager();
		model.addAttribute("Lager", lager);
		return "lagerList";
	}
}
