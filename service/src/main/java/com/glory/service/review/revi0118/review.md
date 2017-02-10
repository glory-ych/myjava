1.key
keys/type/sort/rename/renamenx/expire/expireat/pexpire/pexpireat/presist/exists/ttl/pttl/randomkey
move/migrate
2.string
set/get/mset/mget/setget/append/incr/incrby/incrbyfloat/decr/decrby/setrange/getrange/strlen/setnx/setex/msetnx/psetex
3.hash
hkeys/hvals/hgetall/hset/hget/hmset/hmget/hlen/hdel/hexists/hincrby/hincrbyfloat/hsetnx
1.keys/vals/getall  2.set/get  3.del/len/exists/incrby/incrbyfloat
4.list
rpop/lpop/rpush/lpush/rpoplpush/lrem/linsert/lset/lindex/ltrim/lrange/llen
1.pop/push 2.insert/set/index/trim 3.llen/lrange/lrem 4.bpop
5.set
sadd/sunion/sunionstore/sinter/sinterstore/sdiff/sdiffstore/scard/srem/sismember/smembers/srandmember/spop/smove
1.sadd/srem/spop/smove/scard 2.inter/diff/union 3.memeber
6.zset
zadd/zrem/zrembyscore/zrembyrank/zcard/zcount/zscore/zrange/zrevrange/zrangebyscore/zrevrangebyscore/zrank/zrevrank/zincrby/zunionstore/zinterstore
1.rem 2.range/rank 3.zadd/zcard/zcount/zscore/zincrby 4.zunionstore/zinterstore
7.transcation
multi/discard/exec/watch/unwatch
8.connection
select/auth/ping/echo/quit
9.server
info、client setname/getname/list/kill、config set/get/rewrite/resetstat、save/lastsave/bgsave、slave of ip post、slave of no one、dbsize、flushdb、flushall、shutdown
10.pub/sub
publish/subscribe/unsubscribe/psubscribe/punsubscribe