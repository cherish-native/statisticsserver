package com.egf.statisticsserver.util;

import java.util.UUID;

/**
 * 字符串工具类
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param s
     * @return
     */
    public static boolean isEmpty(String s){
        if(s == null || s.length() == 0){
            return false;
        }
        return true;
    }

    /**
     * 判断字符串是否非空
     * @param s
     * @return
     */
    public static boolean isNotEmpty(String s){
        return isEmpty(s)?false:true;
    }

    public static String nvlString(Object o){
        if(o == null){
            return "";
        }
        return o+"";
    }

    /**
     * 生成UUID
     * @return
     */
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
