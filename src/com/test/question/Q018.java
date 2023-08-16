package com.test.question;

public class Q018 {
	
	
	public static void main(String[] args) {
		
		//요구사항] 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		// ** 3항 연산자로 양수를 구분하는 조건을 만들어야할듯
		
		
		int count;
		
		count = positive(10);
		System.out.printf("양수: %d개\n" , count);
		
		count = positive(10 , 20);
		System.out.printf("양수: %d개\n" , count);

		count = positive(10 , 20 , -30);
		System.out.printf("양수: %d개\n" , count);

		count = positive(10 , 20 , -30 , 40);
		System.out.printf("양수: %d개\n" , count);
		
		count = positive(10 , 20 , -30 , 40 , 50);
		System.out.printf("양수: %d개\n" , count);
	}
	
	private static int positive(int num1, int num2 , int num3 , int num4, int num5) {

		int count = 0;
		
		count += (num1 > 0)? 1 : 0;
		count += (num2 > 0)? 1 : 0;
		count += (num3 > 0)? 1 : 0;
		count += (num4 > 0)? 1 : 0;
		count += (num5 > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int num1, int num2 , int num3 , int num4) {
		
		int count = 0;
		
		count += (num1 > 0)? 1 : 0;
		count += (num2 > 0)? 1 : 0;
		count += (num3 > 0)? 1 : 0;
		count += (num4 > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int num1, int num2 , int num3) {

		int count = 0;
		
		count += (num1 > 0)? 1 : 0;
		count += (num2 > 0)? 1 : 0;
		count += (num3 > 0)? 1 : 0;
		
		return count;
	}

	private static int positive(int num1, int num2) {
		
		int count = 0;
		
		count += (num1 > 0)? 1 : 0;
		count += (num2 > 0)? 1 : 0;
		
		return count;
		
	}

	private static int positive(int num1) {
		
		int count = (num1 > 0)? 1 : 0;
		
		return count;
		
	
	
	}

}
