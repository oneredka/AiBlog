package com.icarus.ai.mapper;

import com.icarus.ai.domain.SysUser;

import java.util.List;

/**
 * @className: UserMapper
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
public interface SysUserMapper {

    SysUser selectSysUserByLoginName(String userName);

    List<SysUser> selectSysUserList();
}
