package com.icarus.aiblog.admin.service.impl;

import com.icarus.aiblog.admin.dao.AdminUserDao;
import com.icarus.aiblog.admin.dao.AdminUserRoleDao;
import com.icarus.aiblog.common.domain.dos.UserDO;
import com.icarus.aiblog.common.domain.dos.UserRoleDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private AdminUserDao userDao;
    @Autowired
    private AdminUserRoleDao userRoleDao;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserDO userDO = userDao.selectByUsername(username);

        if (userDO == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        // 用户角色
        List<UserRoleDO> roleDOS = userRoleDao.selectByUsername(username);

        String[] roleArr = null;

        if (!CollectionUtils.isEmpty(roleDOS)) {
            List<String> roles = roleDOS.stream().map(p -> p.getRole()).collect(Collectors.toList());
            roleArr = roles.toArray(new String[roles.size()]);
        }

        return User.withUsername(userDO.getUsername())
                .password(userDO.getPassword())
                .authorities(roleArr)
                .build();
    }

}
