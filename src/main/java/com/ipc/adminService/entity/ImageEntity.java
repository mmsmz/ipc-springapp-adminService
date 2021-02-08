package com.ipc.adminService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "imagelocation")
public class ImageEntity {
	
	
	
	public ImageEntity() {
		super();
	}
	public ImageEntity(String imgpathid, String imagedirectory, String imagetype) {
		this.imgpathid = imgpathid;
		this.imagedirectory = imagedirectory;
		this.imagetype = imagetype;
	}
	@Id
	@Column(name = "imgpathid")
	 @GenericGenerator(name = "imgpathid", strategy = "com.ipc.adminService.util.generateid.ImageDetailsIdGenerator")
    @GeneratedValue(generator = "imgpathid")
	private String imgpathid;
	
	@Column(name = "imagetype")
	private String imagetype;
	@Column(name = "imagedirectory")
	private String imagedirectory;
	
	
	public String getImgpathid() {
		return imgpathid;
	}
	public void setImgpathid(String imgpathid) {
		this.imgpathid = imgpathid;
	}

	public String getImagedirectory() {
		return imagedirectory;
	}
	public void setImagedirectory(String imagedirectory) {
		this.imagedirectory = imagedirectory;
	}

	public String getImagetype() {
		return imagetype;
	}
	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}
}
