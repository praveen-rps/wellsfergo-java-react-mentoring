package kyndrylspringjdbc.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kyndrylspringjdbc.configs.PostConfigurations;
import kyndrylspringjdbc.model.Post;
import kyndrylspringjdbc.service.PostServiceImpl;

public class PostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext 
		context = 
		new AnnotationConfigApplicationContext(PostConfigurations.class);
		PostServiceImpl  service = 
				(PostServiceImpl)context.getBean(PostServiceImpl.class);
		Scanner scanner = new Scanner(System.in);
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pid ");
		int pid = scanner.nextInt();
		service.deletePost(pid);
		
		System.out.println("Enter pid ");
		int pid = scanner.nextInt();
		System.out.println("Enter Author ");
		String author = scanner.next();
		System.out.println("Enter Title ");
		String title = scanner.next();
		System.out.println("Enter Description ");
		String desc = scanner.nextLine();
		
		
		Post post = new Post(pid,author,title,desc);
		System.out.println(service.insertPost(post));
		
		*/
		List<Post> posts = service.getAllPosts();
		
		posts.forEach(System.out::println);
		
	
	}

}
