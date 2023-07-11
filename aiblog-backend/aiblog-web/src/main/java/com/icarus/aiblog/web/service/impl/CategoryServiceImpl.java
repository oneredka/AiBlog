package com.icarus.aiblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.mapper.CategoryMapper;
import com.icarus.aiblog.common.domain.dos.CategoryDO;
import com.icarus.aiblog.web.dao.CategoryDao;
import com.icarus.aiblog.web.model.vo.category.QueryCategoryListRspVO;
import com.icarus.aiblog.web.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryDO> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Response queryCategoryList() {
        List<CategoryDO> categoryDOList = categoryDao.selectAllCategory();
        List<QueryCategoryListRspVO> list = null;
        if (!CollectionUtils.isEmpty(categoryDOList)) {
            list = categoryDOList.stream()
                    .map(p -> QueryCategoryListRspVO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .build())
                    .collect(Collectors.toList());
        }
        return Response.success(list);
    }


}
