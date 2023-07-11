package com.icarus.aiblog.admin.model.vo.tag;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddTagReqVO {

    @NotEmpty(message = "标签名称不能为空")
    private List<String> tags;

}
