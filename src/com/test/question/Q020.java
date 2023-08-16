package com.test.question;

import java.util.Calendar;

public class Q020 {
	
	
	public static void main(String[] args) {
		
		
		Calendar hundredDays = Calendar.getInstance();
		
		hundredDays.add(Calendar.DATE, + 100);
		System.out.printf("백일: %tF\n" , hundredDays);
		
		
		hundredDays = Calendar.getInstance();
		hundredDays.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n" , hundredDays);
	}

}
