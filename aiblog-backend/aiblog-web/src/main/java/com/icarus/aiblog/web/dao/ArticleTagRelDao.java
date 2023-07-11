package com.icarus.aiblog.web.dao;

import com.icarus.aiblog.common.domain.dos.ArticleTagRelDO;

import java.util.List;

public interface ArticleTagRelDao {

    List<ArticleTagRelDO> selectByArticleIds(List<Long> articleIds);

    List<ArticleTagRelDO> selectByTagId(Long queryTagId);
}
