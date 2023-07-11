package com.icarus.aiblog.admin.controller;

import com.icarus.aiblog.admin.service.AdminFileService;
import com.icarus.aiblog.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-19 16:06
 * @description: TODO
 **/
@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminFileController {

    @Autowired
    private AdminFileService fileService;

    @PostMapping("/file/upload")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response uploadFile(@RequestParam MultipartFile file) {
        return fileService.uploadFile(file);
    }
}
