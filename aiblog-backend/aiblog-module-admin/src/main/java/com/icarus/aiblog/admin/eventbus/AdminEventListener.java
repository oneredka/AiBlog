package com.icarus.aiblog.admin.eventbus;

import com.google.common.eventbus.Subscribe;
import com.icarus.aiblog.admin.async.PVIncreaseAsyncTask;
import com.icarus.aiblog.common.eventbus.EventListener;
import com.icarus.aiblog.common.eventbus.ArticleEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: 犬小哈
 * @url: www.icarus.com
 * @date: 2023-07-01 21:35
 * @description: 事件监听
 **/
@Component
@Slf4j
public class AdminEventListener implements EventListener {

    @Autowired
    private PVIncreaseAsyncTask pvIncreaseAsyncTask;

    @Subscribe
    @Override
    public void handleEvent(ArticleEvent event) {
        Long articleId = event.getArticleId();
        String message = event.getMessage();
        // 处理事件
        log.info("==> Received event: {}", message);
        pvIncreaseAsyncTask.handle(articleId);
    }
}
