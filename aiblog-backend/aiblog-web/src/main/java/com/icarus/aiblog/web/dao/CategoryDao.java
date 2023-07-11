package com.icarus.aiblog.web.dao;

import com.icarus.aiblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface CategoryDao {
    List<CategoryDO> selectAllCategory();

}
