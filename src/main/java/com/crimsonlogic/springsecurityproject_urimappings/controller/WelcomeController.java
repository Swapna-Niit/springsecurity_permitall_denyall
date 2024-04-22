package com.crimsonlogic.springsecurityproject_urimappings.controller;


import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
    @GetMapping("/")
    public String greeting(Authentication authentication) {
    	
    	String userName = authentication.getName();
    	
        return "Spring Security In-memory Authentication Example - Welcome " + userName;
    }
    
	@RequestMapping("/home")
	public String showHomePage () {
		return "displaying the home page contents";
	}
	
	@RequestMapping("/protected")
	public String protectedPage () {
		return "displying the protected page contents";
	}

}