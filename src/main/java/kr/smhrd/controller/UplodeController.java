package kr.smhrd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Uplode;
import kr.smhrd.service.UplodeService;

@Controller
public class UplodeController {
	@Autowired
	UplodeService uplodeService;
	
	@RequestMapping("/Uplode")
	public String Up(Uplode uplode) {
		uplodeService.Up(uplode);
		return "redirect:/progress";
		
	}
	
}
