package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {
	
	
	public static void main(String[] args) {
		
		
		// 대중적인 오버라이드
		
		Time t1 = new Time(2 , 30);
		
		
		
		System.out.println(t1); // com.test.java.obj.inheritance.Time@5aaa6d82
		System.out.println(t1.toString()); // 2:30 -> 전 세계 개발자가 아는 이름(toString())
		System.out.println(t1.info()); 	   // 2:30 -> 나밖에 모르는 이름(info())
		
		
		
		Date now = new Date();
		
		System.out.println(now); // Wed Aug 02 12:08:53 KST 2023
		System.out.println(now.toString());
		
		
		
		
		
	}//main

}//class


class Time {
	
	private int hour;
	private int minute;
	
	
	public Time(int hour, int minute) {
		
		this.hour = hour;
		this.minute = minute;
	}
	
	// 덤프..
	public String info() {
		return this.hour + ":" + this.minute;
	}
	
	
	@Override // 어노테이션(Annotation) : 프로그램 기능이 있는 주석(가독성) , 코드 자동 완성 시 붙어서 냅둬도됨
	public String toString() {
		
		return this.hour + ":" + this.minute;
		
	}
	
	
	
}
