package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	
	public static void main(String[] args) {
		
		String manName = "";
		String womanName = "";
		int year = 0;
		int month = 0;
		int date = 0;
		
		Calendar anniversary = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("남자이름: ");
		manName = scan.nextLine();
		
		System.out.print("여자이름: ");
		womanName = scan.nextLine();
		
		System.out.print("만난날(년): ");
		year = scan.nextInt();
		
		System.out.print("만난날(월): ");
		month = scan.nextInt();		
		
		System.out.print("만난날(일): ");
		date = scan.nextInt();
		
		
		anniversary.set(year , month - 1, date);
		System.out.printf("'%s'과(와) '%s'의 기념일\n" , manName , womanName);
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n" , anniversary );
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n" , anniversary );
		
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n" , anniversary );
		
		anniversary.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n" , anniversary );
		
		anniversary.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n" , anniversary );
		
	}
}
