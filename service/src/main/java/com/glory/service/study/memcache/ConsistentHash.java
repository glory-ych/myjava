package com.glory.service.study.memcache;

import com.google.common.hash.HashFunction;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by yangch on 2017/4/7 0007.
 */
public class ConsistentHash<T> {
    public static void main(String[] args) {

    }

    private final HashFunction hashFunction;
    private final int numberOfReplicas;
    private final SortedMap<Integer, T> circle = new TreeMap<Integer, T>();

    public ConsistentHash(HashFunction hashFunction, int numberOfReplicas,
                          Collection<T> nodes) {
        this.hashFunction = hashFunction;
        this.numberOfReplicas = numberOfReplicas;

        for (T node : nodes) {
            add(node);
        }
    }

    public void add(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            circle.put(hashFunction.hashString(node.toString() + i, Charset.defaultCharset()).asInt(), node);
        }
    }

    public void remove(T node) {
        for (int i = 0; i < numberOfReplicas; i++) {
            circle.remove(hashFunction.hashString(node.toString() + i, Charset.defaultCharset()).asInt());
        }
    }

    public T get(Object key) {
        if (circle.isEmpty()) {
            return null;
        }
        int hash = hashFunction.hashString(key.toString(),Charset.defaultCharset()).asInt();
        if (!circle.containsKey(hash)) {
            SortedMap<Integer, T> tailMap = circle.tailMap(hash);
            hash = tailMap.isEmpty() ? circle.firstKey() : tailMap.firstKey();
        }
        return circle.get(hash);
    }

}
