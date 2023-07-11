package com.icarus.aiblog.admin.dao;

import com.icarus.aiblog.common.domain.dos.StatisticsArticlePVDO;

import java.util.Date;
import java.util.List;

public interface AdminStatisticsArticlePVDao {
    void pvIncrease(Date currDate);

    List<StatisticsArticlePVDO> selectLatestWeekRecords();

    List<StatisticsArticlePVDO> selectAllPVCount();
}
