package ph.edu.stpaul.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
		HttpSession session = httpServletRequest.getSession(false);

		final String requestURI = httpServletRequest.getRequestURI();
		final String contextPath = httpServletRequest.getContextPath();
		final String loginURL = contextPath + "/login";
		final String authenticateUserURL = contextPath + "/authenticateUser";
		final String resourceURL = contextPath + "/resources";

		final boolean loggedIn = (session != null) && (session.getAttribute("id") != null);
		final boolean loginRequest = (loginURL.equals(requestURI)) || (authenticateUserURL.equals(requestURI));
		final boolean resourceRequest = requestURI.startsWith(resourceURL);

		if ((loggedIn || resourceRequest) && (!loginRequest)) {
			filterChain.doFilter(httpServletRequest, httpServletResponse);
		} else if (loginRequest && loggedIn) {
			httpServletResponse.sendRedirect("home");
		} else if (loginRequest && !loggedIn) {
			filterChain.doFilter(httpServletRequest, httpServletResponse);
		} else {
			httpServletResponse.sendRedirect(loginURL);
		}
	}

	@Override
	public void destroy() {
	}
}
