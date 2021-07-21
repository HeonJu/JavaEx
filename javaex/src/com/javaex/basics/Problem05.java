package com.javaex.basics;

public class Problem05 {

	public static void main(String[] args) {
		
		
		problem04_meth();

	}


	public static void problem04_meth() {



for(int i=0; i<10; i++) {

	int sum = 0;
    sum = sum + i;

   for(int j=1; j<11; j++) {

		System.out.print(j  + sum + "\t");


	}


	System.out.println("");


}

	}

}
