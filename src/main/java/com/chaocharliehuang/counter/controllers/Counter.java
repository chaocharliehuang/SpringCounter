package com.chaocharliehuang.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Counter {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			int count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		return "counter";
	}
}
