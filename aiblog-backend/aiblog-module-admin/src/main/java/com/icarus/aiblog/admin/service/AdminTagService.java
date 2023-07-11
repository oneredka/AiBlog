package com.icarus.aiblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icarus.aiblog.admin.model.vo.tag.SearchTagReqVO;
import com.icarus.aiblog.common.domain.dos.TagDO;
import com.icarus.aiblog.admin.model.vo.tag.AddTagReqVO;
import com.icarus.aiblog.admin.model.vo.tag.DeleteTagReqVO;
import com.icarus.aiblog.admin.model.vo.tag.QueryTagPageListReqVO;
import com.icarus.aiblog.common.Response;


public interface AdminTagService extends IService<TagDO> {
    Response addTags(AddTagReqVO addTagReqVO);

    Response queryTagPageList(QueryTagPageListReqVO queryTagPageListReqVO);

    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    Response searchTags(SearchTagReqVO searchTagReqVO);

    Response queryTagSelectList();
}
