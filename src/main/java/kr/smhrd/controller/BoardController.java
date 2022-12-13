package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.smhrd.entity.Member;

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
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/uplode")
	public String uplode(Member member, HttpSession session, HttpServletResponse response) throws IOException, InterruptedException {
		member = (Member) session.getAttribute("vo");
		if (member != null) {
			return "uplode";
		}else {
	            response.setContentType("text/html; charset=UTF-8");
	            PrintWriter out = response.getWriter();
	            out.println("<script>alert('로그인 후 이용해주세요.');</script>");
	           
	            out.flush(); 
	            

	        
		return "login";
	}
	}
	

	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	
	@GetMapping("/progress")
	public String progress() {
		return "progress";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
}