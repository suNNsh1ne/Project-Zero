package de.szut.ProjectZer0.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	boolean firstTime = true;

	@Autowired
	UserService userService;	
	
	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String erpLogin() {
		if(firstTime == true)
		{
		User user = new User();
		user.setPassword("admin");
		user.setUsername("admin");
		user.setPermissionPriority(3);
		userService.saveUser(user);
		firstTime=false;
		}
		
		return "login";
	}

	@RequestMapping("/loginCheck")
	public String erpLoginCheck(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = fetchFromDatabaseIfValid(username, password);

		if (user == null) {
			// send 'no user/password match' message
			return "error";
		} else {
			req.getSession().setAttribute("user", user);
			// send 'successful login' screen
			return "redirect:home";
		}
	}

	private User fetchFromDatabaseIfValid(String username, String password) {
		User user = userService.findUserByUsername(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	// Testdaten hinzufügen TODO: Mehrere Datenpakete
	@RequestMapping("/generateTestData")
	public ModelAndView generateData() {
		ModelMap map = new ModelMap();

		System.out.println("test erfolgreich");

		return new ModelAndView("redirect:login", map);
	}
	
	
	@RequestMapping("/logout")
	private String returnUserList(HttpServletRequest req) {
		if(req.getSession().getAttribute("user") != null)
		{
			req.getSession().setAttribute("user", null);
			return "login";
		}
		else
		{
			return "error";
		}
	}
}
