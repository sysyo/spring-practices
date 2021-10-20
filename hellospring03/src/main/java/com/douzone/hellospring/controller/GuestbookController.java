package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 * @author user
 * 클래스(타입) 단독 매핑
 */
	
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping		
	// url을 따로 안적어도 위에 class 전체 mapping 따라가고 
	// 뒤에 경로는 /list로
	public String list() {
		return "GuestbookController.list()";
	}

	@ResponseBody
	@RequestMapping	
	// url을 따로 안적어도 위에 class 전체 mapping 따라가고 
	// 뒤에 경로는 /delete로
	public String delete() {
		return "GuestbookController.delete()";
	}

	
}
