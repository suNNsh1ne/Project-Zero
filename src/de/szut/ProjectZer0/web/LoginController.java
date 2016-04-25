package de.szut.ProjectZer0.web;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/loginError.htm")
	public ModelAndView erpLoginError() {
		ModelMap map = new ModelMap();
		return new ModelAndView("error", map);
	}

	@RequestMapping("/successfullLogin.htm")
	public ModelAndView erpLoginSuccessfull() {
		ModelMap map = new ModelMap();
		return new ModelAndView("successfullLogin", map);
	}
	
	@RequestMapping("/generateTestData")
	public ModelAndView generateData() {
		ModelMap map = new ModelMap();
		
		System.out.println("test erfolgreich");

		return new ModelAndView("redirect:login.htm", map);
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelMap map = new ModelMap();

		return new ModelAndView("/register", map);
	}
}
