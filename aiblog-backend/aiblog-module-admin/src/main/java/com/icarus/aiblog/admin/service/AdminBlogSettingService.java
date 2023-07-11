package com.icarus.aiblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.icarus.aiblog.admin.model.vo.user.QueryUserDetailRspVO;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.BlogSettingDO;


public interface AdminBlogSettingService extends IService<BlogSettingDO> {

    Response updateBlogSetting(UpdateBlogSettingReqVO updateBlogSettingReqVO);

    Response queryBlogSettingDetail();

    Response<QueryUserDetailRspVO> queryNicknameAndAvatar();
}
