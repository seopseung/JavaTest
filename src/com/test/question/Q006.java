package com.test.question;

import java.util.Scanner;

public class Q006 {

	
	
	public static void main(String[] args) {
		
		
		
		//요구사항] 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		//조	건> 세금 : 수입의 3.3%
		
		Scanner scan = new Scanner(System.in);
		
		int income = 0;
		double tax = 0;
		double tax2 = 0;
		
		System.out.print("한달 수입 금액(원): ");
		income = scan.nextInt();
		
		
		tax2 = income * 0.033;
		tax = income - tax2;
		System.out.printf("세후 금액(원): %,.0f원\r세금(원): %,.0f원" , tax, tax2);
		
		
		
		
		
		
		
		
	}
}
