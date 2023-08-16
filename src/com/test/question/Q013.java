package com.test.question;

import java.util.Scanner;

public class Q013 {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		
		System.out.print("영어: ");
		eng = scan.nextInt();
		
		System.out.print("수학: ");
		math = scan.nextInt();
		
		result = test(kor , eng , math);
		System.out.printf("%s입니다.\n" , result);
	
	}
	
	public static String test(int kor , int eng , int math) {
		
		String result = "";
		
		result = ((kor + eng + math) / 3.0 >= 60) ? "합격" : "불합격";

		result = (kor < 40 ||  eng < 40 || math < 40 ) ? "불합격" : result;
		
		return result;
		
	}
}
