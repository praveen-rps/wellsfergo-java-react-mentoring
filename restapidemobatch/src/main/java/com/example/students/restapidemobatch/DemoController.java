package com.example.students.restapidemobatch;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping("/params")
	public String getParams(@RequestParam("course") String c,
			@RequestParam("dur") int d) {
		return "welcome to "+c+" course it is of "+d+ "months";
	}
	
	@GetMapping("/{name}/{city}")
	public String getName(@PathVariable("name") String n,
			@PathVariable("city")String c) {
		return "Hello "+n+" Welcome to "+ c;
	}
	
	
	@PostMapping("/poststudent")
	public Student getStudentData(@RequestBody Student student) {
		student.setBranch("Civil");
		return student;
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student(1001,"kumar","cse");
	}

	
	@GetMapping("/get1")
	public String getMethod1() {
		return "get1 is called";
	}
	
	@GetMapping("/get2")
	public String getMethod2() {
		return "get2 is called";
	}
	
	@PostMapping("/post")
	public String postMethod() {
		return "Post method called";
	}
	@PutMapping("/put")
	public String putMethod() {
		return "Put method called";
	}
	@DeleteMapping("/delete")
	public String deleteMethod() {
		return "delete method called";
	}
	
}
