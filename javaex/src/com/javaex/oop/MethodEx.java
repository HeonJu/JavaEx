package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
	

		 //printMessage(); 
		 //printMessage("Hello, Method");
		 //printDivide(10,0);
		 //System.out.println(divide(10, 3));	
		System.out.println("getSum:" + getSum(new double[] {}));
	
		System.out.println("getSumVar:" + getSumVar(1, 2, 3, 4, 5));
		printSum("고정 + 가변", 1, 2, 3, 4, 5);
	}
	
	// 고정 인수가 앞에,  가변인수 뒤에
	private static void printSum(String message, double ...values) {
		System.out.println(message + ":" +getSumVar(values));
		
	}
	
	// 매개 변수의 갯수를 모른다
	// 방법2. 가변 인수 : 변수이름 앞에 ...
	private static double getSumVar(double ...values) {
		//가변인수는 배열로 변혼되어 들어온다.
		
		
	//	double total = 0;
		
		//for(double value: values) {
		//	total += value;
			
		//}
		return getSum(values);
	}
	
	
	// 매개 변수의 갯수를 모른다
	// 방법1. 인수를 배열로 전달
	private static double getSum(double[] values) {
		double total = 0;
		
		for(double value: values) {
			total += value;
		}
		return total;
		
	}
	
	// 입력 0, 출력x
	private static double divide(double num1, double num2) {
		return num1 / num2;	
	}
	
	
	
	// 입력 0, 출력x
	private static void printDivide(int num1, int num2) {
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없어요!");
			return; //돌아가세요!
		}
	}
	
	
	// 입력 0, 출력X
	private static void printMessage(String message) {
		System.out.println(message);
	}
	
	
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}
}



