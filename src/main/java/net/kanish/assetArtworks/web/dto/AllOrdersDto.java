package net.kanish.assetArtworks.web.dto;

import java.util.Date;


// for the admin to view the order details;
public class AllOrdersDto {
	
	private long id;
	private Date date = new Date();
	private long imageId;
	private String type;
	private String title;
	private String about;
	private String phno;
	private String address;
	private String status;
	private String price;
	
	//user details
	private long userId;
	private String name;
    private String email;


	public AllOrdersDto(long id, Date date, long imageId, String type, String title, String about, String phno,
			String address, String status, String price, long userId, String name, String email) {
		super();
		this.id = id;
		this.date = date;
		this.imageId = imageId;
		this.type = type;
		this.title = title;
		this.about = about;
		this.phno = phno;
		this.address = address;
		this.status = status;
		this.price = price;
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	

	public AllOrdersDto() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "AllOrdersDto [id=" + id + ", date=" + date + ", imageId=" + imageId + ", type=" + type + ", title="
				+ title + ", about=" + about + ", phno=" + phno + ", address=" + address + ", status=" + status
				+ ", price=" + price + ", userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
