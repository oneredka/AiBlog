package com.icarus.aiblog.web.dao;

import com.icarus.aiblog.common.domain.dos.ArticleCategoryRelDO;

import java.util.List;

public interface ArticleCategoryRelDao {

    List<ArticleCategoryRelDO> selectByArticleIds(List<Long> articleIds);

    List<ArticleCategoryRelDO> selectByCategoryId(Long categoryId);
}
