package com.example.springdatajpa.springdatajpabatch4.service;

import java.util.List;
import java.util.Optional;

import com.example.springdatajpa.springdatajpabatch4.model.Post;



public interface PostService {
	
	public List<Post> getAllData();
	public Post insertPost(Post post);
	public Optional<Post> searchPost(int pid);
	public void deletePost(int pid);
}
