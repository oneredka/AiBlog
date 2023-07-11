package com.icarus.aiblog.common.domain.dos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleCountDO {
    private String date;
    private Long count;
}
