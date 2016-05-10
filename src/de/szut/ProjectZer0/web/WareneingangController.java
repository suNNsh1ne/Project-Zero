package de.szut.ProjectZer0.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.szut.ProjectZer0.model.Wareneingang;
import de.szut.ProjectZer0.service.WareneingangService;

@Controller
public class WareneingangController {
	@Autowired
	WareneingangService wareneingangService;
	
	@RequestMapping(value = {"/wareneingangList"}, method = RequestMethod.GET)
	public String listAllWareneingang(ModelMap model)
	{
		List<Wareneingang> wareneingang = wareneingangService.getAllBestandsartikel();
		model.addAttribute("Wareneingang", wareneingang);
		return "wareneingangList";
	}
}
