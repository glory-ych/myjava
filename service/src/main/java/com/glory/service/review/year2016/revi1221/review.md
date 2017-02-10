1.JVM参数
Xmx/Xms/Xmn/Xss
NewSize/MaxNewSize/PermSize/MaxPermSize/NewRatio/SurvivorRatio/PrintGC/PrintGCDetails/PrintGCTimeStamps/PrintHeapAtGC
MaxTenuringThreshold/PretenureSizeThreshold
2.wait/sleep
object/thread、synchronized、释放锁、时间参数
3.自定义注解
@interface、基本类型/String/Class/Enum/Annonation、public/default、value
4.Adapter
ITarget、Target、Adapter、Adaptee
5.GC算法
标记清除（mark=false）、复制、标记整理
6.内部类
普通、静态、局部、匿名
7.jstack、jstat、jmap
8.设计原则
单一职责、接口隔离、里氏替换、迪米特、依赖倒置、开闭
9.垃圾回收器
Serial
Parallel New：最短回收时间，ParallelGCThreads
Parallel Servange：吞吐量，GCTimeRatio/MaxGCPauseMillils/UseAdaptiveSizePolicy
Serial Old
Parallel Old
CMS：最短停顿时间
10.抽象类和接口
关键字、多实现单继承、public abstract、public static final、构造函数、like a/is a、自顶而上/自上而下
11.java参数
encoding、ext.dirs、javac -d
12.源注解
Target、Retention(Class/Source/RunTime)、Document、Inherited
13.单例模式
饿汉、懒汉、双重排查锁、枚举、静态内部类
14.建造者
Director、Builder、Product
15.泛型
不要使用原生类型、消除非受检警告、优先考虑泛型、优先考虑泛型方法、列表优于集合、使用通配符提高API灵活性、优先考虑类型安全的异构容器
16.JVM类加载
装载、链接（校验、准备、解析）、初始化
17.JVM类加载器
Boot(rt.jar)/Ext(/ext)/App(classpath)
18.Java类加载器
ClassLoader
19.volatile重排序
volatile写不与前面重排序、volatile读不与后面重排序、volatile写不与volatile读重排序
20.类初始化情况
new、静态方法被调用、静态属性被赋值、静态非常量被使用、顶级类内部有断言语句执行
21.synchronized原理
对象监视器，代码块：monitorenter/monitorexit；方法：ays_synchronized
22.volatile屏障插入策略
storestore、volatile写、storeload；volatile读、loadload、loadstore
23.双重排查锁问题
jdk1.5之前；分配内存、初始化实例、赋值给引用变量；禁止重排序（volatile）、重排序对其他线程不可见（静态内部类）
24.tomcat加载
加载context-param/listener值、创建ServletContext上下文、context-param的KV给ServletContext、创建监听器、监听器执行contextInitialized(ServletContextEvent )
25.方法
校验参数有效性、必要时进行保护性拷贝、谨慎设计方法签名、慎用重载、慎用可变参数、返回长度为0的数组或集合而不是null、导出API有文档
26.序列化
谨慎实现Serializable、考虑自定义序列化格式、保护性编写readObject、实例控制枚举优于readResolve、序列化代理代替序列化实例
27.并发
同步访问共享数据(get/set)、防止过度并发、task/executor优于线程、并发工具优于wait/notify、不要依赖线程调度器、不使用线程组、线程安全性文档、慎用延迟初始化
28.异常
必要的时候使用异常、可恢复使用非受检异常，编程错误使用RuntimeException、优先使用标准异常、抛出与抽象相对应异常、努力使失败保持原子性、不要忽略异常、细节消息包含捕获失败信息、避免不必要使用非受检异常、异常文档
29.通用程序设计
局部变量作用域最小化、了解和使用类库、foreach优于for、基本类型优于装箱类型、精确数字不使用float和double、如果其他类型可以就不使用字符串、当心字符串拼接性能、谨慎进行优化、谨慎调用native方法、遵循普遍接受的命名规则、接口引用对象、接口优于反射机制
30.redis-set
sadd、srem、sdiff/sinter/sunion、sdiffstore/sinterstore/sunionstore、scard、spop、smove、smembers、sismember、srandommember
31.redis-zset
zadd、zrem、zremrangebyrank/zremrangebyscore、zcard、zcount、zscore、zincrby、zrange/zrevrange、zrangebyscore/zrevrangebyscore、zrank/zrevrank
32.事务
multi、discard、exec、watch、unwatch
33.连接
auto、select、ping、echo、quit
34.服务器
info、config get/set/rewrite/resetstat、client setname/getname/list/kill/、flushall、flushdb、dbsize、shutdown、slave of *[no one]、save/bgsave/lastsave
35.CMS收集器
初始标记、并发标记、并发预清理、重新标记、并发清理、并发重置
36.引用
强（new，outofmemory）、软（内存敏感的高速缓存）、弱、虚