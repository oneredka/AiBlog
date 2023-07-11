package com.icarus.aiblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.UserDO;


public interface AdminUserService extends IService<UserDO> {
    Response updateAdminPassword(UpdateAdminPasswordReqVO updateAdminPasswordReqVO);
}
