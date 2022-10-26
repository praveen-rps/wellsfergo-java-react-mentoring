package kyndrylspringjdbc.service;

import java.util.List;

import kyndrylspringjdbc.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public String insertPost(Post post);
	public String deletePost(int pid);
}
