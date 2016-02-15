package ph.edu.stpaul.service;

import ph.edu.stpaul.beanrepository.BeanRepository;
import ph.edu.stpaul.dao.UserDAO;
import ph.edu.stpaul.domain.User;
import ph.edu.stpaul.util.CryptoUtil;

public final class AuthenticationService {
	private AuthenticationService() {
		throw new AssertionError("AuthenticationService should not be instantiated. ");
	}

	public static User authenticateUser(final String username, final String password) {
		UserDAO userDao = BeanRepository.getUserDAO();
		User user = userDao.getUserByUsername(username);
		if (user != null) {
			final boolean isPasswordCorrect = CryptoUtil.check(password, user.getPassword());
			if (isPasswordCorrect) {
				return user;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
