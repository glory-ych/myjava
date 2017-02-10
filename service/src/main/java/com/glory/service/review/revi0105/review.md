I、redis
1.zset--16
zadd/zcard/zcount/zrem/zremrangebyscore/zremrangebyrank/zrank/zrevrank/zrange(withscores)/zrevrange/zrangebyscore/zrevrangebyscore/zincrby/zscore/zunionstore/zinterstore
--3rem/2rank/4range/2store/zadd/zscore/zcard/zcount/zincrby
2.set--14
sadd/scard/smembers/sismember/sinter/sinterstore/sunion/sunionstore/sdiff/sdiffstore/smove/spop/srandmember/srem
--3member/2inter/2union/2diff/sadd/scard/srem/smove/spop
3.list--16
lpop/lpush/rpop/rpush/lpushx/rpushx/rpoplpush/blpop/brpop/brpoplpush/lindex/llen/linsert/lset/ltrim/lrange
--6pop/4push/llen/lindex/**linsert key before|after pivot value**/lset/lrange/ltrim/**lrem key count[-2R 0A 2L] value**
4.hash--13
hset/hget/hsetnx/hmset/hmget/hgetall/hkeys/hvals/hdel/hincrby/hincrbyfloat/hlen/**hexists**
--3get/3set/2hincr/hkeys/hvals/hlen/hdel/hexists
5.string--18
set/setnx/setex/psetex/mset/msetnx/get/mget/getset/append/getrange/setrange/incr/incrby/incrbyfloat/decr/decrby/strlen
--6set/3get/2range/3incr/2decr/append/strlen
6.key--15
keys/type/exists/move/migrate/sort/rename/randomkey/expire/expireat/pexpire/pexpireat/presist/ttl/pttl
--4expire/2ttl/keys/type/exists/sort/rename/randomkey/move/migrate/presist
7.transaction--5
multi/discard/exec/watch/unwatch
8.connection--5
auth/select/echo/ping/quit
9.server
config set|get|rewrite|resetstat/client setname|getname|list|kill/save/bgsave/lastsave/dbsize/flushdb/flushall/shutdown/slave of no one/slave of ip port/info/time/
10.pub/sub--5
publish/subscribe/unsubscribe/psubscribe/punsubscribe
11.script
eval




