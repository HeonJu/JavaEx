package com.javaex.basics;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	       System.out.println("숫자를 입력하세요");
	       int num = scanner.nextInt();
	      
	       for(int j = 1; j <= num; j++) {
	            for(int i = 0; i < j; i++) {
	               System.out.print(j);
	            }
	   if (j !=num)
	               System.out.println();
	         }
	            
	      
			scanner.close();
	}
}
		
		/*
		for(int i = 1; i <= 100; i++ ) {
			if(i % 5 == 0 && i % 7 == 0)
				
				System.out.println(i);
			
		}
	}
}
*/

  