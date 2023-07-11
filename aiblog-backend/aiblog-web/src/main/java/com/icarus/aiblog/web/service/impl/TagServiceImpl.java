package com.icarus.aiblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.mapper.TagMapper;
import com.icarus.aiblog.common.domain.dos.TagDO;
import com.icarus.aiblog.web.dao.TagDao;
import com.icarus.aiblog.web.model.vo.tag.QueryTagListRspVO;
import com.icarus.aiblog.web.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class TagServiceImpl extends ServiceImpl<TagMapper, TagDO> implements TagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public Response queryTagList() {
        List<TagDO> tagDOS = tagDao.selectAllTag();
        List<QueryTagListRspVO> list = null;

        if (!CollectionUtils.isEmpty(tagDOS)) {
            list = tagDOS.stream()
                    .map(p -> QueryTagListRspVO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .build())
                    .collect(Collectors.toList());
        }

        return Response.success(list);
    }
}
