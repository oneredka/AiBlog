package com.icarus.ai.service.impl;

import com.icarus.ai.domain.sysuser.SysUser;
import com.icarus.ai.mapper.SysUserMapper;
import com.icarus.ai.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: UserServiceImpl
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser selectSysUserByLoginName(String userName) {
        return userMapper.selectSysUserByLoginName(userName);
    }

    @Override
    public List<SysUser> selectSysUserList() {
        return userMapper.selectSysUserList();
    }
}
