package kr.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.smhrd.entity.Board;

@Controller
public class BoardController {
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}

	@GetMapping("/info")
	public String info() {
		return "info";
	}
	
	@GetMapping("/uplode")
	public String uplode() {
		return "uplode";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	
	
}

