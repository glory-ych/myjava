package com.glory.service.review.year2016.revi1222;

import com.glory.service.study.effectivejava.chapter7.Student;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangch on 2016/12/14 0014.
 */
public class Revi1222 implements Serializable {
    @Test
    public void demo02() {
        Lock lock = new ReentrantLock();
    }
    /**
     * 分代收集
     * 1.young：young GC或minor GC
     * 停止-复制：首先在edge创建对象，edge第一次满，清除无效对象后将存活对象移动到S0，清空edge；edge第二次满，清除无效对象后将存活对象移动到S1，清理S0（对象放入old）后将存活对象移动到S1，清空S0；第三次满，针对S0重复第二次操作；依次重复；
     * MaxThnuringTherahold：young区域对象最大年龄，默认15
     * 2.old：full GC或major GC
     * 标记-整理：初始标记（标记根直接可达对象，stop the world）、并发标记（标记根间接可达对象，并行）、并发预处理（查找并发标记阶段进入老年代的对象）、重新标记（stop the world 修正并发标记阶段由于应用线程运行导致变动的那一部分对象标记记录）、并发清除、并发重置
     */

    /**
     * JVM参数
     * 1.Xmx Xms Xmn Xss
     * 2.NewSize MaxNewSize PertSize MaxPertSize
     * 3.NewRatio SurvivorRatio
     * 4.MaxTenuringThreshold PretenureSizeThreshold
     * 5.PrintGC PrintGCDetails PrintTimeStamps PrintHeadAtGC
     */

    /**
     * 事务传播特性
     * 1.support
     * 2.notsupport
     * 3.required
     * 4.requirenew
     * 5.never
     * 6.mandatory
     * 7.nested
     *
     */

    /**
     * 事务隔离级别
     * 1.脏读：读到未提交数据 read committed
     * 2.不可重复读：两次读取同一数据，内容不同 repeatable read
     * 3.幻读：两次读取到数据条数不一致 serializable
     */


    /**
     * 序列化实现clone
     */
    @Test
    public void demo01() throws Exception {
        Student student = new Student();
        student.setName("ych");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ops = new ObjectOutputStream(baos);
        ops.writeObject(student);
        ops.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Student student1 = (Student) ois.readObject();
        System.out.println(student1.getName());
    }
}
