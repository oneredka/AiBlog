package com.icarus.aiblog.admin.service;

import com.icarus.aiblog.common.Response;
import org.springframework.web.multipart.MultipartFile;

public interface AdminFileService {
    Response uploadFile(MultipartFile file);
}
