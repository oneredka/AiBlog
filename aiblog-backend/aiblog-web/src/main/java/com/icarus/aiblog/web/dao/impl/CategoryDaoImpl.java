package com.icarus.aiblog.web.dao.impl;

import com.icarus.aiblog.common.domain.mapper.CategoryMapper;
import com.icarus.aiblog.common.domain.dos.CategoryDO;
import com.icarus.aiblog.web.dao.CategoryDao;
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
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDO> selectAllCategory() {
        return categoryMapper.selectList(null);
    }

}
