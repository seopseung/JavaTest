package com.test.question;

import java.util.Scanner;

public class Q011 {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		int n1 = 0;
		int n2 = 0;
		
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		
		result = add(n1 , n2);
		System.out.println(result);
		
		result = subtract(n1 , n2);
		System.out.println(result);
		
		result = multiply(n1 , n2);
		System.out.println(result);
		
		result = divide(n1 , n2);
		System.out.println(result);
		
		result = mod(n1 , n2);
		System.out.println(result);
		
	}
	
	public static String add(int n1 , int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 + n2;
		
		txt = n1 + "+" + n2 + "=" + result;
		
		return txt;
		
	}
	
	
	public static String subtract(int n1 , int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 - n2;
		
		txt = n1 + "-" + n2 + "=" + result;
		
		return txt;
		
	}
	
	public static String multiply(int n1 , int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 * n2;
		
		txt = n1 + "*" + n2 + "=" + result;
		
		return txt;
		
	}
	
	public static String divide(int n1 , int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 / n2;
		
		txt = n1 + "/" + n2 + "=" + result;
		
		return txt;
		
	}
	
	public static String mod(int n1 , int n2) {
		
		String txt = "";
		int result = 0;
		
		result = n1 % n2;
		
		txt = n1 + "%" + n2 + "=" + result;
		
		return txt;
		
	}
}


