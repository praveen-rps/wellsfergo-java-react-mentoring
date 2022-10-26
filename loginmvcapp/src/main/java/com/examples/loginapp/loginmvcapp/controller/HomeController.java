package com.examples.loginapp.loginmvcapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.loginapp.loginmvcapp.dao.LoginDao;
import com.examples.loginapp.loginmvcapp.model.User;

@Controller
public class HomeController {
	
	@Autowired
	LoginDao dao;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/validate")
	public String validate(HttpServletRequest request) {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		boolean isFound=false;
		List<User> users = dao.getAllUsers();
		for(User usr:users) {
			if(usr.getUsername().equals(uname) && usr.getPassword().equals(passwd)) {
				isFound=true;
				break;
			}
		}
		if (isFound)
			return "pass";
		else
			return "fail";
	}
}
