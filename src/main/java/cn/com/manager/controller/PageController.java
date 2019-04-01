package cn.com.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String welcom() {
		System.out.println("»»Ò»¸ö°à");
		return "index";
	}
	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	

}
