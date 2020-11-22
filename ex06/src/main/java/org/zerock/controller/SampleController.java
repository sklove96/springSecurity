package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {
	
	@GetMapping("/all") //모두
	public void doAll() {
		
		log.info("do all can access everybody");
	}
	
	@GetMapping("/member") //가입자만
	public void doMember() {
		
		log.info("logined member");
		
	}
	
	@GetMapping("/admin") //관리자만
	public void doAdmin() {
		
		log.info("admin only");
	}
}
