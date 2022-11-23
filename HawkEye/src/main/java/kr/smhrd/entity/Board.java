package kr.smhrd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

// ORM 기술 (객체를 테이블과 매핑 시키는 기술)
@Entity // 이걸 붙여야 테이블로 만들어진다.
@Data
public class Board {
	
	// jpa 에서는 int 보다 더 큰 Long 을 쓰자
	@Id // PK로 만들기
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가 컬럼
	private Long idx; 
	private String title;
	private String writer;
	private String content;
	
	@Column(columnDefinition = "datetime default now()")
	private Date indate; 
	@Column(columnDefinition = "int default 0")
	private Long count;
	
}
