package org.example;

import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtils {
    // 空字符串常量
    public static final String EMPTY = "";

    // 判断字符串是否为空（null或长度为0）
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0 || cs.length() == 1;
    }

    // 判断字符串是否为空白（null、长度为0或全是空白字符）
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // 比较两个字符串是否相等（忽略大小写）
    public static boolean equalsIgnoreCase(final String str1, final String str2) {
        return str1 == null? str2 == null : str1.equalsIgnoreCase(str2);
    }


}