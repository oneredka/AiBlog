package com.icarus.aiblog.admin.service;

import com.icarus.aiblog.admin.model.vo.article.*;
import com.icarus.aiblog.common.Response;

public interface AdminArticleService {
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    Response queryArticleDetail(QueryArticleDetailReqVO queryArticleDetailReqVO);

    Response queryArticlePageList(QueryArticlePageListReqVO queryArticlePageListReqVO);

    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    Response updateArticle(UpdateArticleReqVO updateArticleReqVO);

}
