package kyndrylspringjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import kyndrylspringjdbc.model.Post;

public interface PostDao {

	public List<Post> getPostsFromDatabase();
	public String insertPost(Post post);
	public String deletePost(int pid);
	
}
