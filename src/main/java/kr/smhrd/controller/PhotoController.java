package kr.smhrd.controller;

import java.util.List;
import javax.persistence.JoinTable;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.BootstrapMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.PageMaker;
import kr.smhrd.entity.Photo;
import kr.smhrd.service.PhotoService;

@Controller
public class PhotoController {
	
	@Autowired
	private PhotoService photoService;
		
	@RequestMapping("/crawling")
	public String joinTable(Criteria cri, Model model) {
		
		List<JoinTable> joinTable = photoService.joinTable(cri);
		
		model.addAttribute("joinTable", joinTable);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(photoService.countBoard());
		model.addAttribute("pageMaker", pageMaker);
		return "crawling";
	}
	

}