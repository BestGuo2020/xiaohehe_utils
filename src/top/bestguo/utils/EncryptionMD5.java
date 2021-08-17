package top.bestguo.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * 一个使用MD5简单的加密工具
 */
public class EncryptionMD5 {

    /**
     * 默认加盐的
     */
    private static final String defaultSalt = "~C^6wpR%8dfb6*!";

    /**
     * 加密
     *
     * @param string 需要加密的字符串
     * @return 生成的密文
     */
    public static String encrypt(String string) {
        return getString(string, defaultSalt);
    }

    /**
     * 加密，自己加盐
     *
     * @param string 加密的字符
     * @param salt 需要加的盐
     * @return 生成的密文
     */
    public static String encrypt(String string, String salt) {
        return getString(string, salt);
    }

    /**
     * 默认不加任何盐的，请谨慎使用
     *
     * @param string 加密的字符
     * @return 生成的密文
     */
    public static String encryptNonSalt(String string) {
        String md5 = getString(string);
        if (md5 != null) return md5;
        return "";
    }

    private static String getString(String string) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(string.getBytes());
            return new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getString(String string, String salt) {
        string += salt;
        String md5 = getString(string);
        if (md5 != null) return md5;
        return "";
    }

}
