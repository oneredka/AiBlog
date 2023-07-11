package com.icarus.aiblog.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.icarus.aiblog.admin.dao.AdminUserDao;
import com.icarus.aiblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.icarus.aiblog.admin.service.AdminUserService;
import com.icarus.aiblog.common.Response;
import com.icarus.aiblog.common.domain.dos.UserDO;
import com.icarus.aiblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-04-17 12:08
 * @description: TODO
 **/
@Service
@Slf4j
public class AdminUserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements AdminUserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AdminUserDao userDao;

    @Override
    public Response updateAdminPassword(UpdateAdminPasswordReqVO updateAdminPasswordReqVO) {
        UserDO userDO = UserDO.builder()
                .password(passwordEncoder.encode(updateAdminPasswordReqVO.getNewPassword()))
                .updateTime(new Date())
                .build();
        userDao.updateAdminPassword(userDO);
        return Response.success();
    }
}
