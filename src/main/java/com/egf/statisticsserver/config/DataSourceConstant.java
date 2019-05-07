package com.egf.statisticsserver.config;

/**
 * 数据源常量
 */
public class DataSourceConstant {

    /**
     * 数据源 oracle
     */
    public static final String BASEPACKAGESORACLE = "com.egf.statisticsserver.dao.mapperOracle";
    public static final String DATASOURCEORACLE = "dataSourceOracle";
    public static final String SQLSESSIONFACTORYORACLE = "sqlSessionFactoryOracle";
    public static final String TRANSACTIONMANAGERORACLE = "transactionManagerOracle";

    /**
     * 数据源Mysql
     */
    public static final String BASEPACKAGESMYSQL = "com.egf.statisticsserver.dao.mapperMysql";
    public static final String DATASOURCEMYSQL = "dataSourceMysql";
    public static final String SQLSESSIONFACTORYMYSQL = "sqlSessionFactoryMysql";
    public static final String TRANSACTIONMANAGERMYSQL = "transactionManagerMysql";
}
