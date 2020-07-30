package com.aust.mvc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://47.105.73.182:3306/test?useUnicode=true&characterEncoding=utf8");
        druidDataSource.setUsername("aust");
        druidDataSource.setPassword("aust2020@A");
        return druidDataSource;
    }
}
