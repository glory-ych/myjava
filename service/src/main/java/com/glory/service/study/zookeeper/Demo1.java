package com.glory.service.study.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.util.List;

/**
 * Created by yangch on 2017/3/15 0015.
 */
public class Demo1 {
    @Test
    public void test4() throws Exception {
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("watcher1... 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 500000, watcher);

        //zk.exists("/root", true);
        zk.create("/root", "root".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        //zk.exists("/root", true);
        String data = new String(zk.getData("/root", true, null));
        System.out.println("data1..." + data);
        zk.setData("/root","root2".getBytes(),-1);
        data = new String(zk.getData("/root", true, null));
        System.out.println("data2..." + data);
        zk.delete("/root", -1);

    }

    @Test
    public void test3() throws Exception {
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("watcher1... 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 500000, watcher);

//
        zk.exists("/root", true);
        zk.create("/root", "root".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.exists("/root/child", true);
        zk.create("/root/child", "child".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.exists("/root/child2", true);
        zk.create("/root/child2", "child2".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//
        List<String> list = zk.getChildren("/root", true);
        System.out.println(list);
        for (String path : list) {
            zk.delete("/root/" + path, -1);
        }
        zk.delete("/root", -1);
    }

    @Test
    public void test2() throws Exception {
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("watcher1... 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };

        Watcher watcher2 = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("watcher2... 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };

        Watcher watcher3 = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("watcher3... 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };

        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 500000, watcher);


        zk.create("/root", "root1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        String data = new String(zk.getData("/root", watcher, null));
        System.out.println("data1..." + data);

        //zk.setData("/root", "root2".getBytes(), -1);
        data = new String(zk.getData("/root", watcher2, null));
        System.out.println("data2..." + data);

        //zk.setData("/root", "root3".getBytes(), -1);
        data = new String(zk.getData("/root", watcher3, null));
        System.out.println("data3..." + data);

        zk.setData("/root", "root3".getBytes(), -1);

        zk.delete("/root", -1);
    }


    @Test
    public void test1() throws Exception {
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("回调watcher实例： 路径" + event.getPath() + " 类型：" + event.getType());
            }
        };

        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 500000, watcher);

        //创建节点root，数据mydata，不开启acl权限控制，节点为永久性
        zk.exists("/root", true);
        zk.create("/root", "mydata".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT); //触发，路径/root 类型：NodeCreated

//        System.out.println("-----------------------");
//        zk.exists("/root", true);
//        zk.getData("/root",watcher,new Stat());

        System.out.println("-----------------------");
//        zk.exists("/root", true);
        //zk.getData("/root", true, null);
        System.out.println(zk.getData("/root", watcher, null).toString());
        zk.setData("/root", "mydata2".getBytes(), -1);

        System.out.println("-----------------------");
        zk.exists("/root/child", true);
        zk.create("/root/child", "child".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        System.out.println("-----------------------");
        zk.exists("/root/child", true);
        zk.delete("/root/child", -1);

        System.out.println("-----------------------");
        zk.exists("/root", true);
        zk.delete("/root", -1);  //触发，路径/root 类型：NodeDeleted

        System.out.println("-----------------------");
        zk.close();
    }
}
