package com.example.hotel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

//123
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/codes")
	public String codes() {
		return "codes";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
	
	@RequestMapping("/icons")
	public String icons() {
		return "icons";
	}
	
	@RequestMapping("/single")
	public String single() {
		return "single";
	}
}
