package com.icarus.aiblog.web.dao;

import com.icarus.aiblog.common.domain.dos.TagDO;

import java.util.List;

public interface TagDao {
    List<TagDO> selectAllTag();
}
