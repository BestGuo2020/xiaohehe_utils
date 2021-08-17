package top.bestguo;

import top.bestguo.utils.EncryptionMD5;
import top.bestguo.utils.RandomUtils;

public class Main {

    public static void main(String[] args) {
	    // 加密测试
        System.out.println(EncryptionMD5.encrypt("123456"));
        System.out.println(EncryptionMD5.encrypt("123456", "&(Hbudh9238d**dj2"));
        System.out.println(EncryptionMD5.encryptNonSalt("123456"));
        // 随机数测试
        System.out.println(RandomUtils.getRandomInt(10, 10));
    }
}
