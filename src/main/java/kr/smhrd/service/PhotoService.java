package kr.smhrd.service;

import java.util.List;
import javax.persistence.JoinTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Criteria;
import kr.smhrd.entity.Photo;
import kr.smhrd.mapper.PhotoMapper;

@Service
public class PhotoService {
	
	@Autowired
	public PhotoMapper photoMapper;
	
	public List<JoinTable> joinTable(Criteria cri){
		List<JoinTable> jointable = photoMapper.joinTable(cri);
		return jointable;
	}
	
	public int countBoard() {
		return photoMapper.countBoard();
	}
	
	
}