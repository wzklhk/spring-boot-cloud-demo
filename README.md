# 数据库部署

## MySQL

Docker创建容器

```shell
docker run \
-p 3306:3306 \
--name mysql57 \
-v /etc/localtime:/etc/localtime \
-v /home/docker/mysql/log:/var/log/mysql \
-v /home/docker/mysql/data:/var/lib/mysql \
-v /home/docker/mysql/conf.d:/etc/mysql/conf.d \
-e MYSQL_ROOT_PASSWORD=password \
-d mysql:5.7
```

```shell
docker start mysql57
```


