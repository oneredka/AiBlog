package com.icarus.ai.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @className: BaseEntity
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/9/28
 **/
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = -509781501238013335L;

    private Long id;
    private String deleted;
    private Date createdTime;
    private Date updatedTime;
}
