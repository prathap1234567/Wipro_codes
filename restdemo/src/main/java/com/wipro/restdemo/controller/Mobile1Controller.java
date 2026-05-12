package com.wipro.restdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.restdemo.entity.Mobile;
import com.wipro.restdemo.service.MobileService;

@Controller
@RequestMapping("/mobiles")
public class Mobile1Controller {

	
	@Autowired
	MobileService mobileService;
	@GetMapping
	String ShowAddForm(Model m) {
		m.addAttribute("mobile",new Mobile());
		return "add-mobile";
	}

	@PostMapping
	String saveMobile(@ModelAttribute Mobile m) {

	    mobileService.save(m);

	    return "redirect:/mobiles";
	}
	
}
