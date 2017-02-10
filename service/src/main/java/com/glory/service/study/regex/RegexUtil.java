package com.glory.service.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yangch on 2016/11/18 0018.
 */
public class RegexUtil {
    /**
     * 字符串是否符合正则表达式
     *
     * @param str   字符串
     * @param regex 正则表示式
     * @return 是否符合
     */
    public static boolean match(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
