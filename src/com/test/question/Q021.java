package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	
	
	public static void main(String[] args) {
		
		
		//요구사항] 태어난 년도를 입력하면 나이를 출력하시오.
		
		int age = 0;
		int year = 0;
		
		Calendar now = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도: ");
		year = scan.nextInt();
		
		age = now.get(Calendar.YEAR) - year + 1;
		
		System.out.printf("나이: %d세\n" , age);
	}
}
