package com.example.springdatajpa.springdatajpabatch4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.springdatajpabatch4.dao.PostDao;
import com.example.springdatajpa.springdatajpabatch4.model.Post;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostDao dao;
	


	@Override
	public List<Post> getAllData() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public Optional<Post> searchPost(int pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public void deletePost(int pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
	}
}
