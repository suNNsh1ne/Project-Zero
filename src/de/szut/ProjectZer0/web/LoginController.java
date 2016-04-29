package de.szut.ProjectZer0.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.UserService;

@Controller
public class LoginController {
		
	@Autowired
	UserService userService;	
	
	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String erpLogin() {
		
		return "login";
	}

	@RequestMapping("/loginCheck")
	public String erpLoginCheck(@ModelAttribute("username") String sUsername, @ModelAttribute("password") String sPassword) 
	{	
		try
		{
		User checkUser = userService.findUserByUsername(sUsername);
		
		if(sPassword.equals(checkUser.getPassword()))
			{
				return "successLogin";
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Kein User mit dem Namen gefunden");
			return "error";
		}
		return "error";
	}

	@RequestMapping("/loginError")
	public ModelAndView erpLoginError() {
		ModelMap map = new ModelMap();
		return new ModelAndView("error", map);
	}

	@RequestMapping("/successLogin")
	public ModelAndView erpLoginSuccessfull() {
		ModelMap map = new ModelMap();
		return new ModelAndView("successLogin", map);
	}
	
	
	// Testdaten hinzufügen TODO: Mehrere Datenpakete
	@RequestMapping("/generateTestData")
	public ModelAndView generateData() {
		ModelMap map = new ModelMap();
		
		System.out.println("test erfolgreich");

		return new ModelAndView("redirect:login", map);
	}
}
