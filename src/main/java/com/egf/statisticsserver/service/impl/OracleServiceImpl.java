package com.egf.statisticsserver.service.impl;

import com.egf.statisticsserver.config.DataSourceConstant;
import com.egf.statisticsserver.dao.mapperOracle.PersonInfoMapper;
import com.egf.statisticsserver.dao.mapperOracle.QualityScoreMapper;
import com.egf.statisticsserver.model.mysql.StatisticQualityDay;
import com.egf.statisticsserver.model.oracle.PersonInfo;
import com.egf.statisticsserver.service.OracleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional(value = DataSourceConstant.TRANSACTIONMANAGERORACLE, readOnly = true)
public class OracleServiceImpl implements OracleService {

    @Autowired
    private PersonInfoMapper personInfoMapper;

    @Override
    public PersonInfo getPersonInfoById(String id) {
        return personInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<StatisticQualityDay> personLevelStatistic(String beginDate) {
        return personInfoMapper.personLevelStatistic(beginDate);
    }
}
