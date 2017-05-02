package com.glory.service.study.disconf;

/**
 * Created by yangch on 2017/3/22 0022.
 */
public class RedisConf {
    private String host;
    private Integer port;
    private Integer db;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return this.host + "," + this.port + "," + this.db;
    }
}
