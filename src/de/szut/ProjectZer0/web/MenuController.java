package de.szut.ProjectZer0.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import de.szut.ProjectZer0.dao.UserDAO;
import de.szut.ProjectZer0.model.User;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@RequestMapping("/test")
	public String test() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "test";
	}
	
	
	@RequestMapping("/user")
	public String user() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "user";
	}
	
	@RequestMapping("/mitarbeiter")
	public String mitarbeiter() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "mitarbeiter";
	}
	
	@RequestMapping("/artikelstamm")
	public String artikelstamm() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "artikelstamm";
	}
	
	@RequestMapping("/bestandsartikel")
	public String bestandsartikel() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "bestandsartikel";
	}
	
	@RequestMapping("/lieferant")
	public String lieferant() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "lieferant";
	}
	
}
