package com.icarus.ai.enums;

import lombok.Getter;

/**
 * @className: ArticleStatus
 * @description: article status
 * @tag
 * @author: louis
 * @date: 2023/10/9
 **/
@Getter
public enum ArticleStatus {
    DRAFT(1, "draft"),
    PUBLISHED(0, "published");

    private int code;
    private String desc;

    ArticleStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
