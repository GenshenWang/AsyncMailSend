package com.wgs.mailSender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wanggenshen_sx on 2017/5/8.
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
