package com.icarus.aiblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("t_article_category_rel")
public class ArticleCategoryRelDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long articleId;
    private Long categoryId;
}
