package com.ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Beauty {
	@Id@GeneratedValue
	private int btyId;
	private String btyName;
	private String btyText;
	private double btyPrice;
	private String btyImgSrc;
	public Beauty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beauty(int btyId, String btyName, String btyText, double btyPrice, String btyImgSrc) {
		super();
		this.btyId = btyId;
		this.btyName = btyName;
		this.btyText = btyText;
		this.btyPrice = btyPrice;
		this.btyImgSrc = btyImgSrc;
	}
	public int getBtyId() {
		return btyId;
	}
	public void setBtyId(int btyId) {
		this.btyId = btyId;
	}
	public String getBtyName() {
		return btyName;
	}
	public void setBtyName(String btyName) {
		this.btyName = btyName;
	}
	public String getBtyText() {
		return btyText;
	}
	public void setBtyText(String btyText) {
		this.btyText = btyText;
	}
	public double getBtyPrice() {
		return btyPrice;
	}
	public void setBtyPrice(double btyPrice) {
		this.btyPrice = btyPrice;
	}
	public String getBtyImgSrc() {
		return btyImgSrc;
	}
	public void setBtyImgSrc(String btyImgSrc) {
		this.btyImgSrc = btyImgSrc;
	}
	@Override
	public String toString() {
		return "Beauty [btyId=" + btyId + ", btyName=" + btyName + ", btyText=" + btyText + ", btyPrice=" + btyPrice
				+ ", btyImgSrc=" + btyImgSrc + "]";
	}
	
}
