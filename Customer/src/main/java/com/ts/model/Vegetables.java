package com.ts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Vegetables {
	@Id@GeneratedValue
	private int vegId;
	private String vegName;
	private String vegText;
	private double vegPrice;
	private String vegImgSrc;
	public Vegetables() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vegetables(int vegId, String vegName, String vegText, double vegPrice, String vegImgSrc) {
		super();
		this.vegId = vegId;
		this.vegName = vegName;
		this.vegText = vegText;
		this.vegPrice = vegPrice;
		this.vegImgSrc = vegImgSrc;
	}
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public String getVegText() {
		return vegText;
	}
	public void setVegText(String vegText) {
		this.vegText = vegText;
	}
	public double getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(double vegPrice) {
		this.vegPrice = vegPrice;
	}
	public String getVegImgSrc() {
		return vegImgSrc;
	}
	public void setVegImgSrc(String vegImgSrc) {
		this.vegImgSrc = vegImgSrc;
	}
	@Override
	public String toString() {
		return "Vegetables [vegId=" + vegId + ", vegName=" + vegName + ", vegText=" + vegText + ", vegPrice=" + vegPrice
				+ ", vegImgSrc=" + vegImgSrc + "]";
	}
}
