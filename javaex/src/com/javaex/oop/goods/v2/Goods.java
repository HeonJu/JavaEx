package com.javaex.oop.goods.v2;

// v2. 접근 제한자
//getter/setter를 통한 내부 필드의 우회 접근
public class Goods {
//필드선언
	
	
	
		public String name;
		public int price;

		//getter / setter
		public String getName() {
			return name;
			
			
		}
	public void setName(String name) {
		this.name = name;
		
	}
		
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:" + price);
	}
	}


