package com.douzone.hellospring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello") // 어노테이션 : 'hello' 라는 요청이 들어왔을 때 실행
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
//	@RequestMapping("/guestbook/list") 
//	public String hello2() {
//		return "/WEB-INF/views/hello.jsp";
//	}
	
	@RequestMapping("/hello2")
//	public String hello2(@RequestParam("n") String name) {
	public String hello2(HttpServletRequest request) {
		String name = request.getParameter("n");
		System.out.println(name);
		
		return "/WEB-INF/views/hello2.jsp";
	}
	
// -------------------------------------------------------------
	
	@RequestMapping("/hello3")
	public ModelAndView hello3(String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name); // model
		mav.setViewName("/WEB-INF/views/hello3.jsp"); // view
				
		return mav;
	}
	
	@RequestMapping("/hello4")
	public String hello4(String name, Model model) {
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello3.jsp";
	}
	
	// ----------------------------------------------------------
	
	@ResponseBody
	@RequestMapping("/hello5")
	public String hello5() {
		return "<h1>Hello World</h1>";
	}
	
	// ----------------------------------------------------------

	@RequestMapping("/hello6")
	public String hello6() {
		System.out.println("hello6() called");
		return "redirect:/hello";
	}
}
