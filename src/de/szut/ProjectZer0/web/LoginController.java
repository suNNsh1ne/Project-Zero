package de.szut.ProjectZer0.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import de.szut.ProjectZer0.model.User;

@Controller
public class LoginController {

	//@Autowired
	//private UserDAO userDAO;

	@RequestMapping("/login.htm")
	public ModelAndView erpLogin() {
		ModelMap map = new ModelMap();

		map.addAttribute("login", new User());
		return new ModelAndView("login/login", map);
	}

	@RequestMapping("/loginCheck.htm")
	public ModelAndView erpLoginCheck() {
		
		/* zum testen
		 Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Employee");
        List<Employee> empList = query.list();
        for(Employee emp : empList){
            System.out.println("List of Employees::"+emp.getId()+","+emp.getAddress().getCity());
        }
		 */
		ModelMap map = new ModelMap();
		map.addAttribute("login", new User());
		return new ModelAndView("login/loginCheck", map);
	}

	@RequestMapping("/loginError.htm")
	public ModelAndView erpLoginError() {
		ModelMap map = new ModelMap();
		map.addAttribute("login", new User());
		return new ModelAndView("login/error", map);
	}

	@RequestMapping("/successfullLogin.htm")
	public ModelAndView erpLoginSuccessfull() {
		ModelMap map = new ModelMap();
		map.addAttribute("login", new User());
		return new ModelAndView("login/successfullLogin", map);
	}
}
