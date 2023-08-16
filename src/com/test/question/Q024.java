package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	
	public static void main(String[] args) {
		
		//요구사항] 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
		//			고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은
		//			시간에 받을 수 있는지 알려주시오.
		
		int hour = 0;
		int min = 0;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("음식을 받기 원하는 시각\n");
		
		System.out.printf("시: ");
		hour = scan.nextInt();
		
		System.out.printf("분: ");
		min = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		
		now.set(Calendar.HOUR_OF_DAY , hour);
		now.set(Calendar.MINUTE , min);
		
		now.add(Calendar.MINUTE , -10);
		System.out.printf("짜장면: %2d시 %d분\n" , now.get(Calendar.HOUR_OF_DAY) , now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE , -8);
		System.out.printf("치킨: %2d시 %d분\n" , now.get(Calendar.HOUR_OF_DAY) , now.get(Calendar.MINUTE));
		
		now.add(Calendar.MINUTE , -7);
		System.out.printf("피자: %2d시 %d분" , now.get(Calendar.HOUR_OF_DAY) , now.get(Calendar.MINUTE));
		
		
		
		
		
		
		
	}
}
