package com.javaex.oop.goods.v1;

public class GoddsApp {

	public static void main(String[] args) {

		Goods notebook = new Goods();
		//필드에 접근
		notebook.setName("LG GRAM");
		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods();
		smartphone.setName("I phone 12");
		smartphone.setPrice(80000);

		
		System.out.printf("%s,%d원%n",
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s,%d원%n" ,
				smartphone.getName(),
				smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
	}

}
