package com.examples.loginapp.loginmvcapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.loginapp.loginmvcapp.model.User;
import com.examples.loginapp.loginmvcapp.model.UserRowMapper;



@Component
public class LoginDao {
	
	
	@Autowired
	JdbcTemplate template;
	
	public List<User> getAllUsers(){
		return template.query("select * from User", new UserRowMapper());
	}
	
	// template.update("insert into User values(?,?)", user.getUname(),user.getPasswd()
	public String insertNotes(Notes notes) {
		// TODO Auto-generated method stub
		String sql ="insert into Notes values (?,?,?,?)";
		template.update(sql,notes.getPid(), notes.getAuthor(), notes.getTitle(), notes.getDescription());
		return "inserted";
	}


}
