package com.examples.loginapp.kyndryllogin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.loginapp.kyndryllogin.dao.LoginDao;
import com.examples.loginapp.kyndryllogin.model.User;

@Controller
public class HomeController {
	
	@Autowired
	LoginDao dao;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/validate")
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		boolean isFound=false;
		List<User> users = dao.getAllUsers();
		for(User usr:users) {
			if(usr.getUname().equals(uname) && usr.getPasswd().equals(passwd)) {
				isFound=true;
				break;
			}
		}
		
		if(isFound)
			return new ModelAndView("success");
		else
			return new ModelAndView("fail");
	}
}
