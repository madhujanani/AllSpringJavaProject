package org.training.springmvc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySource("classpath:database.properties")
@ComponentScan(basePackages="org.training.springmvc")
public class AppConfig {
	
	@Autowired
	Environment env;
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Pages/");
		resolver.setSuffix(".jsp");
		return resolver;		
	}
	@Bean
	DataSource datsor() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(env.getProperty("driver"));		
		dmds.setUrl(env.getProperty("url"));
		dmds.setUsername(env.getProperty("dbuser"));		
		dmds.setPassword(env.getProperty("dbpassword"));		
		return dmds;
		//just added 
	
	}
	
	
}
