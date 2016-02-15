package ph.edu.stpaul.beanrepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ph.edu.stpaul.dao.RegistrationDAO;
import ph.edu.stpaul.dao.UserDAO;

public final class BeanRepository {
	private static final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	private BeanRepository() {
		throw new AssertionError("BeanRepository should not be instantiated. ");
	}

	public static UserDAO getUserDAO() {
		return context.getBean(UserDAO.class, "userDao");
	}

	public static RegistrationDAO getRegistrationDAO() {
		return context.getBean(RegistrationDAO.class, "registrationDao");
	}
}
