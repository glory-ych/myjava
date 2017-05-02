package com.glory.service.study.annotation.file2model;

import org.junit.Test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by yangch on 2016/11/11 0011.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IntrospectionException {
        ResourceBundle bundle = ResourceBundle.getBundle("pig");
        Pig pig = new Pig();
        Field[] fields = pig.getClass().getDeclaredFields();
        if (fields.length > 0) {
            String name = "", value = "";
            Method method;
            for (Field field : fields) {
                if (field.isAnnotationPresent(MyAnnotation.class)) {
                    name = field.getAnnotation(MyAnnotation.class).name();
                    value = bundle.getString(name);
                    PropertyDescriptor pd = new PropertyDescriptor(field.getName(), pig.getClass());
                    method = pd.getWriteMethod();
                    System.out.println(method.getName());
                    Class<?>[] paramClazz = method.getParameterTypes();
                    if (paramClazz.length > 0) {
                        for (Class clazz : paramClazz) {
                            if (clazz.getSimpleName().equals(int.class.getSimpleName())) {
                                field.setAccessible(true);
                                field.set(pig, Integer.parseInt(value));
                            } else if (clazz.getSimpleName().equals(String.class.getSimpleName())) {
                                method.invoke(pig, value);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(pig);
    }

    @Test
    public void demo01() throws IntrospectionException, NoSuchMethodException {
        //PropertyDescriptor pd = new PropertyDescriptor("date", Pig.class);
        //Method method = pd.getWriteMethod();
        Method method1 = Pig.class.getDeclaredMethod("print", List.class);

        Type[] types = method1.getGenericParameterTypes();
        Type[] clazzs = method1.getParameterTypes();
        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i].getTypeName());
            System.out.println(clazzs[i].getTypeName());

            ParameterizedType t = (ParameterizedType)types[0];
            System.out.println(t.getActualTypeArguments()[0]);
        }
    }
}
