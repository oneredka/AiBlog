package com.icarus.ai.domain;

import com.icarus.ai.enums.ArticleStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @className: Article
 * @description: article
 * @tag
 * @author: louis
 * @date: 2023/10/9
 **/
@EqualsAndHashCode(callSuper = false)
@Data
public class Article extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -1113803685012111706L;

    private Long authorId;
    private String title;
    private String content;
    /**
     * @see ArticleStatus
     */
    private String status;
}
