package com.fifa.dreamteam.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class DBConfig {
  @Value("${database.url}")
  private String url;

  @Value("${database.username}")
  private String username;

  @Value("${database.password}")
  private String password;

  @Bean(name = "defaultDataSource")
  @Primary
  public DataSource dataSource() {
    HikariConfig hikariConfig = new HikariConfig();
    hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
    hikariConfig.setJdbcUrl(url);
    hikariConfig.setUsername(username);
    hikariConfig.setPassword(password);
    hikariConfig.setPoolName("hikari config name.");
    HikariDataSource dataSource = new HikariDataSource(hikariConfig);
    return dataSource;
  }

//    @Bean(name = "defaultJdbcTemplate")
//    public NamedParameterJdbcTemplate defaultJdbcTemplate (
//            @Qualifier("defaultDataSource") DataSource defaultDataSource) {
//        return new NamedParameterJdbcTemplate(defaultDataSource);
//    }
}
