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
 * Oracle 数据源
 */
@Configuration
@MapperScan(basePackages = DataSourceConstant.BASEPACKAGESORACLE, sqlSessionFactoryRef = DataSourceConstant.SQLSESSIONFACTORYORACLE)
public class DatasourceOracle {

    @Value("${datasourceOracle.url}")
    private String url;

    @Value("${datasourceOracle.username}")
    private String username;

    @Value("${datasourceOracle.password}")
    private String password;

    @Value("${datasourceOracle.driverClassName}")
    private String driverClassName;

    @Value("${datasourceOracle.mapperOracle-locations}")
    private String mybatisMapperLocations;

    @Bean(name = DataSourceConstant.DATASOURCEORACLE)
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = DataSourceConstant.SQLSESSIONFACTORYORACLE)
    public SqlSessionFactory getSqlSessionFactory(@Qualifier(DataSourceConstant.DATASOURCEORACLE) DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mybatisMapperLocations));
        return bean.getObject();
    }

    @Bean(name = DataSourceConstant.TRANSACTIONMANAGERORACLE)
    public DataSourceTransactionManager getTransactionManager(@Qualifier(DataSourceConstant.DATASOURCEORACLE) DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
