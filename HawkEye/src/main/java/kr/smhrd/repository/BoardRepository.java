package kr.smhrd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.smhrd.entity.Board;

@Repository // 생략해도 됨
public interface BoardRepository extends JpaRepository<Board, Long> {// <테이블 이름, PK의 타입>
	
	// ex) public Board findByNameAndEmail(String name);
}
