package com.ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Fruits {
	@Id@GeneratedValue
	private int FrtId;
	private String frtName;
	private String frtText;
	private double frtPrice;
	private String frtImgSrc;
	public Fruits(int frtId, String frtName, String frtText, double frtPrice, String frtImgSrc) {
		super();
		FrtId = frtId;
		this.frtName = frtName;
		this.frtText = frtText;
		this.frtPrice = frtPrice;
		this.frtImgSrc = frtImgSrc;
	}
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFrtId() {
		return FrtId;
	}
	public void setFrtId(int frtId) {
		FrtId = frtId;
	}
	public String getFrtName() {
		return frtName;
	}
	public void setFrtName(String frtName) {
		this.frtName = frtName;
	}
	public String getFrtText() {
		return frtText;
	}
	public void setFrtText(String frtText) {
		this.frtText = frtText;
	}
	public double getFrtPrice() {
		return frtPrice;
	}
	public void setFrtPrice(double frtPrice) {
		this.frtPrice = frtPrice;
	}
	public String getFrtImgSrc() {
		return frtImgSrc;
	}
	public void setFrtImgSrc(String frtImgSrc) {
		this.frtImgSrc = frtImgSrc;
	}
	@Override
	public String toString() {
		return "Fruits [FrtId=" + FrtId + ", frtName=" + frtName + ", frtText=" + frtText + ", frtPrice=" + frtPrice
				+ ", frtImgSrc=" + frtImgSrc + "]";
	}
	
}
