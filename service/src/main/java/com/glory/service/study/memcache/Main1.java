package com.glory.service.study.memcache;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import java.net.InetSocketAddress;

/**
 * Created by yangch on 2017/4/7 0007.
 */
public class Main1 {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("10.30.6.217", 11226);
        try {
            MemcachedClient memcachedClient = new MemcachedClient(address);
            OperationFuture<Boolean> future = memcachedClient.set("key", 60 * 1, "value2");
            System.out.println(future.get() + "," + future.getKey() + ",[" + future.getStatus().getMessage() + "," + future.getStatus().getStatusCode() + "," + future.getStatus().toString() + "]");
            Object object = memcachedClient.get("key");
            //memcachedClient.cas()
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
