package com.egf.statisticsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement //开启事务控制
public class StatisticsserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatisticsserverApplication.class, args);
    }

}
