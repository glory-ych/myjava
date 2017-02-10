I、Effective Java
1.对象
考虑用静态工厂方法代替构造函数、多个构造器参数考虑使用构建器、私有构造函数或枚举强化单例、私有构造函数强化工具类、避免创建不必要对象、消除过期的对象引用、避免使用finalize方法
2.类和接口
类和成员的可访问性最小化、javabean访问、可变性最小化、复合优于继承、为继承设计要有文档、优先考虑静态内部类、类层次优于标签类、接口优于抽象类、接口只用于定义类型、函数对象表示策略
3.对象通用方法
equals、hashcode、toString、clone、Compareable
4.通用程序设计
局部变量作用域最小化、了解和使用类库、foreach优于for、基本类型优于装箱类型、如果其他类型可以尽量避免使用String、考虑String拼接性能、精确数字不使用double和float、**通过接口引用对象**、**接口优于反射**、**谨慎进行优化**、谨慎调用本地方法、**遵守普遍接受的命名惯例**
5.泛型
不要使用原生类型、消除非受检警告、优先考虑泛型、优先考虑泛型方法、优先考虑类型安全的异构容器、使用有限制通配符提高API灵活性、列表优于数组
6.枚举和注解
枚举替代final int、实例域代替序数、EnumSet代替位域、EnumMap代替序数索引、注解优于命名模式、用标记接口定义类型、@Override
7.并发
同步访问共享可变数据、**避免过度同步**、task和executor优于线程、并发工具优于wait/notify、**不要依赖线程调度器**、避免使用线程组、慎用延迟初始化、线程安全性文档
8.异常
只针对异常情况使用异常、对可恢复情况使用受检异常而编程错误使用RunTimeException、**避免不必要使用受检异常**、**优先使用标准异常**、**抛出与抽象相对应的异常**、**每个方法抛出的异常都要有文档**、不要忽略异常、努力使失败保持原子性、**细节消息中包含能够捕获失败的信息**
9.序列化
谨慎实现Serializable、考虑自定义序列化类型、保护性编写readObject、实例控制枚举优于readResolve、考虑序列化代理代替序列化实例
10.方法
校验参数有效性、必要时进行保护性拷贝、谨慎设计方法签名、慎用重载、慎用可变参数、返回长度为0数组或集合而不是null、为所有导出API编写文档注释

II、Redis
1.Key--11 | 13
del/keys/type/sort/exists/rename/randomkey/expire/expireat/pexpire/pexpireat/ttl/pttl/presist
move key target-db（当前数据库key移动到指定数据库）
migrate host prot keyname target-db timeout（原子性、阻塞性将指定key从当前实例迁移到目标实例，timeout超时时间，迁移成功会删除当前实例中key）
2.String--8 | 10
set/get/mset/mget/getset/append/strlen/incr/decr/incrby/decrby/incrbyfloat/setrange/getrange
setex/psetex：设置key的value，同时设置生存时间，单位秒(毫秒)
setnx/msetnx
3.Hash--9
hset/hmset/hget/hmget/hkeys/hvals/hgetall/hexists/hdel/hincrby/hincrbyfloat/hlen
4.List--9 | 11
lpop/rpop/lpush/rpush/rpoplpush/lindex/lrange/ltrim/lrem/linsert/llen
blpop/brpop/brpoplpush
lpushx/rpushx
5.Set--11
sadd/sinter/sintersotre/sunion/sunionstore/sdiff/sdiffstore/srem/spop/**scard**/**sismember**/**smembers**/**smove**/**srandmember**
6.ZSet--10
zadd/zrem/zrembyrange/zrembyscore/zrange/**zrangebyscore**/zrevrange/zrevrangebyscore/zrank/zrevranke/zcard/zcount/**zscore**/**zinterstore**/**zunionstore**/**zincrby**
7.事务
multi/discard/exec/watch/unwatch
8.连接
auto/quit/select/echo/ping
9.服务器
info、client setname/getname/list/kill、config set/get/rewrite/resetstat、save/bgsave/lastsave、slave of no one/ip port、flushdb、dbsize、flushall、shutdown
10.发布/订阅
publish/pubsub/pubsubscribe/subscribe/psubscribe/unsubscribe










