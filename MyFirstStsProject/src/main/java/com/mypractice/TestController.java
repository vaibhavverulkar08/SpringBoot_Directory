package com.mypractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String handleTest() {
		return "this is my first sts project using sts <<--simply return this statement"
				+ "(Using @RequestMapping annotation & @ResponseBody Annotation to this method & TestController class with @Controller Annotation)";
	}
}
