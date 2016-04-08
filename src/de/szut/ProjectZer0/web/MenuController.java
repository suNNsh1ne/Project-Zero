package de.szut.ProjectZer0.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.szut.ProjectZer0.dao.UserDAO;
import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.UserService;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    UserService userService; 
	
    
    
    
    
	@RequestMapping(value = { "/userNew" }, method = RequestMethod.GET)
    public String newAccount(ModelMap model) {
        User user = new User();
        model.addAttribute("User", user);
        model.addAttribute("edit", false);
        return "schimmel";
    }

    @RequestMapping(value = { "/userNew" }, method = RequestMethod.POST)
    public String saveAccount(User user, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "schimmel";
        }
         
        userService.saveUser(user);
 
        model.addAttribute("success", "User " + user.getUsername()+ " registered successfully PETER");
        return "success";
    }
    
    @RequestMapping(value = { "/", "/userList" }, method = RequestMethod.GET)
    public String listAllUser(ModelMap model){
    	
    	List<User> user = userService.getAllUser();
        model.addAttribute("User", user);
        return "allUser";
    }
	
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listAccounts(ModelMap model) {
 
        List<User> user = userService.getAllUser();
        model.addAttribute("User", user);
        return "allUser";
    }
    

    
    
    
	@RequestMapping("/mitarbeiter")
	public String mitarbeiter() {
		
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
