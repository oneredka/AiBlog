CREATE DATABASE IF NOT EXISTS icarus
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;

/*用户表*/
drop table if exists sys_user;
CREATE TABLE `sys_user`
(
    id          bigint(20)  not null auto_increment comment '用户ID',
    login_name  varchar(30) not null comment '用户账号',
    password    varchar(100) default '' comment '密码',
    nick_name   varchar(30) not null comment '用户昵称',
    email       varchar(50)  default '' comment '用户邮箱',
    phonenumber varchar(11)  default '' comment '手机号码',
    sex         char(1)      default '0' comment '用户性别（0男 1女 2未知）',
    avatar      varchar(100) default '' comment '头像地址',
    status      char(1)      default '0' comment '帐号状态（0正常 1停用）',
    del_flag    char(1)      default '0' comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64)  default '' comment '创建者',
    create_time datetime     default CURRENT_TIMESTAMP comment '创建时间',
    update_by   varchar(64)  default '' comment '更新者',
    update_time datetime     default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户表';


INSERT INTO aiblog.sys_user (login_name, password, nick_name, email, phonenumber, sex, avatar, status, del_flag, create_by, create_time, update_by, update_time)
VALUES ('louis.yi', '123456', 'icarus', 'gg.hilock@gmail.com', DEFAULT, '0', DEFAULT, DEFAULT, DEFAULT, 'system', null, 'system', null);
INSERT INTO aiblog.sys_user (id, login_name, password, nick_name, email, phonenumber, sex, avatar, status, del_flag,create_by, create_time, update_by, update_time)
VALUES (null, 'admin', '123456', 'admin', 'gg.hilock@gmail.com', null, '0', null, null, null, 'system', null, 'system',null);
INSERT INTO aiblog.sys_user (id, login_name, password, nick_name, email, phonenumber, sex, avatar, status, del_flag, create_by, create_time, update_by, update_time)
VALUES (null, 'test', '123456', 'test', 'gg.xxxk@gmail.com', null, '0', null, null, null, 'system', null, 'system',null);