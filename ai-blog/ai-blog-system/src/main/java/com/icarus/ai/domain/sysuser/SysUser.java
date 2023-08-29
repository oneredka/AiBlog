package com.icarus.ai.domain.sysuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @className: User
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser implements Serializable {
    private Long id;
    private String nickName;
    private String loginName;
    private String password;
    private String email;
    private String phoneNumber;
    private String sex;
    private String salt;
    private String avatar;
    private String status;

    private String delFlag;
    private String createBy;
    private String updateBy;
    private Date createTime;
    private Date updateTime;
}
