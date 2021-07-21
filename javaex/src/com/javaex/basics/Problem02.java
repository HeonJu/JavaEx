package com.javaex.basics;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		  
		Scanner scanner = new Scanner(System.in);
	    System.out.println("숫자를 입력하세요");
	    int num = scanner.nextInt();
	    
	 // 입력값 num 
	    
	    
	    for (int i = 1; i <= num; ++i) {
	      // 첫 번째 줄넘김 예외처리
	    	 if (i != 1)
	        System.out.println();

	      // 가로 줄 출력    
	      for (int j = 0; j < i; ++j) {
	        System.out.print(i);
	      }
	    } 
	
		scanner.close();
		}
		
}
	
