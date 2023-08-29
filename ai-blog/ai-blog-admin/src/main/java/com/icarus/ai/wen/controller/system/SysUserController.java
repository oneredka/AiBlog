package com.icarus.ai.wen.controller.system;

import com.icarus.ai.domain.sysuser.SysUser;
import com.icarus.ai.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @className: SysUserController
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@Controller
@RequestMapping("/system/user")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<SysUser> list() {
        List<SysUser> list = userService.selectSysUserList();
        return list;
    }
}
