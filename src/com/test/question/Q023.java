package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
		//요구사항] 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
		int dadBirthYear = 0;
		int dadBirthMonth = 0;
		int dadBirthDate = 0;
		
		int girlBirthYear = 0;
		int girlBirthMonth = 0;
		int girlBirthDate = 0;
		
		long dadTick = 0;
		long girlTick = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("아빠 생일(년): ");
		dadBirthYear = scan.nextInt();
		
		System.out.printf("아빠 생일(월): ");
		dadBirthMonth = scan.nextInt();
				
		System.out.printf("아빠 생일(일): ");
		dadBirthDate = scan.nextInt();
		
		
		System.out.printf("딸 생일(년): ");
		girlBirthYear = scan.nextInt();
		
		System.out.printf("딸 생일(월): ");
		girlBirthMonth = scan.nextInt();
		
		System.out.printf("딸 생일(일): ");
		girlBirthDate = scan.nextInt();
		
		
		
		Calendar dadBirth = Calendar.getInstance();
		dadBirth.set(dadBirthYear, dadBirthMonth - 1, dadBirthDate);

		Calendar girlBirth = Calendar.getInstance();
		girlBirth.set(girlBirthYear, girlBirthMonth - 1, girlBirthDate); 
		
		long dadBirthTick = dadBirth.getTimeInMillis();
		
		long girlBirthTick = girlBirth.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다." , (girlBirthTick - dadBirthTick) / 1000 / 60 / 60 / 24 );
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
