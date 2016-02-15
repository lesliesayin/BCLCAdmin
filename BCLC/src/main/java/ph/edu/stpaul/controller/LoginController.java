package ph.edu.stpaul.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ph.edu.stpaul.domain.User;
import ph.edu.stpaul.service.AuthenticationService;

@Controller
public class LoginController {
	@RequestMapping(value = { "/login" })
	public ModelAndView login(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView("login");
		String errorMessage = (String) httpServletRequest.getAttribute("errorMessage");
		modelAndView.addObject("errorMessage", errorMessage);
		return modelAndView;
	}

	@RequestMapping(value = "/authenticateUser", method = RequestMethod.POST)
	public void authenticateuser(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			String username, String password) throws IOException, ServletException {
		User user = AuthenticationService.authenticateUser(username, password);

		if (user != null) {
			createUserSession(httpServletRequest, user);
			httpServletResponse.sendRedirect("home");
		} else {
			httpServletRequest.setAttribute("errorMessage", "The username and password you entered is invalid.");
			httpServletRequest.getRequestDispatcher("login").forward(httpServletRequest, httpServletResponse);
		}
	}

	private void createUserSession(HttpServletRequest httpServletRequest, User user) {
		HttpSession session = httpServletRequest.getSession(true);
		session.setMaxInactiveInterval(60 * 60 * 3);
		session.setAttribute("id", user.getId());
		session.setAttribute("username", user.getUsername());
		session.setAttribute("type", user.getType());
	}

	@RequestMapping(value = { "/logout" })
	public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		HttpSession session = httpServletRequest.getSession(true);
		if (session != null) {
			session.invalidate();
		}
		httpServletResponse.sendRedirect("login");
	}
}
