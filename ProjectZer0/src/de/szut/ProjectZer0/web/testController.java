package de.szut.ProjectZer0.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import de.szut.ProjectZer0.model.testModel;

@Controller
public class testController {

		@RequestMapping("/eins.htm")
		public ModelAndView myAction()
		{
			ModelMap map = new ModelMap();
			map.addAttribute("test", new testModel());	
			return new ModelAndView("test/test", map);
		}
}
