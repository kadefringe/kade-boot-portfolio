package com.kade.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kade.portfolio.service.PostService;

@Controller
public class ViewController {
	@Autowired
	private PostService service;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("posts", service.readAll());
		return "index";
	}
}
