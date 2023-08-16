package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	public static void main(String[] args) {

		// Ex30_for.java
		//다중 반복문을 잘하려면 단일 반복문이 능숙해야함

		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		//q039();
		//q041();
		//q042();
		//q048();
		
		

	}//main
	
	private static void m5() {
		
		//별찍기(5x5)
		
		int n = 1;
		
		
		for (int i=0; i<5; i++) { //행만들기
			for (int j=0; j<5; j++) { //열만들기
				
				System.out.print("*");
				//System.out.printf("%3d", n);
				//n++;
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i=0; i<5; i++) { 
			for (int j=i; j<5; j++) { 
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for (int i=0; i<5; i++) { 
			for (int j=0; j<=i; j++) { 
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

	private static void q048() {
		
		//최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		//숫자 입력: 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		//int num = 123456789;
		int sum = 0;
		int oddSum = 0, evenSum = 0;
		
		for (;;) {
			
			//System.out.println(num % 10);	
			
			if (num % 10 % 2 == 0) {
				
				evenSum += num % 10;
				
			} else {
				
				oddSum += num % 10;
			}
			
			sum += num % 10;
			num = num / 10;				
			
			if (num == 0) { //모든 숫자를 다 나눠서 자리값이 없으면 0으로 표기됨 그때까지 루프 돌리기
				break;
			}
			
		}
		
		System.out.println(sum); //입력한 숫자의 합
		System.out.println(oddSum); //입력한 숫자의 홀수 합
		System.out.println(evenSum); //입력한 숫자의 짝수 합
		
	}

	private static void q042() {
		
		//서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오
		
		int year = 2023;
		int month = 7;
		int date = 25;
		
		int sum = 0; //누적 변수(총 며칠째)
		String day = ""; //요일 
		
		//1. 1년 1월 1일 ~ 2022년 12월 31일까지 며칠이 지났는지 구하기
		for (int i=1; i<year; i++) {
			
			sum += 365;
			
			//1-1. i가 윤년인지 확인 
			if (isLeafYear(i)) {
				sum++; //i가 윤년이면 366일로 
			}
			
		}
		
		//2. 2023년 1월 1일 ~ 2023 6월 30일까지 며칠이 지났는지 구하기
		for (int i=1; i<month; i++) {
			
			sum += getMaxDate(year, i);
					
		}
		
		//3. 2023년 7월 1일 ~ 2023년 7월 25일
		sum += date;
		
		
		//4. 검증 및 요일 구하기
		day = getday(sum);
		
		System.out.printf("2023년 7월 25일은 %,d일째 되는 날이고 %s요일입니다."
							, sum, day);
		
	}
	
	private static String getday(int sum) {
		
		if (sum % 7 == 1) {
			return "월";
		} else if (sum % 7 == 2) {
			return "화";
		} else if (sum % 7 == 3) {
			return "수";
		} else if (sum % 7 == 4) {
			return "목";
		} else if (sum % 7 == 5) {
			return "금";
		} else if (sum % 7 == 6) {
			return "토";
		} else if (sum % 7 == 0) {
			return "일";
		} 
			
		return null;
		
	}

	private static int getMaxDate(int year, int month) {

		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28;
				
		}
		
		return 0; //영향 없지만 지우면 안됨
	}

	/*
	메소드 이름 패턴
		1. setXXX 값을 전달하는 메소드
		2. getXXX 값을 가져오는 메소드
		3. isXXX  값을 boolean값으로 가져오는 메소드
	*/
	
	private static boolean isLeafYear(int year) {
		
		//윤년인지 겁사하는 메소드
		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					
					return true;
					
				} else {
					
					return false;

				}
				
			} else {

				return true;
			}

		} else {
			
			return false;
		}
		
	}

	private static void q041() {

		int sum = 0;
		
		for (int i=1; ; i++) {
			
			sum += i;
			
			System.out.printf("%d + ", i);
			
			if (sum > 1000) {
				break;
			}
			
		}
		System.out.println("\b\b= " + sum);
		
	}

	private static void q039() {
		
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		
		Scanner scan = new Scanner(System.in);
		
		int begin = 0, end = 0;
		int sum = 0; //누적 변수
		
		System.out.print("시작 숫자: ");
		begin = scan.nextInt();
		
		System.out.print("시작 숫자: ");
		end = scan.nextInt();
		
		for (int i=begin; i<=end; i++) {
			
			sum += i;
			
			//System.out.printf("%d + ", i );
			
			if(i != end) {
				System.out.printf("%d + ", i);
			} else {
				System.out.print(i);
			}
			
		}
		
		//System.out.println("\b\b= " + sum); //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + = 55
		System.out.println(" = " + sum); //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		
	}

	private static void m4() {
		
		//루프 - 분기문 개입(break, continue)
		for (int i=0; i<10; i++) {
			
			for (int j=0; j<10; j++) {
				
					//if (i==5) {
					//if (j==5) {
					//if(i == 5 && j ==5) {
					if(i == 5 || j ==5) {
						break; //자신이 포함된 제어문을 탈출한다.(j 루프 탈출)
					}
				
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
			
		}
		
	}//m4

	private static void m3() {

		//쌍용 교육센터
		//- 강의실(1 ~ 6강의실)
		//- 학생들(30명)
		
		for (int i=1; i<=6; i++) { //강의실
			
			for (int j=1; j<=30; j++) { //학생
				
				System.out.printf("%d강의실 %d번 학생\n", i, j);
				
			}
			
		}
		
		
	}

	private static void m2() {
	
		//구구단 (2단~9단)
		
		for (int j=2; j<=9; j++) {
			
			System.out.println("============");
			System.out.printf("     %d단\n", j);
			System.out.println("============");
			
			for (int i=1; i<9; i++) {
				
				System.out.printf("%d x %d = %2d\n",
								j, i, j * i);
			}
			System.out.println();
			
		}
		
	}//m2

	//괄호스타일 - K&R : Eclipse/Intellij 기본스타일
	public static void test() {
		
	}
	
	//괄호스타일 - Allman : 타언어에서 사용 선언부랑 실행부를 완전히 분리
	public static void test2()
	{
		
	}

	private static void m1() {

		// 모든 제어문끼리는 중첩이 가능하다.
		// 루프 변수 i표기

		// 중첩된 반복문
		
		// 2중 for문
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				// System.out.println("실행문"); //10회 실행

				System.out.printf("i: %d, j: %d\n", i, j);

			}

		}
		
		//3중 for문
		for (int i=0; i<24; i++) { //대회전(시침)

			for (int j=0; j<60; j++) { //중회전(분침)

				for (int k=0; k<60; k++) { //소회전(초침)

					//System.out.println("실행문"); //10 x 10 x 10
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);

				}

			}

		}
		

	}//m1
	

}//class
