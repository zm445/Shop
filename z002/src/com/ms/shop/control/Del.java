package com.ms.shop.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.ms.shop.data.Goods;

public class Del {
	
	Scanner scan = new Scanner(System.in);
	
	public int D(ArrayList<Goods> goods) {
		
		System.out.print("삭제할 상품 이름 입력: ");
		String n = scan.next();
		
		int idx = 0;
		for(int i=0; i<goods.size(); i++) {
			if(goods.get(i).name.equals(n)) {
				idx = i;
			}
		}
		
		return idx;
	}
	
}
