测试地址：http://10.30.5.9/
正式地址：http://internal-disconf-196991461.cn-north-1.elb.amazonaws.com.cn
1.登录disconf，创建app，上传托管文件，创建配置项
2.引入disconf依赖
<dependency>
    <groupId>com.baidu.disconf</groupId>
    <artifactId>disconf-client</artifactId>
    <version>2.6.36</version>
</dependency>
3.配置disconf.properties
4.配置spring-disconf.xml，并import applicationContext.xml

注意：
1.如果使用disconf注解，必须正确配置disconfMgrBean的scanPackage
2.托管文件必须配置到ReloadablePropertiesFactoryBean的locations
