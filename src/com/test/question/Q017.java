package com.test.question;

public class Q017 {
	
	public static void main(String[] args) {
		
		
		//요구사항] 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		
		
		position("홍길동");
		position("홍길동" , "유재석");
		position("홍길동" , "유재석" , "박명수");
		position("홍길동" , "유재석" , "박명수" , "정형돈");
		
	}

	private static void position(String result1 , String result2 , String result3 , String result4) {
		
		String position = "" + "" + "" + "";
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s\n" , result1 , result2 , result3 , result4);
		
		
	}

	private static void position(String result1 , String result2 , String result3) {
		
		String position = "" + "" + "";
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n\n" , result1 , result2 , result3);
		
	}

	private static void position(String result1 , String result2) {
		
		String position = "" + "";
		System.out.printf("사원: %s\n대리: %s\n\n" , result1 , result2);
		
		
	}

	private static void position(String result1) {

		String position = "";
		System.out.printf("사원: %s\n\n" , result1);
		
	}

}
