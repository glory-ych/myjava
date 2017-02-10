1.redis-string
set/get、mset/mget、setnx/msetnx、setget、incr/decr、incrby/decrby、incrbyfloat、getrange/setrange、strlen、append
2.redis-key
del、keys、expire/pexpire、expireat/pexpireat、presist、ttl/pttl、exists、sort、rename、randomkey、type
3.redis-hash
hset/hget、hmset/hmget、hkeys、hvals、hgetall、hdel、hincrby/hincrbyfloat、hexists、hlen
4.redis-list
lpop/rpop、lpush/rpush、rpoplpush、lrem、ltrim、lindex、linsert、llen、lrange
5.System
load/loadLibrary、out/err/in、gc/exit/runFinilize、getProperties/getenv、currentTimeMillis/nanoTime/arraycopy/identityHashCode
6.Proxy-Cglib
MethodInterceptor;Enhancer enhancer;enhancer.setSuperClass(this);enhancer.setCallback(this.class);enhancer.create();invokeSuper()
7.Proxy-JDK
InvocationHandler;Proxy.newInstance(this.ClassLoader,this.interface,handler)
8.Integer
缓存-128~127到数组，Integer.valueOf()，java.lang.Integer.IntegerCache.high
9.泛型
不要使用原生类型、消除非受检警告、优先考虑泛型、优先考虑泛型方法、优先考虑类型安全的异构容器、使用通配符提高API灵活性、集合优于数组
10.方法
校验参数有效性、必要时进行保护性拷贝、谨慎设计方法签名、慎用重载、慎用可变参数、返回长度为0的列表或数组而不是null、导出API有文档
11.序列化
谨慎实现Serializable、保护性编写readObject、考虑自定义序列化类型、实例控制枚举优于readResolve、考虑序列化代理替代序列化实例
12.并发
同步访问共享数据、谨慎多度并发、task和executors优于线程、同步工具优于线wait/notify、不要依赖线程调度器、避免使用线程组、线程安全性文档、慎用延迟加载
13.异常
必要使用异常、可恢复情况使用受检异常，编程错误使用RuntimeException、优先使用标准异常、抛出与抽象对应异常、努力使失败保持原子性、细节消息中包含抛出错误信息、异常文档、不要忽略异常、避免不必要使用受检异常
14.通用程序设计
局部变量作用域最小化、了解和使用类库、foreach优于for、基本类型优于装箱类型、精确数字不使用float和double、其他类型可以尽量避免使用字符串、当心字符串拼接性能、遵循普遍接受的命名规则、接口引用对象、接口优于反射、谨慎进行优化、谨慎调用本地方法
15.redis-set
sadd、srem、sdiff/sinter/sunion、sdiffstore/sinterstroe/sunionstore、smembers、srandommember、sismember、scard、spop、smove
16.redis-zset
zadd、zrem、zremrangebyrank、zremrangebyscore、zscore、zcard、zrange/zrevrange、zrangebyscore/zrevrangebyscore、zrank/zrevrank、zcount、zincrby、zinterstore/zunionstore
17.事务
multi、discard、exec、watch、unwatch
18.连接
auth、select、quit、ping、echo、config set requirepass pwd
19.服务器
info、config set/get/resetstat/rewrite、client setname/getname/list/kill、save/bgsave/lastsave、slave of /no one/ip port、dbsize、flushall、flushdb、shutdown