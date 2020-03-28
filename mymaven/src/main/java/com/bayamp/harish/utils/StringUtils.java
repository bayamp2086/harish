package com.bayamp.harish.utils;

public class StringUtils {

    public static String reverseString(String str) {

        StringBuffer buff = new StringBuffer(str);
        return buff.reverse().toString();
    }
}
