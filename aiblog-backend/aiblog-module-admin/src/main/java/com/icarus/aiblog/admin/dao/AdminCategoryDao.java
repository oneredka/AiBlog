package com.icarus.aiblog.admin.dao;

import com.icarus.aiblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface AdminCategoryDao {
    List<CategoryDO> selectAllCategory();

    Long selectTotalCount();
}
