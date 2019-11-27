package com.soloshow.welcomesoloshow.util;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @author ShiWei Xing
 * @version 1.0
 * @since 2019-02-20 16:31
 **/
@Slf4j
public class AesUtil {

    private final static String KEY = "AES";
    private final static String HEX = "0123456789ABCDEF";

    /**
     * aes加密时调用
     * 密码
     * @param cleartext 加密内容
     * @return
     * @throws Exception
     */
    public static String encrypt(String cleartext,String password)
            throws Exception {
        byte[] rawKey = getRawKey(password.getBytes());
        byte[] result = encrypt(rawKey, cleartext.getBytes());
        return toHex(result);
    }


    /**
     * aes解密时调用
     *
     * @param
     * @param encrypted
     * @return
     * @throws Exception
     */
    public static String decrypt(String encrypted,String password)
            throws Exception {
        byte[] rawKey = getRawKey(password.getBytes());
        byte[] enc = toByte(encrypted);
        byte[] result = decrypt(rawKey, enc);
        return new String(result);
    }


    private static byte[] getRawKey(byte[] seed) throws Exception {
        //创建AESkey的生产者
        KeyGenerator kgen = KeyGenerator.getInstance(KEY);
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        sr.setSeed(seed);
        kgen.init(128, sr);
        SecretKey skey = kgen.generateKey();
        return skey.getEncoded();
    }


    private static byte[] encrypt(byte[] raw, byte[] clear) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY);
        Cipher cipher = Cipher.getInstance(KEY);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        return cipher.doFinal(clear);
    }


    private static byte[] decrypt(byte[] raw, byte[] encrypted)
            throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY);
        Cipher cipher = Cipher.getInstance(KEY);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        return cipher.doFinal(encrypted);
    }


    public static String toHex(String txt) {
        return toHex(txt.getBytes());
    }


    public static String fromHex(String hex) {
        return new String(toByte(hex));
    }


    private static byte[] toByte(String hexString) {
        int len = hexString.length() / 2;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2),
                    16).byteValue();
        }
        return result;
    }


    public static String toHex(byte[] buf) {
        if (buf == null) {
            return "";
        }
        StringBuffer result = new StringBuffer(2 * buf.length);
        for (byte b : buf) {
            appendHex(result, b);
        }
        return result.toString();
    }


    private static void appendHex(StringBuffer sb, byte b) {
        sb.append(HEX.charAt((b >> 4) & 0x0f)).append(HEX.charAt(b & 0x0f));
    }

    public static void main(String[] args) {
        try {
            String encrypt = encrypt("邢世伟", "1");
            String decrypt = decrypt(encrypt, "1");
            System.out.println(encrypt);
            System.out.println(decrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
