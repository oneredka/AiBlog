package com.icarus.aiblog.admin.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.icarus.aiblog.admin.dao.AdminUserDao;
import com.icarus.aiblog.common.domain.dos.UserDO;
import com.icarus.aiblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class AdminUserDaoImpl implements AdminUserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO selectByUsername(String username) {
        QueryWrapper<UserDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(UserDO::getUsername, username);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public int updateAdminPassword(UserDO userDO) {
        UpdateWrapper<UserDO> wrapper = new UpdateWrapper<>();
        wrapper.lambda().eq(UserDO::getUsername, "admin");
        return userMapper.update(userDO, wrapper);
    }
}
