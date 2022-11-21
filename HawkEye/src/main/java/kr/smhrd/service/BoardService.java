package kr.smhrd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.smhrd.entity.Board;
import kr.smhrd.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository BoardRepository;
	
	public List<Board> getList(){
		List<Board> list = BoardRepository.findAll();
		return list;
	}
	
	public void boardInsert(Board vo) {
		BoardRepository.save(vo);
	}
	
}
