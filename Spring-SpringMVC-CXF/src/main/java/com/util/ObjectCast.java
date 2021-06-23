package com.util;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectCast {
    //转换OBJECT对象转成字符串
    public static String ToString(Object aobject) {
        if (null == aobject)
            return "";
        else
            return aobject.toString();
    }

    //转换OBJECT对象转成double
    public static double ToDouble(Object aobject) {
        if (null == aobject)
            return -1;
        else {
            if (StringUtils.isEmpty(aobject.toString()))
                return -1;
            else
                return Double.parseDouble(aobject.toString());
        }
    }

    //转换OBJECT对象成INT
    public static int ToInt(Object aobject) {
        if (null == aobject)
            return -1;
        else {
            if (StringUtils.isEmpty(aobject.toString()))
                return -1;
            else
                return Integer.parseInt(aobject.toString());
        }
    }

    //转换OBJECT对象成LONG
    public static long ToLong(Object aobject) {
        if (null == aobject)
            return -1;
        else {
            if (StringUtils.isEmpty(aobject.toString()))
                return -1;
            else
                return Long.parseLong(aobject.toString());
        }
    }

    public static Date ToDate(Object aobject) {
        Date ldt = null;
        try {
            String as_date = aobject.toString();
            SimpleDateFormat sdf = null;
            if (as_date.length() == 10)
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            else
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            ldt = sdf.parse(as_date);
        } catch (Exception e) {
            ldt = null;
        }
        return ldt;
    }

    public static Date ToMaxDate(Object aobject) {
        Date ldt = null;

        try {
            StringBuffer strB_date = new StringBuffer(aobject.toString());
            SimpleDateFormat sdf = null;
            if (strB_date.length() == 10) {
                strB_date.append(" 23:59:59 999");
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            } else
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            ldt = sdf.parse(strB_date.toString());
        } catch (Exception e) {
            ldt = null;
        }
        return ldt;
    }
}

