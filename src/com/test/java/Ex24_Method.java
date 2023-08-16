package com.test.java;

public class Ex24_Method {
	
	public static void main(String[] args) {
		
		
			//Swap
			//- 2개의 공간의 값을 서로 교환하는 작업
		
			int a = 10;
			int b = 20;
			
			test(a, b); //Ctrl + 1 > 메소드 자동생성
			
			
			
			String s1 = "홍길동";
			String s2 = "아무개";
			
			test(s1, s2);
			
			
		
			
			
	}

	private static void test(int a, int b) {
		
		System.out.printf("a: %d , b: %d\n" , a , b);
		
		int temp; //빈 컵
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %d , b: %d\n" , a , b);
		
	}
		
		
		private static void test(String a, String b) {
			
			System.out.printf("a: %s , b: %s\n" , a , b);
			
			String temp; //빈 컵
			
			temp = a;
			a = b;
			b = temp;
			
			System.out.printf("a: %s , b: %s\n" , a , b);
		
		
	}
		
		


	
	
	
}
