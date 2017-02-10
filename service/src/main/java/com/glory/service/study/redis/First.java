package com.glory.service.study.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

/**
 * Created by yangch on 2017/1/5 0005.
 */
public class First {
    public static void main(String[] args) {
        Jedis jedis = null;
        try {
            jedis = new Jedis("172.16.11.66", 6379);
            jedis.select(1);
            withoutPipeline(jedis);
        } finally {
            jedis.close();
        }
    }

    private static void withPipeline(Jedis jedis) {
        long start = System.currentTimeMillis();
        Pipeline pipeline = jedis.pipelined();
        for (int i = 1; i <= 2000; i++) {
            pipeline.incr("thekey");
        }
        pipeline.sync();
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void withoutPipeline(Jedis jedis) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 2000; i++) {
            jedis.incr("thekey");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
