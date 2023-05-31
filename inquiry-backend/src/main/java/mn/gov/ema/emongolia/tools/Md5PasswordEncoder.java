package mn.gov.ema.emongolia.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5PasswordEncoder {
    public String encodePassword(String password, String salt) {
        try {
            String data = password;
            if (salt != null) {
                data += salt;
            }
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data.getBytes());
            byte[] digest = md.digest();
            BigInteger num = new BigInteger(digest);
            return num.toString(16).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;

        }
    }
}
