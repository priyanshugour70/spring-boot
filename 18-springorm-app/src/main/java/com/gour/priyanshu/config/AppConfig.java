package com.gour.priyanshu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.app.nitin")
@Import(PersistenceConfig.class)
public class AppConfig {

	
	
	
}
