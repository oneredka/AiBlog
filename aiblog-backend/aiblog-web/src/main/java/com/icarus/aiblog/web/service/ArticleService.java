package com.icarus.aiblog.web.service;

import com.icarus.aiblog.common.PageResponse;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.web.model.vo.article.QueryArticleDetailReqVO;
import com.icarus.aiblog.web.model.vo.article.QueryCategoryArticlePageListReqVO;
import com.icarus.aiblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.icarus.aiblog.web.model.vo.article.QueryTagArticlePageListReqVO;


public interface ArticleService {

    PageResponse queryIndexArticlePageList(QueryIndexArticlePageListReqVO queryIndexArticlePageListReqVO);

    PageResponse queryCategoryArticlePageList(QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO);

    Response queryArticleDetail(QueryArticleDetailReqVO queryArticleDetailReqVO);

    PageResponse queryTagArticlePageList(QueryTagArticlePageListReqVO queryTagArticlePageListReqVO);
}
