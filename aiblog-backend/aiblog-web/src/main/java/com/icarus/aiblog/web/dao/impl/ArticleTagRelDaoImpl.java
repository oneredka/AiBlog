package com.icarus.aiblog.web.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.icarus.aiblog.common.domain.mapper.ArticleTagRelMapper;
import com.icarus.aiblog.common.domain.dos.ArticleTagRelDO;
import com.icarus.aiblog.web.dao.ArticleTagRelDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class ArticleTagRelDaoImpl implements ArticleTagRelDao {

    @Autowired
    private ArticleTagRelMapper articleTagRelMapper;

    @Override
    public List<ArticleTagRelDO> selectByArticleIds(List<Long> articleIds) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().in(ArticleTagRelDO::getArticleId, articleIds);
        return articleTagRelMapper.selectList(wrapper);
    }

    @Override
    public List<ArticleTagRelDO> selectByTagId(Long queryTagId) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().in(ArticleTagRelDO::getTagId, queryTagId);
        return articleTagRelMapper.selectList(wrapper);
    }
}
