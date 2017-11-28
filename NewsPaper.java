package org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NewsPaper {
	@Id
	@GeneratedValue
	private int newsId;
	private String newspaperName;
	private String fromDate;
	private String toDate;
	private int newspaperSize;
	private int pageNo;
	public String getNewspaperName() {
		return newspaperName;
	}
	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
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
	public int getNewspaperSize() {
		return newspaperSize;
	}
	public void setNewspaperSize(int newspaperSize) {
		this.newspaperSize = newspaperSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}	
	
}
