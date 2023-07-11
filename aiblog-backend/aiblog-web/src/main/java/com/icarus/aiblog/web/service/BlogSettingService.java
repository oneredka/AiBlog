package com.icarus.aiblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.BlogSettingDO;


public interface BlogSettingService extends IService<BlogSettingDO> {

    Response queryBlogSettingDetail();
}
