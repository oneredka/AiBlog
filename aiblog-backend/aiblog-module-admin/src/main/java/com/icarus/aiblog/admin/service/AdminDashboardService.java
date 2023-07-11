package com.icarus.aiblog.admin.service;


import com.icarus.aiblog.common.Response;

public interface AdminDashboardService {

    Response queryDashboardArticleStatisticsInfo();

    Response queryDashboardPublishArticleStatisticsInfo();

    Response queryDashboardPVStatisticsInfo();
}
