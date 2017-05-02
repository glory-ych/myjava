package com.glory.service.study.system;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by yangch on 2017/3/6 0006.
 */
public class Main2 {

    static {
        //System.out.println("static...");
    }

    //static Foo foo = new Foo("he is foo");

    public static void main(String[] args) {
        //System.out.println("main...");
        //String res = pathJoin("yyy", "ccc", "hhh");
        //System.out.println(res);
        down();
    }

    public static String pathJoin(final String... pathElements) {

        final String path;

        if (pathElements == null || pathElements.length == 0) {
            path = File.separator;

        } else {

            final StringBuffer sb = new StringBuffer();

            for (final String pathElement : pathElements) {

                if (pathElement.length() > 0) {
                    sb.append(pathElement);
                    sb.append(File.separator);
                }
            }

            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }

            path = sb.toString();
        }

        return (path);
    }

    public static void down() {
        String remoteUrl = "http://10.30.5.9:80/api/config/file?version=1.0.4&app=coupon-user&env=local&key=app-service.properties&type=0";
        String localUrl = "D:/test.properties";
        try {
            FileUtils.copyURLToFile(new URL(remoteUrl), new File(localUrl));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
