package com.icarus.aiblog.web.controller;

import com.icarus.aiblog.common.PageResponse;
import com.icarus.aiblog.common.aspect.ApiOperationLog;
import com.icarus.aiblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.icarus.aiblog.web.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-18 8:14
 * @description: 首页
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取首页文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody QueryIndexArticlePageListReqVO queryArticlePageListReqVO) {
        return articleService.queryIndexArticlePageList(queryArticlePageListReqVO);
    }
}
