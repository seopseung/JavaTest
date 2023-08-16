package com.test.question;

import java.util.Scanner;

public class Q001 {
	
	public static void main(String[] args) {
		
		
		//요구 사항] 태어난 년도를 입력 받아 나이를 출력 하시오.
		//			 > 조건 : 우리나라 나이로 출력하시오
		
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		int age = 0;
				
		System.out.printf("태어난 년도: ");
		year = scan.nextInt();
		
		age = 2023 - year + 1;
		
		System.out.printf("나이: %d세\n", age);
		
		
		
		
		
		
		
		
		
		
	}

}
