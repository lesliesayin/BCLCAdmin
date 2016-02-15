package ph.edu.stpaul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ph.edu.stpaul.service.RegistrationService;

@Controller
public class RegistrationController {
	@RequestMapping(value = {"/registration"})
	public ModelAndView registration() {
//		System.out.println(RegistrationService.getRegistrations("2015-2016", "", 0, 100));
//		
		ModelAndView modelAndView = new ModelAndView("registration");
		return modelAndView;
	}
}
