package com.icarus.ai.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className: User
 * @description: SysUser
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -1113803685012111706L;

    private String loginName;
    private String password;
    private String nickName;
    private String avatar;
    private String email;
    /**
     * @see com.icarus.ai.enums.UserStatus
     */
    private String status;
}
