package net.kanish.assetArtworks.web.dto;

import java.util.Date;

public class OrderDto {

	
	private Date date = new Date();
	private long imageId;
	private String type;
	private String title;
	private String about;
	private String phno;
	private String address;
	private String status;
	private String price;
	//email for find the details about the user 
	private String userEmail;
	
	
	public OrderDto() {
		super();
	}



	public OrderDto(Date date, long imageId, String type, String title, String about, String phno, String address,
			String status, String price, String userEmail) {
		super();
		this.date = date;
		this.imageId = imageId;
		this.type = type;
		this.title = title;
		this.about = about;
		this.phno = phno;
		this.address = address;
		this.status = status;
		this.price = price;
		this.userEmail = userEmail;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getImageId() {
		return imageId;
	}
	public void setImageId(long imageId) {
		this.imageId = imageId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
}
