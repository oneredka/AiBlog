package com.icarus.ai.enums;

import lombok.Getter;

/**
 * @className: UserStatus
 * @description: user status
 * @tag
 * @author: louis
 * @date: 2023/10/9
 **/
@Getter
public enum UserStatus {
    ACTIVE(1, "active"),
    INACTIVE(0, "inActive");

    private int code;
    private String desc;

    UserStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
