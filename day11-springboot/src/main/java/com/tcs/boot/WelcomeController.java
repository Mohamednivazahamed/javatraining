package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/home")
	public String invite(Model map) {
		map.addAttribute("location","Chennai1");
		return "registrationform";
	}

}
