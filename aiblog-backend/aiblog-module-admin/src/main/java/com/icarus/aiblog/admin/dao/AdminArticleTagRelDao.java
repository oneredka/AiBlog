package com.icarus.aiblog.admin.dao;

import com.icarus.aiblog.common.domain.dos.ArticleTagRelDO;

import java.util.List;

public interface AdminArticleTagRelDao {
    void insertBatch(List<ArticleTagRelDO> articleTagRelDOS);

    List<ArticleTagRelDO> selectByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);
}
