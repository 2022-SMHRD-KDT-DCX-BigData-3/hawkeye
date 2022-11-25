package kr.smhrd.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import kr.smhrd.entity.Crawling;
import kr.smhrd.entity.Photo;

@Repository
@Mapper
public interface PhotoMapper {
	// 사용자가 업로드한 사진 데이터
	public List<Photo> getPhoto();
	// 크롤링 한 사진 데이터
	public List<Crawling> crawling();
	
=======
import kr.smhrd.entity.Photo;

@Mapper
public interface PhotoMapper {
	
	public List<Photo> getPhoto();
	
	public void insert(Photo photo);
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-DCX-BigData-3/hawkeye.git

}
