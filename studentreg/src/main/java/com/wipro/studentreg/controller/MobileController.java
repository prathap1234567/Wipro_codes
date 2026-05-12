package com.wipro.studentreg.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.studentreg.entity.Mobile;
import com.wipro.studentreg.service.MobileService;


@Controller
@RequestMapping("/mobiles")
public class MobileController {

	
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

	    return "redirect:/mobiles/list";
	}
	@GetMapping("/list")
	String showList(Model m)
	{
		
		List<Mobile> list= mobileService.findAll();
		
		m.addAttribute("mobileList", list);
		
		return "mobilelist";
		
	}
	@GetMapping("/delete/{id}")
	String deleteMobile(@PathVariable int id)
	{
	    mobileService.deleteById(id);

	    return "redirect:/mobiles/list";
	}



	@GetMapping("/edit/{id}")
	String editMobile(@PathVariable int id, Model m)
	{

	    Optional<Mobile> opt = mobileService.findById(id);

	    Mobile m1 = null;

	    if(opt.isPresent())
	    {
	        m1 = opt.get();

	        m.addAttribute("mobile", m1);
	    }

	    return "edit-mobile";
	}



	@PostMapping("/update")
	String updateMobile(@ModelAttribute Mobile m)
	{

	    mobileService.update(m);

	    return "redirect:/mobiles/list";
	}

	
}
