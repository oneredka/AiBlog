package com.icarus.aiblog.web.dao;

import com.icarus.aiblog.common.domain.dos.ArticleContentDO;

public interface ArticleContentDao {
    ArticleContentDO selectArticleContentByArticleId(Long articleId);
}
