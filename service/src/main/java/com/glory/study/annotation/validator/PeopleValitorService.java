package com.glory.study.annotation.validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by yangch on 2016/9/27.
 */
public class PeopleValitorService {
    public static void valit(Object obj) throws Exception {
        PeopleValidtor validtor;
        Object value;
        Class<? extends Object> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            for (Field field : fields) {
                field.setAccessible(true);
                Annotation[] annotations = field.getDeclaredAnnotations();
                if (annotations.length > 0) {
                    for (Annotation annotation : annotations) {
                        if (annotation.annotationType().equals(PeopleValidtor.class)) {
                            validtor = (PeopleValidtor) annotation;
                            value = field.get(obj);
                            if (!validtor.emptyable() && null == value) {
                                throw new RuntimeException(validtor.message());
                            }
                        }
                    }
                }
                field.setAccessible(false);
            }
        }
    }
}
