create table emp(
    id int primary key auto_increment,
    ename varchar(50) not null unique,
    joindate date not null,
    salary double(7,2) not null,
    bonus double(7,2) default 0
);

insert into emp(id, ename, joindate, salary, bonus) values (1,'张三','1999-11-11',8800,5000); -- ok
-- 主键约束
insert into emp(id, ename, joindate, salary, bonus) values (null,'张三','1999-11-11',8800,5000);
insert into emp(id, ename, joindate, salary, bonus) values (1,'张三','1999-11-11',8800,5000);
insert into emp(id, ename, joindate, salary, bonus) values (2,'李四','1999-11-11',8800,5000); -- ok
-- 非空约束
insert into emp(id, ename, joindate, salary, bonus) values (3,null,'1999-11-11',8800,5000);
insert into emp(id, ename, joindate, salary, bonus) values (3,'李四','1999-11-11',8800,5000);
-- 默认约束
insert into emp(id, ename, joindate, salary) values (3,'王五','1999-11-11',8800); -- ok bonus=0
insert into emp(id, ename, joindate, salary, bonus) values (3,'王五','1999-11-11',8800, null ); -- bonus=null
-- auto_increment
insert into emp(ename, joindate, salary, bonus) values ('张三','1999-11-11',8800, null );
insert into emp(id, ename, joindate, salary, bonus) values (null,'李四','1999-11-11',8800, null );
