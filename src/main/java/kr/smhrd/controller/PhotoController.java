package kr.smhrd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.PageMaker;
import kr.smhrd.entity.Photo;
import kr.smhrd.service.PhotoService;

@Controller
public class PhotoController {
	
	@Autowired
	private PhotoService photoService;
	
	// 사용자가 업로드한 사진 데이터
	@RequestMapping("/result")
	public String photo(Criteria cri, Model model) {
		
		List<Photo> photo = photoService.getPhoto(cri);
		model.addAttribute("photo", photo);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(photoService.countBoard());
		model.addAttribute("pageMaker", pageMaker);
		return "result";
	}

	
	// 크롤링 한 사진 데이터
	@RequestMapping("/crawling")
	public String crawling(Criteria cri, Model model) {
		
		List<Crawling> crawling = photoService.crawling();
		model.addAttribute("crawling", crawling);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(photoService.countBoard());
		model.addAttribute("pageMaker", pageMaker);
		return "crawling";
	}
	

}
