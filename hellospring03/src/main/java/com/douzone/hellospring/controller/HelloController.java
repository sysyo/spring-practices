package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello") // 어노테이션 : 'hello' 라는 요청이 들어왔을 때 실행
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	
	}
}
