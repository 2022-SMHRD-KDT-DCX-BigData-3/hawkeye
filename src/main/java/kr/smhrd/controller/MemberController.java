package kr.smhrd.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.smhrd.domain.MemberRepository;
import kr.smhrd.entity.Member;

@Controller
public class MemberController {
	
	//private List<Member> members = new ArrayList<Member>();
	
	@Autowired
	private MemberRepository memberRepository;
	
	@PostMapping("/create")
	public String create(Member member) {
		System.out.println("userid :" + member); 
		memberRepository.save(member);
		return "main";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String login(String login_id, String login_pw, HttpSession session) {
		Member member = memberRepository.findByMemid(login_id);
		if (member == null) {
		return "redirect:login";
		}
		if (!login_pw.equals(member.getMempw())) {
			return "redirect:login";
		}
		
		System.out.println("Login Success!");
		session.setAttribute("vo", member);
		return "redirect:/main";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("vo");
	return"redirect:/main";
	}

}
 