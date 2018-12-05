package com.example.demo.config;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;

public class DataSourceConfig {
    private DataSource dataSource;
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return  new JdbcTemplate(dataSource);
    }
}
