package kyndrylspringjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class PostRowMapper implements RowMapper<Post> {

	public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Post post = new Post();
		post.setPid(rs.getInt(1));
		post.setAuthor(rs.getString(2));
		post.setTitle(rs.getString(3));
		post.setDescription(rs.getString(4));
		return post;
	}

	
}
