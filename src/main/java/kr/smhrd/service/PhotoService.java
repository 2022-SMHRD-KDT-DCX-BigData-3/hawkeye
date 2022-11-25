package kr.smhrd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Photo;
import kr.smhrd.mapper.PhotoMapper;

@Service
public class PhotoService {
	
	@Autowired
	public PhotoMapper photoMapper;
	
	// 사용자가 업로드한 사진 데이터
	public List<Photo> getPhoto(){
		List<Photo> photo = photoMapper.getPhoto();
		return photo;
	}
	
	// 크롤링 한 사진 데이터
	public List<Crawling> crawling() {
		List<Crawling> crawling = photoMapper.crawling();
		return crawling;
		
=======
import kr.smhrd.entity.Photo;
import kr.smhrd.mapper.PhotoMapper;

@Service
public class PhotoService {
	
	@Autowired
	private PhotoMapper photoMapper;
	
	public List<Photo> getPhoto(){
		List<Photo> photo = photoMapper.getPhoto();
		return photo;
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-DCX-BigData-3/hawkeye.git
	}
	

}
