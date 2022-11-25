package kr.smhrd.entity;

import java.util.Date;

import javax.persistence.Entity;
import lombok.Data;

@Data
public class Photo {
	
	private int up_seq;
	private String up_file;
	private Date up_date;
	private String mem_id;

}
