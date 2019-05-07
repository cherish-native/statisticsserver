package com.egf.statisticsserver.dao.mapperOracle;

import com.egf.statisticsserver.model.oracle.QualityScore;

public interface QualityScoreMapper {
    int insert(QualityScore record);

    int insertSelective(QualityScore record);
}