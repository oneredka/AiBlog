package com.icarus.aiblog.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @author: 犬小哈
 * @from: 公众号：小哈学Java, 网站：www.icarus.com
 * @date: 2023-04-16 10:50
 * @version: v1.0.0
 * @description: 分页数据响应类
 **/
@Data
public class PageResponse<T> extends Response<List<T>> {

    // 总记录数
    private long total = 0L;
    // 每页显示的记录数
    private long size = 10L;
    // 当前页码
    private long current;

    public static <T> PageResponse<T> success(IPage page, List<T> data) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setCurrent(Objects.isNull(page) ? 0 : page.getCurrent());
        response.setTotal(Objects.isNull(page) ? 0 : page.getTotal());
        response.setSize(Objects.isNull(page) ? 0 : page.getSize());
        response.setData(data);
        return response;
    }


}