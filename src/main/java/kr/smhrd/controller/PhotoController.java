package kr.smhrd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import kr.smhrd.entity.Photo;
import kr.smhrd.service.PhotoService;

@Controller
public class PhotoController {
	
	@Autowired
	private PhotoService photoService;
	
	public String photo(Model model) {
		
		List<Photo> photo = photoService.getPhoto();
		model.addAttribute("photo", photo);
		return "/result";
	}
	

}
