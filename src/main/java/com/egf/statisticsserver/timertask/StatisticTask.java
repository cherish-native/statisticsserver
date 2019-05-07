package com.egf.statisticsserver.timertask;

import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import com.egf.statisticsserver.service.OracleService;
import com.egf.statisticsserver.service.StatisticService;
import com.egf.statisticsserver.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 定时统计任务
 */
@Component
public class StatisticTask {

    private static Logger logger = LoggerFactory.getLogger(StatisticTask.class);

    @Autowired
    private OracleService oracleService;
    @Autowired
    private StatisticService statisticService;

    /**
     * 每日质量统计
     */
    @Scheduled(cron = "0 0/5 * * * ? ")
    public void qualityStatisticDay(){
        logger.info("每日质量统计begin");
        Date date = new Date();
        String beginDate = DateUtil.getDateStr(date, DateUtil.PATTERN_YYYYMMDD);
        List<StatisticQualityDay> personLevelMap = oracleService.personLevelStatistic(beginDate);
        if(personLevelMap != null && personLevelMap.size() > 0){
            statisticService.qualityStatisticDay(personLevelMap,Integer.parseInt(beginDate));
        }
        logger.info("每日质量统计end");
    }

}
