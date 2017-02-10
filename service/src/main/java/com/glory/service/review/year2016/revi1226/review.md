1.JVM参数
Xmx/Xmn/Xms/Xss/NewSize/MaxNewSize/PermSize/MaxPermSize/NewRatio/SurvivorRltio/PrintGC/PrintGCDetails/PrintGCTime/PrintHeapAtGC/MaxThuringThreshold/PretenureSizeThreshold
2.diff
diff -y -w file1 file2(-c/-u) diff -ruN file1 file2 > patch.log；patch file1 patch.log
3.command &
fg/bg/kill jobid/jobs -l
4.etc/sysconfig/iptabls(etc/rc.d/init.d/iptables status/restart)、etc/profile
5.ls | tee ls.log
6.kill -9 pid(15,19/18/2/3),pkill,xkill,killall
7.final类
8.@interface
基本类型/String/Enum/Class/Annations、public/default、value
9.more/less
10.ss
11.sz/rz
12.watch -n 2 -d 'pstree'
13.适配器
Adapter、Target、ITarget、Adaptee
14.history(!行号)、Ctrl+r(模糊查询)
15.tail
16.jstack pid
17.top -Hp pid、pstree pid | wc -l、
18.facade,subSystem
19.标记-清除算法(mark=false)
20.标记-整理算法
21.复制算法
22.内部类（普通、静态、局部、匿名）
23.tar zx/c/tvf
24.序列化实现clone（ByteArrayOutputStream/ObjectOutputStream/ByteArrayInputStream/ObjectInputeStream）
25.du/df
26.cat（-n，cat file，cat file1[..] > file2、）
30.单一职责、接口隔离、迪米特、里氏替换、开闭、依赖倒置
31.jstack/jstat/jmap
32.iostat/vmstat
33.事务隔离级别
Read Uncommitted/Read Committed/Repeatable Read/Serializable，脏读/不可重复读/幻读
34.事务传播特性
supports/not supported/required/requires new/never/mandatory/nested
35.synchronized锁
对象锁、类锁
35.HashMap、WeakHashMap
强弱引用、cloneable/serializable
36.Map遍历
KeySet、Values、EnterSet、Iterator
37.垃圾收集器
Serial、Parallel New























