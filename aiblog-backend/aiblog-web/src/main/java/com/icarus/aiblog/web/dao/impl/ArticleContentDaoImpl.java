package com.icarus.aiblog.web.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.icarus.aiblog.common.domain.mapper.ArticleContentMapper;
import com.icarus.aiblog.common.domain.dos.ArticleContentDO;
import com.icarus.aiblog.web.dao.ArticleContentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class ArticleContentDaoImpl implements ArticleContentDao {
    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Override
    public ArticleContentDO selectArticleContentByArticleId(Long articleId) {
        QueryWrapper<ArticleContentDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleId);
        return articleContentMapper.selectOne(wrapper);
    }
}
