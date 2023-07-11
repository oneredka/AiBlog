package com.icarus.aiblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.mapper.BlogSettingMapper;
import com.icarus.aiblog.common.domain.dos.BlogSettingDO;
import com.icarus.aiblog.web.model.vo.blogsetting.QueryBlogSettingRspVO;
import com.icarus.aiblog.web.service.BlogSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class BlogSettingServiceImpl extends ServiceImpl<BlogSettingMapper, BlogSettingDO> implements BlogSettingService {

    @Override
    public Response queryBlogSettingDetail() {
        BlogSettingDO blogSettingDO = getOne(null);

        QueryBlogSettingRspVO queryBlogSettingRspVO = null;
        if (Objects.nonNull(blogSettingDO)) {
            queryBlogSettingRspVO = QueryBlogSettingRspVO.builder()
                    .blogName(blogSettingDO.getBlogName())
                    .author(blogSettingDO.getAuthor())
                    .avatar(blogSettingDO.getAvatar())
                    .introduction(blogSettingDO.getIntroduction())
                    .githubHome(blogSettingDO.getGithubHome())
                    .csdnHome(blogSettingDO.getCsdnHome())
                    .giteeHome(blogSettingDO.getGiteeHome())
                    .zhihuHome(blogSettingDO.getZhihuHome())
                    .build();
        }
        return Response.success(queryBlogSettingRspVO);
    }
}
