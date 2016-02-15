package ph.edu.stpaul.service;

import java.util.List;

import ph.edu.stpaul.beanrepository.BeanRepository;
import ph.edu.stpaul.dao.RegistrationDAO;
import ph.edu.stpaul.domain.Registration;

public final class RegistrationService {
	private RegistrationService() {
		throw new AssertionError("RegistrationService should not be instantiated. ");
	}
	
	public static List<Registration> getRegistrations(final String schoolYear, final String filter, final int start, final int length) {
		RegistrationDAO registrationDao = BeanRepository.getRegistrationDAO();
		return registrationDao.getRegistrations(schoolYear, filter, start, length);
	}

	public static void saveRegistration(Registration registration) {
		RegistrationDAO registrationDao = BeanRepository.getRegistrationDAO();
		registrationDao.addRegistration(registration);
	}
}
