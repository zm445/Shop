package com.ms.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.ms.shop.control.Add;
import com.ms.shop.control.Change;
import com.ms.shop.control.Del;
import com.ms.shop.data.Goods;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		ArrayList<Goods> goods = new ArrayList<Goods>(); 
		
		goods.add(new Goods("아이폰13","190","2021"));
		goods.add(new Goods("갤럭시s21","99","2021"));
		goods.add(new Goods("아이폰11","99","2019"));
		goods.add(new Goods("갤럭시Z플립3","125","2021"));
		
		
		boolean run = true;
		while(run) {
			
			System.out.print("[1]상품정보 [2]상품추가 [3]상품삭제 [4]상품수정 [e]종료: ");
			String choice = scan.next();
			
			switch (choice) {
			case "1":
				for(Goods s : goods) {
					s.print();
				}
				break;
			case "2":
				goods.add(new Add().add());
				break;
			case "3":
				goods.remove(new Del().D(goods));
				break;
			case "4":
				new Change().c(goods);
				break;
			case "e":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		scan.close();
		
		
		
	}
}
