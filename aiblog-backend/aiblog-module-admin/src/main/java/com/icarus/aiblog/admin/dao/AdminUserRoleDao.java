package com.icarus.aiblog.admin.dao;


import com.icarus.aiblog.common.domain.dos.UserRoleDO;

import java.util.List;

public interface AdminUserRoleDao {
    List<UserRoleDO> selectByUsername(String username);
}
