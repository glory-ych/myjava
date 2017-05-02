package com.glory.service.study.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangch on 2017/4/7 0007.
 */
public class Main1 {
    @Test
    public void demo03() {
        TestDemo testDemo = new TestDemo();
        testDemo.build("ych", 18);
        System.out.println(testDemo);
    }

    class TestDemo {
        private String name;
        private int age;

        public TestDemo build(String name, int age) {
            this.name = name;
            this.age = age;
            return this;
        }

        @Override
        public String toString() {
            return this.name + "," + this.age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    @Test
    public void demo02() {
        final String path = "http://10.30.5.9:10001/couponUserOptimize/api/user/template/shop/active";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("shopId", "122"));
        InputStream inputStream = null;
        CloseableHttpResponse httpResponse = null;
        try {
            String str = EntityUtils.toString(new UrlEncodedFormEntity(params, Charset.defaultCharset()));
            HttpGet httpGet = new HttpGet(path + "?" + str);
            httpResponse = httpClient.execute(httpGet);
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                inputStream = entity.getContent();

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                httpResponse.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void demo01() {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://www.baidu.com/");
//        HashFunction
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            System.out.println(httpResponse.getEntity().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
