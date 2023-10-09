package com.icarus.ai.service;

import com.icarus.ai.domain.SysUser;

import java.util.List;

/**
 * @className: IUserService
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
public interface ISysUserService {

    public SysUser selectSysUserByLoginName(String userName);

    public List<SysUser> selectSysUserList();
}
