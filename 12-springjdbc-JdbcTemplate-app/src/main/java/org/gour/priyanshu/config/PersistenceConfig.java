package org.gour.priyanshu.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class PersistenceConfig {

	@Bean
	public DataSource dataSource() {
		String location = "/Users/priyanshugour/Desktop/SpringAndMicroservices/spring-boot/12-springjdbc-JdbcTemplate-app/src/main/java/org/gour/priyanshu/config/application.properties";
		HikariDataSource dataSource = new HikariDataSource(new HikariConfig(location));
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
 