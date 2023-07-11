package com.icarus.aiblog.admin.controller;

import com.icarus.aiblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.icarus.aiblog.admin.service.AdminBlogSettingService;
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
@RequestMapping("/admin/blog/setting")
public class AdminBlogSettingController {

    @Autowired
    private AdminBlogSettingService blogSettingService;

    @PostMapping("/update")
    @ApiOperationLog(description = "更新博客设置信息")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response updateBlogSetting(@RequestBody @Validated UpdateBlogSettingReqVO updateBlogSettingReqVO) {
        return blogSettingService.updateBlogSetting(updateBlogSettingReqVO);
    }

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取博客设置详情信息")
    public Response queryBlogSettingDetail() {
        return blogSettingService.queryBlogSettingDetail();
    }
}
