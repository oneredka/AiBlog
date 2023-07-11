package com.icarus.aiblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.TagDO;


public interface TagService extends IService<TagDO> {
    Response queryTagList();
}
