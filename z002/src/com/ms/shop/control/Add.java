package com.ms.shop.control;

import java.util.Scanner;

import com.ms.shop.data.Goods;

public class Add {
	
	
	public static Goods add() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[추가]상품 이름 입력: ");
		String n = scan.next();
		
		System.out.print("[추가]상품 가격 입력: ");
		String p = scan.next();
		
		System.out.print("[추가]상품 출시일 입력: ");
		String y = scan.next();
		
		return new Goods(n,p,y);
	}
	
	
}
