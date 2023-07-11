package com.icarus.aiblog.admin.model.vo.tag;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteTagReqVO {

    @NotNull(message = "标签 ID 不能为空")
    private Long tagId;

}
