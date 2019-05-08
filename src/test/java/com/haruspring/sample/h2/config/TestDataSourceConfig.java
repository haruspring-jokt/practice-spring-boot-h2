package com.haruspring.sample.h2.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestDataSourceConfig {

  private static final String URL = "jdbc:h2:mem:AZ;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=TRUE";
  private static final String USERNAME = "";
  private static final String PASSWORD = "";

  @Bean
  public DataSource dataSource() {
    return new DriverManagerDataSource(URL, USERNAME, PASSWORD);
  }
}
