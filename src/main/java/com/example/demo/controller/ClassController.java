package com.example.demo.controller;

import com.example.demo.components.UserLogin;
import org.springframework.security.core.Authentication;
import com.example.demo.repository.BasicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@Controller
public class ClassController {
	

	
	    

	    @GetMapping("/login")
	    public String login() {
	        
	        return "login";
	    }
	    
	    @GetMapping("/informacionBasica")
	    public String verInfoBasica(Model modelo) {
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        auth.getName();
	        System.out.println(auth.getName());

	        return "infoBasica";
}
}
