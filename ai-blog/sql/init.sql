CREATE DATABASE IF NOT EXISTS icarus
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;

DROP TABLE IF EXISTS article_tag;
DROP TABLE IF EXISTS article_category;
DROP TABLE IF EXISTS tag;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS article;
DROP TABLE IF EXISTS sys_user;

-- user  text: 123456 pwd: $2a$10$RIxwQFr/8qEsbVZzyPE7duTzcB00/HB5HDwM4X9pJOTeOd.mV5WyO
CREATE TABLE sys_user
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    login_name   VARCHAR(50)         NOT NULL,
    password     VARCHAR(100)        NOT NULL,
    nick_name    VARCHAR(30)         NOT NULL COMMENT '用户昵称',
    avatar       VARCHAR(500) DEFAULT '' COMMENT '头像地址',
    email        VARCHAR(255) UNIQUE NOT NULL,
    created_time TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       TINYINT      DEFAULT 0,
    is_deleted   TINYINT      DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户信息表';

CREATE TABLE article
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    author_id    INT      NOT NULL,
    title        TEXT     NOT NULL,
    content      LONGTEXT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       TINYINT   DEFAULT 0,
    is_deleted   TINYINT   DEFAULT 0,
    FOREIGN KEY (author_id) REFERENCES sys_user (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章信息表';

CREATE TABLE category
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(50) NOT NULL,
    created_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_deleted    TINYINT   DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章类别表';

CREATE TABLE article_category
(
    article_id      INT NOT NULL,
    category_id  INT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (article_id, category_id),
    FOREIGN KEY (article_id) REFERENCES article (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章类别关联表';


CREATE TABLE tag
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    tag_name     VARCHAR(50) NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_deleted   TINYINT   DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章标签表';


CREATE TABLE article_tag
(
    article_id      INT NOT NULL,
    tag_id       INT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (article_id, tag_id),
    FOREIGN KEY (article_id) REFERENCES article (id),
    FOREIGN KEY (tag_id) REFERENCES tag (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章标签关联表';



