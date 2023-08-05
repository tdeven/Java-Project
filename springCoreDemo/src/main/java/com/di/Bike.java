package com.di;

public class Bike {

	private String color;
	private String company;
	private int cc;
	private int price;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Bike [color=" + color + ", company=" + company + ", cc=" + cc + ", price=" + price + "]";
	}
	
	
	
	
}
