package com.icarus.aiblog.admin.service.impl;

import com.icarus.aiblog.admin.model.vo.file.UploadFileRspVO;
import com.icarus.aiblog.admin.service.AdminFileService;
import com.icarus.aiblog.admin.utils.MinioUtil;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.enums.ResponseCodeEnum;
import com.icarus.aiblog.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class AdminFileServiceImpl implements AdminFileService {

    @Autowired
    private MinioUtil minioUtil;

    @Override
    public Response uploadFile(MultipartFile file) {
        try {
            String url = minioUtil.uploadFile(file);
            return Response.success(UploadFileRspVO.builder().url(url).build());
        } catch (Exception e) {
            log.error("==> 上传文件异常: ", e);
            throw new BizException(ResponseCodeEnum.UPLOAD_FILE_ERROR);
        }
    }
}
