package com.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * @Author: hmm
 * @Date: 2019/9/12 14:31
 */
public class FastJsonUtil {

    //序列化属性
    private static SerializerFeature[] features = {
            SerializerFeature.PrettyFormat,
            SerializerFeature.QuoteFieldNames,
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.DisableCircularReferenceDetect //消除循环引用

    };
    /**
     * 值过滤器：将null转成空字符串
     */
    private static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object obj, String s, Object v) {
            if (v == null)
                return "";
            return v;
        }
    };

    /**
     * 转换成字符串
     *
     * @param object
     * @return
     */
    public static String toJSONString(Object object) {
        return JSON.toJSONString(object, filter,features);
    }
}
