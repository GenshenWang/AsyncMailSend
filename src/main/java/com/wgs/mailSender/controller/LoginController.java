package com.wgs.mailSender.controller;

import com.wgs.mailSender.async.EventModel;
import com.wgs.mailSender.async.EventProducer;
import com.wgs.mailSender.async.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wanggenshen_sx on 2017/5/10.
 */
@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	EventProducer eventProducer;

	@RequestMapping(path = {"/user/login"}, method = {RequestMethod.GET})
	public String login(){
		System.out.print("login..");
		return "login";
	}

	@RequestMapping(path = {"/user/dologin"}, method = {RequestMethod.GET})
	public String dologin(){
		System.out.print("dologin..");
		return "forward:/user/userPage";
	}

	@RequestMapping(path = {"/user/userPage"}, method = {RequestMethod.GET})
	public ModelAndView user(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		System.out.print("success..");
		String email = request.getParameter("email");

		eventProducer.fireEvent(new EventModel(EventType.MAIL).setExt("email", email));

		mv.setViewName("userPage");
		mv.addObject("email", email);
		return mv;
	}

}
