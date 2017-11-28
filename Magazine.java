package org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.type.DateType;


@Entity
public class Magazine {
	@Id
	@GeneratedValue
	private int magId;
	private String magName;
	private String fromDate;
	private String toDate;
	private int magSize;
	private int pageNo;
	public String getMagName() {
		return magName;
	}
	public void setMagName(String magName) {
		this.magName = magName;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public int getMagSize() {
		return magSize;
	}
	public void setMagSize(int magSize) {
		this.magSize = magSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	
	

}
