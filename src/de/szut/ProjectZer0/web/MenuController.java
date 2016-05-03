package de.szut.ProjectZer0.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.UserService;

// home.jsp erreichbar über Menü

@Controller
public class MenuController {   
	
	@Autowired
	UserService userService;
    
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = {"/userlist"}, method = RequestMethod.GET)
	public String listAllUser(HttpServletRequest req, ModelMap model)
	{
		if(req.getSession().getAttribute("user") != null)
		{
			List<User> user = userService.getAllUser();
			model.addAttribute("User", user);
			return "userList";
		}
		else
		{
			return "error";
		}
	}
	
	@RequestMapping("/mitarbeiter")
	public String mitarbeiter() {
		
		return "mitarbeiter";
	}
	
	@RequestMapping("/artikelstammList")
	public String artikelstamm() {
		//ModelMap map = new ModelMap();

		//map.addAttribute("login", new User());
		return "artikelstammList";
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
