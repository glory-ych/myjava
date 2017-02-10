package com.glory.service.study.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.List;

/**
 * Created by yangch on 2017/1/5 0005.
 */
public class Second {
    public static void main( String[] args ) {
        long start = System.currentTimeMillis();
        withoutPipeline();
        System.out.println("Without Pipeline takes: " + (System.currentTimeMillis() - start) + " ms.");

        start = System.currentTimeMillis();
        withPipeline();
        System.out.println("With Pipeline takes: " + (System.currentTimeMillis() - start) + " ms.");
    }

    public static void withPipeline() {
        Jedis jedis = null;

        try {
            jedis = new Jedis("172.16.11.66", 6379);
            jedis.select(3);
            jedis.flushDB();
            Pipeline p = jedis.pipelined();

            p.set("thekey", Integer.toString(0));
            for (int i = 1; i <= 2000; i++) {
                p.incr("thekey");
            }
            List<Object> results = p.syncAndReturnAll();
            System.out.println(results.size());
//            Response<String> r = p.get("thekey");
//
//            p.sync();
//
//            System.out.println(r.get());
        } finally {
            jedis.close();
        }

    }

    public static void withoutPipeline() {
        Jedis jedis = null;

        try {
            jedis = new Jedis("172.16.11.66", 6379);
            jedis.select(3);
            jedis.flushDB();
            jedis.set("thekey", Integer.toString(0));

            for (int i = 1; i <= 2000; i++) {
                jedis.incr("thekey");
            }

            System.out.println(jedis.get("thekey"));
        } finally {
            jedis.close();
        }

    }
}
