package kr.smhrd.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import kr.smhrd.entity.Photo;

@Mapper
public interface PhotoMapper {
	
	public List<Photo> getPhoto();
	
	public void insert(Photo photo);

}
