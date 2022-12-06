package kr.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Uplode;
import kr.smhrd.service.UplodeService;

@Controller
public class UplodeController {
	@Autowired
	UplodeService uplodeService;
	
	@RequestMapping("/Uplode")
	public String Up(Uplode uplode) {
		System.out.println("asdf");
		uplodeService.Up(uplode);
		return "redirect:/progress";
		
	}
	
}
