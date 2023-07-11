package com.icarus.aiblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.common.domain.dos.CategoryDO;
import com.icarus.aiblog.admin.model.vo.category.AddCategoryReqVO;
import com.icarus.aiblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.icarus.aiblog.admin.model.vo.category.QueryCategoryPageListReqVO;
import com.icarus.aiblog.common.PageResponse;
import com.icarus.aiblog.common.Response;


public interface AdminCategoryService extends IService<CategoryDO> {
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    PageResponse queryCategoryPageList(QueryCategoryPageListReqVO queryCategoryPageListReqVO);

    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    Response queryCategorySelectList();
}
