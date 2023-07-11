package com.icarus.aiblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.CategoryDO;


public interface CategoryService extends IService<CategoryDO> {
    Response queryCategoryList();

}
