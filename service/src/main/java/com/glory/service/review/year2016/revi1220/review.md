1.System
 getProperties/getProperty
 out/err/in
 load/loadLibiary
 gc/exit/runFinaliztion
 currentTimeMillis/nanoTime/arraycopy/identityHashCode
2.Proxy-JDK
 InvocationHandler/Proxy.newInstance
3.Proxy-Cglib
 MethodInterceptor/Enhancer
4.linux-at
5.linux-cronat
6.自定义注解
@interface、value、八种基本类型+String/class/enum/annotation、public/default
7.查找命令
history、Ctrl+R
8.hashmap遍历
entrySet、keySet、values、Iterator
9.内部类
 普通内部类 outer.new Inner
 静态内部类 new Outer.Inner
 局部内部类
 匿名内部类
10.垃圾收集器
 Serial
 Parallel Scavenge：吞吐量，GCTimeRatio、MaxGCPauseMillis、UseAdaptiveSizePolicy
 Parallel New ：最短垃圾收集时间，ParallelGCThreads
 Serial　Old
 Parallel Old
 CMS：最短停顿时间
11.linux-date
date -s
date +%Y
date -d
12.GC算法
标记清除、复制、标记整理
13.Decorator模式
14.Java参数：ext.dirs/encoding/javac -d
15.命令模式
Invoker、Command、Receiver
16.jmap options pid
-heap/-permstat/-histo/-histo:live/-finilizerinfo
17.泛型
不使用原生类型、消除非受检警告、优先考虑泛型、优先考虑泛型方法、列表优于数组、使用通配符提高api灵活性、优先考虑类型安全的异构容器
18.类初始化
new、静态方法被调用、静态成员被赋值、静态非常量被使用、顶级类内部有断言被执行
19.synchronized
对象监视器，代码块是monitorenter/monitorexit，方法是asy_synchronized
20.volatile
21.双重排查锁问题
解决：1.禁止重排序，volatile  2.重排序对其他线程不可见，静态内部类（类初始化锁，排他）
22.枚举和注解
枚举替换int常量、实例域代替序数（非ordinal）、enumSet代替位域、enumMap代替序数索引、接口模拟可扩展枚举、注解优先命名模式、override、标记接口定义类型
23.对象
静态工厂方法替代构造函数、多个构造参数使用构建器、私有构造函数和枚举强化单例模式、私有构造函数强化工具类、避免创建不必要对象、消除对象的过期引用、避免使用finilize
24.通用方法
equals(自反性、一致性、对称性、传递性、非空性；==null，instanceof，this)、hashcode、toString、clone、Comparable
25.类和接口
类和成员的可变性最小化、javabean方式访问、类成员访问性最小化、复合优于继承、继承需要有文档、优先考虑静态内部类、接口优于抽象类、接口只用于定义类型、类层次优于标签类、函数对象表示策略
26.tomcat
读取context-param和listener并初始化value、创建ServletContext、将context-param转为kv交给ServletContext、创建listener实例，即监听器、监听器执行contextInitialized，可以获取到context-param、
27.路径
classpath：clazz.getClassLoader.getResource.getPath
类路径：clazz.getResource.getPath
28.properties读取
Properties.load(inputStream)、ResourceBundle
29.方法
校验参数有效性、必要时进行保护性拷贝、谨慎设计方法签名、慎用可变参数、慎用重载、返回长度为0的列表或数组而不是null、每一个导出的API都要有文档
30.AbstractQueuedSynchronized：队列同步器
FIFO队列、get/setStatus、compareAndSetStatus
31.序列化
谨慎实现Serializable接口、考虑实现自定义序列化格式、保护性重写readObject、实例控制枚举优于readResolve、序列化代理替代序列化实例
32.并发
同步访问共享数据、防止过度并发、task和executor优于线程、并发工具优于wait/notify、慎用延迟初始化、不要依赖线程调度器、避免使用线程组、线程安全性文档
33.异常
只在需要的时候使用异常、可恢复情况使用为受检异常，编程错误使用RuntimeException、优先使用标准异常、抛出与抽象相对应的异常、细节消息中包含能捕获失败的信息、努力使失败保持原子性、不要忽略异常、异常文档、避免不必要使用受检异常
34.通用程序设计
局部变量作用域最小化、了解使用类库、foreach优于for、基本类型优于装箱类型、其他类型可以尽量避免使用String、当心字符串拼接性能、精确数字不使用float和double、谨慎过度优化、避免调用本地方法、接口引用类型、接口优于反射、遵循普遍接受的命名规则
35.线程管道
PipedWriter、PipedReader、PipedInputStream、PipedOutputStream
36.redis-key
del、keys、type、exists、expire/expireat、pexpire/pexpireat、persist、rename、ttl/pttl、sort
37.redis-string
set/get、mset/mget、getset、append、incr/incrby/incrbyfloat、decr/decrby、strlen、del、getrange/setrange
38.redis-hash
hset/hget、hmset/hmget、hgetall、hlen、hexists、hdel、hkeys、hvals、hincrby/hincrbyfloat
39.redis-list
lpop/rpop、lpush/rpush、rpoplpush、lrem、lrange、llen、linsert、lindex、ltrim、
40.redis-set
sadd、scard、srem、sdiff/sinter/sunion、sdiffstore/sinterstore/sunionstore、smembers、sismember、smove、spop
41.redis-zset
zadd、zrange/zrevrange、zrank/zrevrank、zrangebyscore/zrevrangebyscore、zcard、zscore、zcount、zrem/zremrangebyscore/zremrangebyrank、zincrby、zunionstore/zinterstore
42.事务
multi、discard、exec、watch、unwatch
43.服务器
config set/get param、client rewrite、client list/kill/setname/getname、save/bgsave/lastsave、dbsize、flushall、flushdb、slave of *、slave of no one、shutdown
44.连接
auth、select、quit、ping、echo
45.spring内置事件
start/stop/close/refresh/requesthandler
46.自定义spring事件及监听器
applicationContext.publishEvent(myEvent)、myListener implment ApplicationListener
47.vmstat second count
r等待进程数，d等待IO数，swpd虚拟内存使用量，free可用物理内存，buff缓冲区（要写入块设备的数据），cache缓存区（从块设备读出的数据），si每秒从磁盘读入虚拟内存大小，so每秒从虚拟内存写入磁盘大小，bi块设备每秒接收块数量，bo块设备每秒发送块数量，in每秒CPU中断次数，cs每秒上下文切换次数，us用户调用用CPU时间，sy系统调用CPU时间，idCPU空闲时间，wa等待CPU时间
48.set/get/mset/mget/append/incr/incrby/decr/decrby/del/strlen/getset/getrange/setrange
49.load/loadLibiary、out/err、currentTimeMilis/nanoTime/copyarray/、gc/exit/runFinilize、getProperty/getenv
50.InvocationHandler、MethodInterceptor