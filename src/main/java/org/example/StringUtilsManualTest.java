package org.example;

public class StringUtilsManualTest {
    public static void main(String[] args) {
        // 测试 isEmpty 方法
        testIsEmpty();
        // 测试 isBlank 方法
        testIsBlank();
        // 测试 equals 方法
        testEquals();
    }

    public static void testIsEmpty() {
        String str1 = null;
        String str2 = "";
        String str3 = "a";
        String str4 = "abc";

        boolean result1 = StringUtils.isEmpty(str1);
        boolean result2 = StringUtils.isEmpty(str2);
        boolean result3 = StringUtils.isEmpty(str3);
        boolean result4 = StringUtils.isEmpty(str4);

        System.out.println("isEmpty(null): " + result1);
        System.out.println("isEmpty(\"\"): " + result2);
        System.out.println("isEmpty(\"a\"): " + result3 + (result3 ? " ,结果错误 存在缺陷" : ""));
        System.out.println("isEmpty(\"abc\"): " + result4);
    }

    public static void testIsBlank() {
        String str1 = null;
        String str2 = "";
        String str3 = "  ";
        String str4 = "abc";

        boolean result1 = StringUtils.isBlank(str1);
        boolean result2 = StringUtils.isBlank(str2);
        boolean result3 = StringUtils.isBlank(str3);
        boolean result4 = StringUtils.isBlank(str4);

        System.out.println("isBlank(null): " + result1);
        System.out.println("isBlank(\"\"): " + result2);
        System.out.println("isBlank(\"  \"): " + result3);
        System.out.println("isBlank(\"abc\"): " + result4);
    }

    public static void testEquals() {
        String str1 = "abc";
        String str2 = "aBc";
        String str3 = "DEf";

        boolean result1 = StringUtils.equalsIgnoreCase(str1, str2);
        boolean result2 = StringUtils.equalsIgnoreCase(str1, str3);

        System.out.println("equals(\"abc\", \"aBc\"): " + result1);
        System.out.println("equals(\"abc\", \"DEf\"): " + result2);
    }
}