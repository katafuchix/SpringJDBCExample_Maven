# SpringJDBCExample_Maven

- resource/spring.xml

```
mysql> CREATE TABLE `Employee` (
    ->   `id` int(11) unsigned NOT NULL,
    ->   `name` varchar(20) DEFAULT NULL,
    ->   `role` varchar(20) DEFAULT NULL,
    ->   PRIMARY KEY (`id`)
    -> ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

```
% mvn compile
% java -cp target/SpringJDBCExample.jar net.deskplate.spring.jdbc.App
```
