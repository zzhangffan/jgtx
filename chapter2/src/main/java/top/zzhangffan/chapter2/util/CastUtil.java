/**
 * Copyright (C), XXXX-2018, XXX有限公司
 * FileName: CastUtil
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.zzhangffan.chapter2.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.varia.FallbackErrorHandler;

/**
 * 〈一句话功能简述〉<br> 
 * 〈转型工具类〉
 *  <p></p>
 *
 * @author zzhan
 * @create 2018/2/24
 * @since 1.0.0
 */
public class CastUtil {

    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    private static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj, 0);
    }

    private static double castDouble(Object obj, int defaultValue) {
        double doubleValue = defaultValue;
        if (obj != null) {
            String  strValue = castString(obj);
            if (StringUtils.isNoneEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {}
            }
        }
        return doubleValue;
    }

    public static long castLong(Object obj){
        return CastUtil.castLong(obj, 0);
    }

    private static long castLong(Object obj, int defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String  strValue = castString(obj);
            if (StringUtils.isNoneEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {}
            }
        }
        return longValue;
    }

    public static int castInt(Object obj){
        return CastUtil.castInt(obj, 0);
    }

    private static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if (obj != null) {
            String  strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {}
            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj, false);
    }

    private static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}