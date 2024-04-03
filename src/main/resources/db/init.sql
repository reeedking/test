DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    id    BIGINT NOT NULL COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

INSERT INTO `user` (id, name, age, email)
VALUES (1, 'Jone', 18, 'test1@qq.com'),
       (2, 'Jack', 20, 'test2@qq.com'),
       (3, 'Tom', 28, 'test3@qq.com'),
       (4, 'Sandy', 21, 'test4@qq.com'),
       (5, 'Billie', 24, 'test5@qq.com');