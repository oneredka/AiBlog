package com.icarus.aiblog.admin.dao;

import com.icarus.aiblog.common.domain.dos.UserDO;

public interface AdminUserDao {
    UserDO selectByUsername(String username);

    int updateAdminPassword(UserDO userDO);
}
