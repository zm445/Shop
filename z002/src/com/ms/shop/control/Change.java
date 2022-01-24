package com.ms.shop.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.ms.shop.data.Goods;

public class Change {
	
	Scanner scan = new Scanner(System.in);
	
	public void c(ArrayList<Goods> goods) {
		
		boolean run = true;
		while(run) {
			System.out.print("수정할 상품 이름 입력: ");
			String name = scan.next();
			
			
			int check = -1;
			for(int i=0; i<goods.size(); i++) {
				if(goods.get(i).name.equals(name)) {
					check = 0;
					System.out.println("[수정]상품 이름 입력: ");
					goods.get(i).name = scan.next();
					
					System.out.println("[수정]상품 가격 입력: ");
					goods.get(i).price = scan.next();
					
					System.out.println("[수정]상품 출시일 입력: ");
					goods.get(i).YearOfRelease = scan.next();
				}
			}
			
			if(check == 0) {
				System.out.println("수정되었습니다.");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
	}
	
	
}
