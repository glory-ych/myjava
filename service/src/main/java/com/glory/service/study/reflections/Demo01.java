package com.glory.service.study.reflections;

import com.glory.service.study.People;
import com.google.common.base.Predicate;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.MethodParameterScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by yangch on 2016/12/23 0023.
 */
public class Demo01 {
    private static String temp;
    Logger logger= LoggerFactory.getLogger(Demo01.class);
    @Test
    public void demo06() {
        System.out.println("coupon_user_receive_quantity".length());
    }
    @Test
    public void demo05() {
        //People people = new People();
        //Class<People> clazz = People.class;
        try {
//            People p2 = clazz.newInstance();
//            Constructor[] cos = clazz.getDeclaredConstructors();
//            People p3 = (People) cos[0].newInstance(null);
//
            ByteArrayOutputStream bopt = new ByteArrayOutputStream();
            ObjectOutputStream oopt = new ObjectOutputStream(bopt);
            //oopt.writeObject(people);
            oopt.close();

            ByteArrayInputStream bipt = new ByteArrayInputStream(bopt.toByteArray());
            ObjectInputStream oipt = new ObjectInputStream(bipt);
            People p4 = (People) oipt.readObject();

            //People p5= (People) people.clone();

//            System.out.println(people + "," + p2 + "," + p3 + "," + p4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo04() throws Exception {
        FileUtils.copyURLToFile(new URL(""), new File(""));

        ObjectInputStream o=null;
    }

    @Test
    public void demo03() {
        List<String> packNameList = Arrays.asList("com.glory.service.study.reflections");
        //
        // filter
        //
        FilterBuilder filterBuilder = new FilterBuilder().includePackage("com.glory.service.study.system");

        for (String packName : packNameList) {
            filterBuilder = filterBuilder.includePackage(packName);
        }
        Predicate<String> filter = filterBuilder;

        //
        // urls
        //
        Collection<URL> urlTotals = new ArrayList<URL>();
        for (String packName : packNameList) {
            Set<URL> urls =  ClasspathHelper.forPackage(packName);
            urlTotals.addAll(urls);
        }
//        System.out.println(urlTotals);
        //
        Reflections reflections = new Reflections(new ConfigurationBuilder().filterInputsBy(filter)
                .setScanners(new SubTypesScanner().filterResultsBy(filter),
                        new TypeAnnotationsScanner()
                                .filterResultsBy(filter),
                        new FieldAnnotationsScanner()
                                .filterResultsBy(filter),
                        new MethodAnnotationsScanner()
                                .filterResultsBy(filter),
                        new MethodParameterScanner()).setUrls(urlTotals));
        Set<Class<?>> classdata = reflections.getTypesAnnotatedWith(MyAnno.class);
        for (Class clazz : classdata) {
            System.out.println(clazz.getName());
        }
    }

    @Test
    public void demo02() {
        String pack = "com.chuchujie.mall";
        String resourceName = pack.replace(".", "/");
        resourceName = resourceName.replace("\\", "/");
        if (resourceName.startsWith("/")) {
            resourceName = resourceName.substring(1);
        }
        System.out.println(resourceName);
    }

    @Test
    public void demo01() {
        String pack = "com.chuchujie.mall";
        FilterBuilder filterBuilder = new FilterBuilder().includePackage(pack);
        System.out.println(filterBuilder);
    }
}
