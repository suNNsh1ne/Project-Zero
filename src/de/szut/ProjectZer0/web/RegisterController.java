package de.szut.ProjectZer0.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.szut.ProjectZer0.model.User;
import de.szut.ProjectZer0.service.UserService;

@Controller
public class RegisterController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String register(ModelMap model) {
		User user = new User();
        model.addAttribute("User", user);
        model.addAttribute("edit", false);
        return "register";
	}
	
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
    public String saveAccount(User user, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "register";
        }
         
        userService.saveUser(user);
 
        model.addAttribute("success", "User " + user.getUsername()+ " registered successfully.");
        return "redirect:userlist";

    }

	@RequestMapping("/registerCheck")
	public String registercheck() {
		return "redirect:login";
	}

}