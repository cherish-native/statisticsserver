package com.egf.statisticsserver.service;

import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import com.egf.statisticsserver.model.oracle.PersonInfo;

import java.util.HashMap;
import java.util.List;

public interface OracleService {

    PersonInfo getPersonInfoById(String id);

    /**
     * 人员定级统计
     * @param beginDate
     * @return
     */
    List<StatisticQualityDay> personLevelStatistic(String beginDate);

}
