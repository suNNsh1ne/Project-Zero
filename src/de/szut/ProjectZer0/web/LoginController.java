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
		
	@RequestMapping("/login")
	public String erpLogin() {
		
		return "login";
	}

	@RequestMapping("/loginCheck")
	public ModelAndView erpLoginCheck(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
		
		//userDAO = userDAO.getByName(username);
		
		
		ModelMap map = new ModelMap();
		return new ModelAndView("loginCheck", map);
	}

	@RequestMapping("/loginError")
	public ModelAndView erpLoginError() {
		ModelMap map = new ModelMap();
		return new ModelAndView("error", map);
	}

	@RequestMapping("/successfullLogin")
	public ModelAndView erpLoginSuccessfull() {
		ModelMap map = new ModelMap();
		return new ModelAndView("successfullLogin", map);
	}
	
	@RequestMapping("/generateTestData")
	public ModelAndView generateData() {
		ModelMap map = new ModelMap();
		
		System.out.println("test erfolgreich");

		return new ModelAndView("redirect:login", map);
	}
}
