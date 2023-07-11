package com.icarus.aiblog.web.controller;

import com.icarus.aiblog.common.PageResponse;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.aspect.ApiOperationLog;
import com.icarus.aiblog.web.model.vo.article.QueryTagArticlePageListReqVO;
import com.icarus.aiblog.web.service.ArticleService;
import com.icarus.aiblog.web.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-18 8:14
 * @description: 标签
 **/
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;
    @Autowired
    private ArticleService articleService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取所有标签数据")
    public Response queryTagList() {
        return tagService.queryTagList();
    }

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取所属标签的文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody @Validated QueryTagArticlePageListReqVO queryTagArticlePageListReqVO) {
        return articleService.queryTagArticlePageList(queryTagArticlePageListReqVO);
    }
}
