package com.examples.loginapp.kyndryllogin.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.loginapp.kyndryllogin.model.User;
import com.examples.loginapp.kyndryllogin.model.UserRowMapper;

@Component
public class LoginDao {
	
	@Autowired
	JdbcTemplate template;
	
	
	public List<User> getAllUsers(){
		return template.query("select * from User", new UserRowMapper());
	}
}
