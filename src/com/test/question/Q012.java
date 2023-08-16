package com.test.question;

import java.util.Scanner;

public class Q012 {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		int n = 0;
		
		System.out.print("숫자: ");
		n = scan.nextInt();
		
		
		result = getNumber(n);
		System.out.printf("입력하신 숫자는 '%d'는(은) '%s'입니다.\n" , n , result);
		
	}
	
	public static String getNumber(int n) {
		
		String result = "";
		
		return result = (n % 2 == 0) ? "짝수" : "홀수";
		
		
	}
	
	
}
