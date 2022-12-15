package kr.smhrd.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public class Photo {
	
	private int deep_seq;
	private int up_seq;
	private Date deep_date;
	private String deep_photo1;
	private String deep_photo2;
	private String deep_photo3;
	private String deep_photo4;
	private String deep_photo5;
	private String deep_photo6;
	private String deep_photo7;
	private String deep_photo8;
	private String deep_photo9;
	private String deep_photo10;
	private String deep_url1;
	private String deep_url2;
	private String deep_url3;
	private String deep_url4;
	private String deep_url5;
	private String deep_url6;
	private String deep_url7;
	private String deep_url8;
	private String deep_url9;
	private String deep_url10;
	
	
	@Column(columnDefinition = "date default sysdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mem_joindate=new Date();   
	
}

