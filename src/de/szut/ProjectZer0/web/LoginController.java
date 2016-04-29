package de.szut.ProjectZer0.web;

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

	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String erpLogin() {

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
			return "redirect:ListOfUser";
		}
	}

	@RequestMapping("/ListOfUser")
	private String returnUserList(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("user");
		System.out.println(user.getUsername());
		if(req.getSession().getAttribute("user") != null)
		{
			System.out.println("DRINNE");
			return "userList";
		}
		else
		{
			return "error";
		}
	}

	private User fetchFromDatabaseIfValid(String username, String password) {
		User user = userService.findUserByUsername(username);
		if (password.equals(user.getPassword())) {
			return user;
		}
		return null;
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

	/*static boolean validateUser(HttpServletRequest req) {
		Object userAttribute = req.getSession().getAttribute("user");
		if (user == userAttribute) {
			return true;
		} else {
			return false;
		}
	}
	*/
}
