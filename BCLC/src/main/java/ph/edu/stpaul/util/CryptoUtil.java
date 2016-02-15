package ph.edu.stpaul.util;

import org.jasypt.util.password.StrongPasswordEncryptor;

public final class CryptoUtil {
	private CryptoUtil() {
		throw new AssertionError("CryptoUtil should not be instantiated. ");
	}
	
	public static String encrypt(final String text) {
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		return encryptor.encryptPassword(text);
	}

	public static boolean check(final String text, final String stored) {
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		return encryptor.checkPassword(text, stored);
	}
	
	public static void main(String[] args) {
		System.out.println(CryptoUtil.encrypt("administrator"));
		System.out.println(CryptoUtil.encrypt("encoder"));
		System.out.println(CryptoUtil.encrypt("administrator"));
	}
}