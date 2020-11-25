package com.malleswara.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcHelloController {
	
	@RequestMapping("/welcome")
	 public ModelAndView hellospringmvc() {
		 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from SpringMvcHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	 

}
