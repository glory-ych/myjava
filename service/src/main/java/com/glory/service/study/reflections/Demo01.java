package com.glory.service.study.reflections;

import org.junit.Test;
import org.reflections.util.FilterBuilder;

/**
 * Created by yangch on 2016/12/23 0023.
 */
public class Demo01 {
    @Test
    public void demo02(){
        String pack="com.chuchujie.mall";
        String resourceName = pack.replace(".", "/");
        resourceName = resourceName.replace("\\", "/");
        if (resourceName.startsWith("/")) {
            resourceName = resourceName.substring(1);
        }
        System.out.println(resourceName);
    }
    @Test
    public void demo01() {
        String pack="com.chuchujie.mall";
        FilterBuilder filterBuilder = new FilterBuilder().includePackage(pack);
        System.out.println(filterBuilder);
    }
}
