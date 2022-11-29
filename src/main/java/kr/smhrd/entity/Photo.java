package kr.smhrd.entity;

import java.util.Date;

import javax.persistence.Entity;
import lombok.Data;

@Data
public class Photo {
	
	private int cr_seq;
	private String cr_file;
	private String cr_url;
	private Date cr_date;
	private String admin_id;
	private int cr_count;
	
}

