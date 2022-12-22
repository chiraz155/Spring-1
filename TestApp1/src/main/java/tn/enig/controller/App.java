package tn.enig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class App {

	
	
	@GetMapping("/home")
	public String fn1(Model m) {
		return "page1";
	}
}
