package com.egf.statisticsserver.dao.mapperMysql;

import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import org.apache.ibatis.annotations.Param;

public interface StatisticQualityDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(StatisticQualityDay record);

    int insertSelective(StatisticQualityDay record);

    StatisticQualityDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StatisticQualityDay record);

    int updateByPrimaryKey(StatisticQualityDay record);

    /**
     * 获取每日统计
     * @param gatherUserId
     * @param departCode
     * @param date
     * @return
     */
    StatisticQualityDay getStatisticQualityDay(@Param("gatherUserId") String gatherUserId, @Param("departCode") String departCode, @Param("date") int date);
}