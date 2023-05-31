package mn.gov.ema.emongolia.tools;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Random;


public final class Password {
	private Password() {
		initCharacters();
	}

	public static String getPassword() {
		String str = "";
		for (char chr : get())
			str = str + chr;
		return str;
	}
	public static String getMainPassword() {
		StringBuilder str = new StringBuilder("");
		for (char chr : getPass())
			str.append(chr);
		return str.toString();

	}


	public static String encrypt(String str, String saltstr) {
		String encodedSalrString = Base64.getEncoder().encodeToString(saltstr.getBytes());
		String encodedStrString = Base64.getEncoder().encodeToString(str.getBytes());
		return encodedSalrString + encodedStrString;
	}

//	public static String decrypt(String encryptedStr, User user) {
//		String encodedSalt = Base64.getEncoder().encodeToString(user.getSalt().getBytes());
//
//		if (encryptedStr.length() > encodedSalt.length()) {
//			String cipher = encryptedStr.substring(encodedSalt.length());
//			BASE64Decoder decoder = new BASE64Decoder();
//			try {
//				return new String(decoder.decodeBuffer(cipher));
//			} catch (IOException e) {
//				//  throw new InvalidImplementationException(
//				//Fail
//			}
//		}
//		return null;
//	}

	public static String hashPassword(String password, String salt) throws Exception {
		String result = password;
		String appendedSalt = new StringBuilder().append('{').append(salt)
				.append('}').toString();
		String appendedSalt2 = new StringBuilder().append(password).append('{')
				.append(salt).append('}').toString();
		if (password != null) {
			MessageDigest mda = MessageDigest.getInstance("SHA-256");
			byte[] pwdBytes = password.getBytes("UTF-8");
			byte[] saltBytes = appendedSalt.getBytes("UTF-8");
			byte[] saltBytes2 = appendedSalt2.getBytes("UTF-8");
			byte[] digesta = encode(mda, pwdBytes, saltBytes);
			for (int i = 1; i < 5000; i++) {
				digesta = encode(mda, digesta, saltBytes2);
			}
			result = new String(encodeBase64(digesta));
		}
		return result;
	}

	private static char[] initCharacters() {
		char[] character=new char[100];
		int i = 0;
		for (int j = 48; j < 58; ++i, ++j) {
			character[i] = (char) j;
		}
//		for (int j = 64; j < 91; ++i, ++j) {
//			character[i] = (char) j;
//		}
		for (int j = 97; j < 123; ++i, ++j) {
			character[i] = (char) j;
		}
		return character;
	}


	private static char[] get() {
		char[] characters = initCharacters();
		Random rnd = new Random();
		char[] password = new char[20];
		for (int i = 0; i < 20; ++i) {
			password[i] = characters[rnd.nextInt(36)];
		}
		return password;
	}

	private static char[] getPass() {
		char[] characters = initCharacters();
		Random rnd = new Random();
		char[] password = new char[8];
		for (int i = 0; i < password.length; ++i) {
			password[i] = characters[rnd.nextInt(36)];
		}
		return password;
	}

	private static byte[] encode(MessageDigest mda, byte[] pwdBytes, byte[] saltBytes) {
		mda.update(pwdBytes);
		byte[] digesta = mda.digest(saltBytes);
		return digesta;
	}


	private static String encodeBase64(byte[] input) {
		return DatatypeConverter.printBase64Binary(input);
	}
}
