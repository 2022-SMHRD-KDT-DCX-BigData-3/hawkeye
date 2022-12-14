package kr.smhrd.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Jointable {
	
	private Crawling crawling;
	private Photo photo;

}
