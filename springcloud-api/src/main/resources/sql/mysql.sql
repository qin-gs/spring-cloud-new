create table dept
(
    dbname    bigint auto_increment
        primary key,
    name      varchar(64) null,
    db_source varchar(64) null,
    constraint dept_dbname_uindex
        unique (dbname)
);

alter table dept
    modify deptno bigint auto_increment;

insert into dept(dbname, db_source) value ('开发', database());
insert into dept(dbname, db_source) value ('人事', database());
insert into dept(dbname, db_source) value ('运维', database());
insert into dept(dbname, db_source) value ('市场', database());





