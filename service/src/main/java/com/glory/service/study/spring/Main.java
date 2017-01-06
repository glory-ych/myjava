package com.glory.service.study.spring;

import com.glory.service.study.spring.beans.ProjectApi;
import com.glory.service.study.spring.po.Project;
import com.glory.service.study.spring.beans.ProjectApi;
import com.glory.service.study.spring.beans.ProjectService;
import com.glory.service.study.spring.po.Project;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by yangch on 2016/9/9.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //applicationContext.start();
    }

    @Test
    public void demo05() throws Exception {
        MyApplicationContext applicationContext = new MyApplicationContext("/config/applicationContext.xml");
        ProjectApi projectApi = (ProjectApi) applicationContext.getBeanByAnnotation("projectApi");
        System.out.println(projectApi.get(1).getName());
    }

    @Test
    public void demo04() throws Exception {
        ProjectApi projectApi = new ProjectApi();
        Class<?> clazz = projectApi.getClass();
        Field field = clazz.getDeclaredField("projectService");
        Annotation[] annotations = field.getDeclaredAnnotations();
        System.out.println(annotations[0].annotationType().getSimpleName());
    }

    @Test
    public void demo03() {
        MyApplicationContext applicationContext = new MyApplicationContext("/config/applicationContext.xml");
        ProjectApi projectApi = (ProjectApi) applicationContext.getBean("projectApi");
        ProjectService projectService = (ProjectService) applicationContext.getBean("projectService");
//        System.out.println(projectService);
        System.out.println(projectApi.get(1).getName());
    }

    @Test
    public void demo01() {
        MyApplicationContext applicationContext = new MyApplicationContext("/config/applicationContext.xml");
        ProjectService service = (ProjectService) applicationContext.getBean("projectService");
        Project project = service.get(1);
        System.out.println(project.getName());
    }

    @Test
    public void demo02() {
        Integer[] arr = new Integer[]{1, 2};
        print(2);
    }

    public void print(Integer... nums) {
        System.out.println("可变..." + nums);
    }

    public void print(Integer num) {
        System.out.println("不可变..." + num);
    }
}
