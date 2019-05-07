package com.egf.statisticsserver.service.impl;

import com.egf.statisticsserver.config.DataSourceConstant;
import com.egf.statisticsserver.dao.mapperMysql.StatisticQualityDayMapper;
import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import com.egf.statisticsserver.service.StatisticService;
import com.egf.statisticsserver.util.DateUtil;
import com.egf.statisticsserver.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(value = DataSourceConstant.TRANSACTIONMANAGERMYSQL)
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticQualityDayMapper statisticQualityDayMapper;


    @Override
    public StatisticQualityDay getStatisTicQualityDay(int statisticDay, String departCode, String gatherUserName) {
        return null;
    }

    private int nvlInt(Object obj){
        if(obj == null){
            return 0;
        }
        return Integer.parseInt(String.valueOf(obj));
    }

    @Override
    public void qualityStatisticDay(List<StatisticQualityDay> statisticQualityDays, int date) {
        if(statisticQualityDays != null && statisticQualityDays.size()>0){
            for(StatisticQualityDay statisticQualityDay : statisticQualityDays){
                StatisticQualityDay oldStatisticQualityDay = statisticQualityDayMapper.getStatisticQualityDay(statisticQualityDay.getGatheruserId(), statisticQualityDay.getDepartCode(), date);
                if(oldStatisticQualityDay != null){
                    statisticQualityDayMapper.deleteByPrimaryKey(oldStatisticQualityDay.getId());
                }
                statisticQualityDay.setId(StringUtil.generateUUID());
                statisticQualityDay.setStatisticTime(date);
                statisticQualityDayMapper.insert(statisticQualityDay);
            }
        }
    }
}
