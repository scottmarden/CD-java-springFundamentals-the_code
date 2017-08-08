package com.scottmarden.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeCtrl {
	
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		System.out.println(errors);
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String password(@RequestParam(value="attempt") String attempt) {
		if(attempt.equalsIgnoreCase("bushido")) {
			return "success.jsp";
		}else {
			System.out.println("errors");
			return "redirect:/errors";
		}	
	}
	
	@RequestMapping("/errors")
	public String setErrors(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("errors", "You must train harder!");
		return "redirect:/";
	}
}
