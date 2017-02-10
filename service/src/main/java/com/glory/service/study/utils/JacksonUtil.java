package com.glory.service.study.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 赵阳 on 2016/11/15.
 * 描述：
 */
public class JacksonUtil {
    /**
     * 日志输出类
     */
    private static Logger Log = LoggerFactory.getLogger(JacksonUtil.class.getName());
    private static ThreadLocal<ObjectMapper> objMapperLocal = new ThreadLocal<ObjectMapper>() {
        @Override
        public ObjectMapper initialValue() {
            ObjectMapper OBJECT_MAPPER = new ObjectMapper();
            OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);// 如果属性为null，不序列化成string
            OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);// 当json有多余属性时，过滤掉此属性
            return OBJECT_MAPPER;
        }
    };

    public static <T> List<T> json2List(String jsonString, Class<T> clazz) throws IOException {
        List<T> lst = new ArrayList<>();
        if (jsonString.length() <= 0) {
            return lst;
        }
        JavaType javaType = objMapperLocal.get().getTypeFactory().constructParametricType(ArrayList.class, clazz);
        lst = (List<T>) objMapperLocal.get().readValue(jsonString, javaType);
        return lst;
    }

    public static <T> List<T> json2LinkedList(String jsonString, Class<T> clazz) throws IOException {
        JavaType javaType = objMapperLocal.get().getTypeFactory().constructParametricType(LinkedList.class, clazz);
        List<T> lst = (List<T>) objMapperLocal.get().readValue(jsonString, javaType);
        return lst;
    }

    /**
     * JSON转成对象
     *
     * @param jsonString
     * @param clazz
     * @return
     */
    public static <T> T json2Object(String jsonString, Class<T> clazz) throws IOException {
        try {
            return objMapperLocal.get().readValue(jsonString, clazz);
        } catch (Exception e) {
            Log.error("JSON转成对象 error : {}", e);
        }
        return null;
    }

    /**
     * 将对象转化成JSON
     *
     * @param ob
     * @return
     */
    public static String object2Json(Object ob) {
        String str = "";
        try {
            str = objMapperLocal.get().writeValueAsString(ob);
        } catch (Exception e) {
            Log.error("将对象转化成JSON error : {}", e);
        }
        return str;
    }

}
