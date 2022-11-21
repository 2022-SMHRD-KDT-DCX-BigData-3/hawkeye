package kr.smhrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Board;
import kr.smhrd.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService BoardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Board> list = BoardService.getList();
		model.addAttribute("list", list);
		return "list";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	public String register(Board vo) {
		BoardService.boardInsert(vo);
		return "redirect:/list";
	}
	
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
	
	@PostMapping("/uplode")
	public String uplode(Board vo) {
		BoardService.boardInsert(vo);
		return "redirect:/uplode";
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

