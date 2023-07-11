package com.icarus.aiblog.admin.controller;

import com.icarus.aiblog.admin.model.vo.user.QueryUserDetailRspVO;
import com.icarus.aiblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.icarus.aiblog.admin.service.AdminBlogSettingService;
import com.icarus.aiblog.admin.service.AdminUserService;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.aspect.ApiOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-19 16:06
 * @description: TODO
 **/
@RestController
@RequestMapping("/admin")
public class AdminUserController {

    @Autowired
    private AdminBlogSettingService blogSettingService;
    @Autowired
    private AdminUserService userService;

    @PostMapping("/password/update")
    @ApiOperationLog(description = "修改用户密码")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response updateAdminPassword(@RequestBody @Validated UpdateAdminPasswordReqVO updateAdminPasswordReqVO) {
        return userService.updateAdminPassword(updateAdminPasswordReqVO);
    }

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取登录用户信息")
    public Response<QueryUserDetailRspVO> queryAdminDetail() {
        return blogSettingService.queryNicknameAndAvatar();
    }
}
