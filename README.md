# xiaohehe_utils

小赫赫的Java开发工具箱，目前有以下的工具。

- 日期管理以及比较
- 利用 MD5 对明文进行加密
- 随机数生成

虽然不多，但是到后面有用的时候再写一些工具。

**如果是 maven 项目的话，且需要部署到生产环境中，则需要进行以下的操作**

执行以下命令

```cmd
mvn install:install-file -Dfile=xiaohehe_utils.jar -DgroupId=top.bestguo -DartifactId=xiaohehe_utils -Dversion=1.0 -Dpackaging=jar
```

然后在你的 pom.xml 配置文件中就可以引入了

```xml
<dependency>
    <groupId>top.bestguo</groupId>
    <artifactId>xiaohehe_utils</artifactId>
    <version>1.0</version>
</dependency>
```