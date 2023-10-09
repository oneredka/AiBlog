package com.icarus.ai.web.controller.system;

import com.icarus.ai.domain.SysUser;
import com.icarus.ai.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @className: SysUserController
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@RestController
@RequestMapping("/system/user")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

    @GetMapping("/list")
    public List<SysUser> list() {
        List<SysUser> list = userService.selectSysUserList();
        return list;
    }

    @PostMapping("/login")
    public Boolean login() throws InterruptedException {
        this.wait(5000);
        System.out.println("login");
        return true;
    }
}
