package net.kanish.assetArtworks.model;



import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image1 {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Lob
	    private Blob image;
	    private Date date = new Date();
	    private String title;
	    private String about;
	    
	    
	    
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
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Blob getImage() {
			return image;
		}
		public void setImage(Blob image) {
			this.image = image;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
	    
	     

}
