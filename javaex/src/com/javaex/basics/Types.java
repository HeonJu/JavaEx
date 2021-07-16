package com.javaex.basics;

// 변수예제,
// 데이터 타입 예제
public class Types {
	public static void main(String[] args) {
	//	varEx();
		integerEx();

    }
	//정수형 데이터 타입
	private static void integerEx() {
		//byte(1) < short(2) < int(4) < long(8)
		int intVar1, intVar2; // 선언	
		
		intVar1 = 2021; // 초기화
		//intvar2 = 1234567890123; // out of range : 저장 범위 초과
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		
		longVar1 = 2021;
		longVar2 = 1234567890123L; // L or l
		
		System.out.println(longVar1);
		System.out.println(longVar2);
	//2진수, 8진수, 16진수
		
	int bin, oct, hex;
	
	
	bin = 0b1101; // 2진수는 앞에 0b를 붙인다
	oct = 072;    // 8진수는 앞에 0
	hex = 0xFF;   // 16진수는 앞에 0xFF
	
	System.out.println(bin);
	System.out.println(oct);
	System.out.println(hex);

	}
	
	//변수의 선언과 사용
	private static void varEx() {
	/* 변수의 식별자 규칙
	 * 1. 문자, 숫자, $, _ 사용할수 있다
	 * 2. 숫자로 시작할 수 없다
	 * 3. 예약어는 사용할 수 없다
	 * 4. 변수, 메서드의 명명규칙 : camelCase
	 */
		
	//	int age;    // 선언
	//	age = 50;   // 초기화
	int age = 50;   // 선언 + 초기화
	
	// 자바는 정적 타입 언어
	//다른 타입의 데이터를 담을 수 없다
	//age = 3.14; -> error
	
	// 조회:
	System.out.println("나이는 " + age);
	
	// 한번에 여러 변수를 선언할 때
	int v1 = 10, v2 = 20, v3 = 30;
	
	// 여러 변수에 동일한 값을 할당 
	v1 = v2 = v3 = 40;
	}
}