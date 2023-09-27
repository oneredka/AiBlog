-- user  text: 123456 pwd: $2a$10$RIxwQFr/8qEsbVZzyPE7duTzcB00/HB5HDwM4X9pJOTeOd.mV5WyO
DROP TABLE  users;
CREATE TABLE users
(
    user_id      INT PRIMARY KEY AUTO_INCREMENT,
    login_name   VARCHAR(50)         NOT NULL,
    password     VARCHAR(100)         NOT NULL,
    nick_name    VARCHAR(30)         NOT NULL COMMENT '用户昵称',
    avatar       VARCHAR(500) DEFAULT '' COMMENT '头像地址',
    email        VARCHAR(255) UNIQUE NOT NULL,
    created_time TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       INT          DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '用户信息表';


DROP TABLE IF EXISTS posts;
CREATE TABLE posts
(
    post_id      INT PRIMARY KEY AUTO_INCREMENT,
    author_id    INT      NOT NULL,
    title        TEXT     NOT NULL,
    content      LONGTEXT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       INT       DEFAULT 0,
    FOREIGN KEY (author_id) REFERENCES users (user_id) ON DELETE CASCADE
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章信息表';

DROP TABLE IF EXISTS categories;
CREATE TABLE categories
(
    category_id   INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(50) NOT NULL,
    created_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status        INT       DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章类别表';

DROP TABLE IF EXISTS post_categories;
CREATE TABLE post_categories
(
    post_id      INT NOT NULL,
    category_id  INT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       INT       DEFAULT 0,
    PRIMARY KEY (post_id, category_id),
    FOREIGN KEY (post_id) REFERENCES posts (post_id) ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES categories (category_id) ON DELETE CASCADE
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章类别关联表';

DROP TABLE IF EXISTS tags;
CREATE TABLE tags
(
    tag_id       INT PRIMARY KEY AUTO_INCREMENT,
    tag_name     VARCHAR(50) NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       INT       DEFAULT 0
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章标签表';

DROP TABLE IF EXISTS post_tags;
CREATE TABLE post_tags
(
    post_id      INT NOT NULL,
    tag_id       INT NOT NULL,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    status       INT       DEFAULT 0,
    PRIMARY KEY (post_id, tag_id),
    FOREIGN KEY (post_id) REFERENCES posts (post_id) ON DELETE CASCADE,
    FOREIGN KEY (tag_id) REFERENCES tags (tag_id) ON DELETE CASCADE
) ENGINE = INNODB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '文章标签关联表';


