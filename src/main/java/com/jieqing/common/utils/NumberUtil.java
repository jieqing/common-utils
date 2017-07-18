package com.jieqing.common.utils;

/**
 * Created by jieqing on 2017/7/18.
 */
public class NumberUtil {

    public static Integer getDefaultNum(Integer num) {
        return getDefaultNum(num, 0);
    }

    public static Integer getDefaultNum(Integer num, Integer defaultNum) {
        return num == null ? defaultNum : num;
    }

    public static Long getDefaultNum(Long num) {
        return getDefaultNum(num, 0L);
    }

    public static Long getDefaultNum(Long num, Long defaultNum) {
        return num == null ? defaultNum : num;
    }

    public static Double getDefaultNum(Double num) {
        return getDefaultNum(num, 0.0);
    }

    public static Double getDefaultNum(Double num, Double defaultNum) {
        return num == null ? defaultNum : num;
    }

}
