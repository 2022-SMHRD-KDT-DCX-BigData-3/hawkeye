package kr.smhrd.entity;

<<<<<<< HEAD
import java.util.Date;

import javax.persistence.Entity;
import lombok.Data;

@Data
public class Photo {
	
	private int up_seq;
	private String up_file;
	private Date up_date;
	private String mem_id;
=======
import javax.persistence.Entity;
import lombok.Data;

@Data
public class Photo {
	
	private String dir;
	private String url;
>>>>>>> branch 'master' of https://github.com/2022-SMHRD-KDT-DCX-BigData-3/hawkeye.git

}
