package com.tcs.mvcjsp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
	@GetMapping("/get")
	public String login(Model map) {
		ArrayList<String> products= new ArrayList<>();
		products.add("Televison");
		products.add("Laptop");
		products.add("SmartPhone");
		products.add("smartwatch");
		
		map.addAttribute("catelog",products);
		return "success";
	}
}
