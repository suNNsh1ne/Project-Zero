package de.szut.ProjectZer0.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.UserService;
/*
 * Dieser Controller ist für den Login sowie den Logout eines Benutzers zuständig
 */

@Controller
public class LoginController {

	boolean firstTime = true;

	@Autowired
	UserService userService;

	/*
	 * Dieses Mapping beinhaltet das setzten zweier Standard
	 * Benutzer beim erstmaligem aufruf des Logins
	 */
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
	public String erpLogin() {
		if (firstTime == true) {
			User user = new User();
			user.setPassword("admin");
			user.setUsername("admin");
			user.setPermissionPriority(3);
			userService.saveUser(user);

			User user2 = new User();
			user2.setPassword("root");
			user2.setUsername("alpine");
			user2.setPermissionPriority(3);
			userService.saveUser(user2);
			firstTime = false;
		}

		return "login";
	}

	/*
	 * Dieses Mapping prüft ob ein Login versuch korrekt war oder nicht und
	 * setzt dementsprechend einen User in die Session
	 */
	@RequestMapping("/loginCheck")
	public String erpLoginCheck(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = fetchFromDatabaseIfValid(username, password);

		if (user == null) {
			// send 'no user/password match' message
			return "redirect:login";
		}
		req.getSession().setAttribute("user", user);
		// send 'successful login' screen
		return "redirect:home";
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

	/*
	 * Mit diesem Mapping wird ein Logout durchgeführt indem das
	 * "user" Attribut der Session auf null gesetzt wird
	 */
	@RequestMapping("/logout")
	private String returnUserList(HttpServletRequest req) {
		if (req.getSession().getAttribute("user") != null) {
			req.getSession().setAttribute("user", null);
			return "login";
		}
		return "redirect:login";
	}
}
