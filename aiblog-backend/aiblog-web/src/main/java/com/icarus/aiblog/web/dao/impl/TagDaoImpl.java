package com.icarus.aiblog.web.dao.impl;

import com.icarus.aiblog.common.domain.mapper.TagMapper;
import com.icarus.aiblog.common.domain.dos.TagDO;
import com.icarus.aiblog.web.dao.TagDao;
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
public class TagDaoImpl implements TagDao {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagDO> selectAllTag() {
        return tagMapper.selectList(null);
    }
}