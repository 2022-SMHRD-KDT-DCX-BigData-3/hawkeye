package kr.smhrd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.Photo;
import kr.smhrd.mapper.PhotoMapper;

@Service
public class PhotoService {
	
	@Autowired
	public PhotoMapper photoMapper;
	
	// 사용자가 업로드한 사진 데이터
	public List<Photo> getPhoto(Criteria cri){
		List<Photo> photo = photoMapper.getPhoto(cri);
		return photo;
	}
	
	// 크롤링 한 사진 데이터
	public List<Crawling> crawling() {
		List<Crawling> crawling = photoMapper.crawling();
		return crawling;
	}
	
	// 페이징
	public int countBoard() {
		return photoMapper.countBoard();
	}
	

}
