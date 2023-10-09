package com.icarus.ai.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @className: Category
 * @description: category
 * @tag
 * @author: louis
 * @date: 2023/10/9
 **/
@EqualsAndHashCode(callSuper = false)
@Data
public class Category extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -1113803685012111706L;

    private String categoryName;

}
