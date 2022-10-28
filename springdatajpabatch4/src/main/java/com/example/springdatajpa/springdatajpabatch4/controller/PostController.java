package com.example.springdatajpa.springdatajpabatch4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.springdatajpabatch4.model.Post;
import com.example.springdatajpa.springdatajpabatch4.service.PostService;

@RestController
public class PostController {
	
	
	@Autowired
	PostService service;
	
	@DeleteMapping("/delete/{pid}")
	public String deletePost(@PathVariable("pid")int pid){
		service.deletePost(pid);
		
		return "data deleted";
	}
	
	
	@GetMapping("/find/{pid}")
	public Optional<Post> searchPost(@PathVariable("pid")int pid){
		return service.searchPost(pid);
	}
	
	@PostMapping("/add")
	public Post insertPost(@RequestBody Post post) {
		return service.insertPost(post);
	}
	
	@GetMapping("/all")
	public List<Post> showAllData(){
		return service.getAllData();
	}

}
