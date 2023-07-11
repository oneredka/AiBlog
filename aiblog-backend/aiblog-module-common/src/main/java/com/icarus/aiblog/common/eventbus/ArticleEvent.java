package com.icarus.aiblog.common.eventbus;

import lombok.Builder;
import lombok.Getter;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-07-01 21:39
 * @description: TODO
 **/
@Getter
@Builder
public class ArticleEvent {
    private Long articleId;
    private String message;
}
