package kr.smhrd.entity;

import lombok.Data;

@Data
public class Criteria {
	
	private int page; // 페이지 수
	private int perPageNum; // 페이지 안에 있는 게시글 수
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 4;
	}
	
	public int getPageStart() {
		return (this.page-1)*perPageNum;
	}

}
