package kr.smhrd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import kr.smhrd.entity.Photo;
import kr.smhrd.mapper.PhotoMapper;

@Service
public class PhotoService {
	
	@Autowired
	private PhotoMapper photoMapper;
	
	public List<Photo> getPhoto(){
		List<Photo> photo = photoMapper.getPhoto();
		return photo;
	}
	

}
