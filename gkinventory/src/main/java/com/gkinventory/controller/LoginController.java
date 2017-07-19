package com.gkinventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(method=RequestMethod.GET)
	public String loadLoginpage(ModelMap model){
		model.addAttribute("message","Login Page Test");
		return "login";
	}
}
