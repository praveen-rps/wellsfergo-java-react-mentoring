package kyndrylspringjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kyndrylspringjdbc.dao.PostDao;
import kyndrylspringjdbc.model.Post;

@Component
public class PostServiceImpl implements PostService {
	
	
	@Autowired
	@Qualifier("springjdbc")
	public PostDao dao;
	
	
	
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.getPostsFromDatabase();
	}



	@Override
	public String insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.insertPost(post);
	}



	@Override
	public String deletePost(int pid) {
		// TODO Auto-generated method stub
		return dao.deletePost(pid);
	}

}
