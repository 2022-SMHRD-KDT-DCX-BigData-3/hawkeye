package kr.smhrd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Photo;
import kr.smhrd.service.PhotoService;

@Controller
public class PhotoController {
	
	@Autowired
	private PhotoService photoService;
	
	// 사용자가 업로드한 사진 데이터
	@RequestMapping("/result")
	public String photo(Model model) {
		
		List<Photo> photo = photoService.getPhoto();
		model.addAttribute("photo", photo);
		return "result";
	}

	
	// 크롤링 한 사진 데이터
	@RequestMapping("/crawling")
	public String crawling(Model model) {
		
		List<Crawling> crawling = photoService.crawling();
		model.addAttribute("crawling", crawling);
		return "crawling";
	}
	

}
