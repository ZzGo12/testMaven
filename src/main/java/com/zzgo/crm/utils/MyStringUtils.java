package com.zzgo.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ZzGo on 2017/4/12.
 */
public class MyStringUtils {
    /**
     * md5加密
     * @param value
     * @return
     */
    public static String getMD5Value(String value) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            return new BigInteger(1,md.digest(value.getBytes())).toString(16);
        } catch (Exception e) {
            return value;
        }
    }

}
