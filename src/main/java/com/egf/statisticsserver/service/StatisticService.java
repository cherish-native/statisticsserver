package com.egf.statisticsserver.service;

import com.egf.statisticsserver.model.mysql.StatisticQualityDay;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface StatisticService {

    StatisticQualityDay getStatisTicQualityDay(int statisticDay, String departCode, String gatherUserName);

    /**
     * 每日质量统计
     * @param statisticQualityDays
     * @param date
     */
    void qualityStatisticDay(List<StatisticQualityDay> statisticQualityDays, int date);
}
