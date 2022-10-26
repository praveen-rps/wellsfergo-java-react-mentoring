package kyndrylspringjdbc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import kyndrylspringjdbc.model.Post;

@Component("jdbc")
public class PostDaoJdbcImpl implements PostDao{

	@Override
	public List<Post> getPostsFromDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePost(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}
