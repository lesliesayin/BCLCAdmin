package ph.edu.stpaul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentsController {
	@RequestMapping(value = {"/payments"})
	public ModelAndView payments() {
		ModelAndView modelAndView = new ModelAndView("payments");
		return modelAndView;
	}
}
