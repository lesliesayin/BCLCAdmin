package ph.edu.stpaul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = {"", "/", "/index", "/home"})
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message", "Welcome to St. Paul Academia de San Pablo");
		return modelAndView;
	}
}
