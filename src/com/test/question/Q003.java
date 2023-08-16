package com.test.question;

import java.util.Scanner;

public class Q003 {
	
	public static void main(String[] args) {
		
		
		//요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		//	조건 	> 사각형 넓이 = 너비 * 높이
		//			> 사각형 둘레 = 너비 * 2 + 높이 * 2
							
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		
		
		System.out.print("너비(cm): ");
		n1 = scan.nextInt();
		
		System.out.print("높이(cm): ");
		n2 = scan.nextInt();

		int result1 = n1 * n2;
		int result2 = n1 * 2 + n2 * 2;
		String squareArea = "넓이";
		String squareHeight = "높이";
		
		System.out.printf("사각형의 %s는 %d㎠입니다.\n" , squareArea , result1);
		System.out.printf("사각형의 %s는 %dcm입니다.\n" , squareHeight , result2);
		
	}

}
