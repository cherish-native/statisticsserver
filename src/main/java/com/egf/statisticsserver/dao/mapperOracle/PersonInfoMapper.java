package com.egf.statisticsserver.dao.mapperOracle;

import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import com.egf.statisticsserver.model.oracle.PersonInfo;
import com.egf.statisticsserver.model.oracle.PersonInfoWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

import java.util.HashMap;
import java.util.List;

public interface PersonInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(PersonInfoWithBLOBs record);

    int insertSelective(PersonInfoWithBLOBs record);

    PersonInfoWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PersonInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PersonInfoWithBLOBs record);

    int updateByPrimaryKey(PersonInfo record);

    /**
     * 获取人员定级统计
     * @param beginDate
     * @return
     */
    List<StatisticQualityDay> personLevelStatistic(@Param("beginDate") String beginDate);
}