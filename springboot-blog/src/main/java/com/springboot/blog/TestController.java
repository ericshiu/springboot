package com.springboot.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class TestController {

	@RequestMapping("/index")
	public @ResponseBody String testRead() {
		System.out.println("123123123");
		return "小范好猛";
	}

}
