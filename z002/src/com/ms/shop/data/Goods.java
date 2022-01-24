package com.ms.shop.data;

public class Goods {
	
	public String name;
	public String price;
	public String YearOfRelease;
	
	public Goods(String n, String p, String k) {
		
		this.name = n;
		this.price = p;
		this.YearOfRelease = k;
	}
	 
	public void print() {
		System.out.println("상품 이름: " + name + " 상품 가격: " + price + " 상품 출시일: " + YearOfRelease);
	}
	
}
