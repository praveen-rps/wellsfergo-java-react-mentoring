
package kyndrylspringjdbc.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import kyndrylspringjdbc.dao.PostDaoImpl;

@Configuration
@ComponentScan(basePackages="kyndrylspringjdbc")
public class PostConfigurations {
	
	

	@Bean
	public DataSource getDataSourceObject() {
		// TODO Auto-generated method stub
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	
	@Bean
	public JdbcTemplate getJdbcTemplateObject() {
		
		JdbcTemplate template = 
				new JdbcTemplate(getDataSourceObject());
		
		return template;
	}

	
	/*
	@Bean
	public PostDaoImpl getPostDaoImplObject() {
		PostDaoImpl dao = new PostDaoImpl();
		dao.setTemplate(getJdbcTemplateObject());
		return dao;
	}
	
	
	@Bean
	public PostServiceImpl getPostServiceImplObject() {
		PostServiceImpl service = new PostServiceImpl();
		service.setDao(getPostDaoImplObject());
		return service;
	}
	*/
}
