package com.icarus.aiblog.admin.dao;

import com.icarus.aiblog.common.domain.dos.ArticleCategoryRelDO;

public interface AdminArticleCategoryRelDao {
    int insert(ArticleCategoryRelDO articleCategoryRelDO);

    ArticleCategoryRelDO selectByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);
}
