package com.egf.statisticsserver.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Mysql 数据源
 */
@Configuration
@MapperScan(basePackages = DataSourceConstant.BASEPACKAGESMYSQL, sqlSessionFactoryRef = DataSourceConstant.SQLSESSIONFACTORYMYSQL)
public class DatasourceMysql {

    @Value("${datasourceMysql.url}")
    private String url;

    @Value("${datasourceMysql.username}")
    private String username;

    @Value("${datasourceMysql.password}")
    private String password;

    @Value("${datasourceMysql.driverClassName}")
    private String driverClassName;

    @Value("${datasourceMysql.mapperMysql-locations}")
    private String mybatisMapperLocations;

    @Bean(name = DataSourceConstant.DATASOURCEMYSQL)
    @Primary
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = DataSourceConstant.SQLSESSIONFACTORYMYSQL)
    @Primary
    public SqlSessionFactory getSqlSessionFactory(@Qualifier(DataSourceConstant.DATASOURCEMYSQL) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mybatisMapperLocations));
        return bean.getObject();
    }

    @Bean(name = DataSourceConstant.TRANSACTIONMANAGERMYSQL)
    @Primary
    public DataSourceTransactionManager getTransactionManager(@Qualifier(DataSourceConstant.DATASOURCEMYSQL) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
