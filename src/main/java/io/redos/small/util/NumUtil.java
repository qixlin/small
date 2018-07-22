package io.redos.small.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * All rights Reserved, Powered By JIE
 * 数字转62进制
 * @author JIE
 * @version 1.0.0
 * @date 2018/6/19 14:23
 * @copyright ©2018
 */
public final class NumUtil {

    public static String convertTo62(long srcNumber) {
        String dest = "";
        if (srcNumber == 0) {
            return srcNumber+"";
        }
        while (srcNumber > 0) {
            int modNum = (int)(srcNumber % 62);
            srcNumber = srcNumber / 62;
            dest = getNum(modNum) + dest;
        }
        return dest;
    }

    private static String getNum(int modNum) {
        if (modNum <= 9) {
            return  modNum + "";
        }
        if ('a'-87 <= modNum && 'z'-87 >= modNum) {
            return ((char) (modNum + 87))+"";
        }
        if ('A'-29 <= modNum && 'Z'-29 >= modNum) {
            return ((char) (modNum + 29))+"";
        }
        return "0";
    }

    public static void main(String[] args) {
//        for (long i = 238310; i < 238330; i++) {
//            System.out.print(convertTo62(i) + "  ");
//            if (i%20 == 0) {
//                System.out.println();
//            }
//        }
//        System.out.println(convertTo62(238328));
        System.out.println(convertToLong("5125146a@!@s51"));
    }

    public static long convertToLong(String srcString){
        if (null == srcString || "".equals(srcString)) {
            throw new NullPointerException("待转换数字不能为空！");
        }
        char[] srcChar = srcString.toCharArray();
        System.out.println();
        if (!srcString.matches("^[0-9a-zA-Z]{0,}$")) {
            throw new RuntimeException("待转换的字符串格式错误！");
        }
        return 0L;
    }
}
