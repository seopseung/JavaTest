package com.test.java;

import java.util.Scanner;

public class Ex29_for {
	
	public static void main(String[] args) {
		
		
		//Ex29_for
		//제어문 종류 :  조건문, 반복문
		
		/*
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
			- 생상선 향상 + 유지보수성 향상
			
			for문
			
			for(초기식; 조건식; 증감식) {
				문장;
			}
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		m15();
		
	}//main
	
	private static void m15() {
		
		//난수(임의의 수-Random) 만들기  
		
		//1. Math 클래스 : 대중화 방법(다른 언어도 씀)
		//2. Random 클래스 : 자바 방법
		
		System.out.println(3.14);
		System.out.println(Math.PI); //수학과 관련된 정보
		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		//Math.random = 0.0 ~ 0.9999999999999999 사이 값
		
		for (int i=0; i<10; i++) {
			
			//System.out.println(Math.random());
			
			//0~9 사이의 난수
			//0.0 > 0
			//0.1 > 1
			//0.15 > 1
			//0.2XX > 2
			//0.3XX > 3
			//0.9XX > 9
			//System.out.println((int)(Math.random() * 10)); //자리수 올라감(가공)
			
			//1~10 사이의 난수
			//System.out.println((int)(Math.random() * 10) + 1);
			
			//4~7 사이의 난수를 구하려면 0~3 사이의 난수
			//System.out.println(Math.random() * 4);	//0~3 사이의 난수 - 0.4를 넘지 않는 숫자가 나옴 
			System.out.println((int)(Math.random() * 4) + 4);	//0~3 사이의 난수 + 4
		}
		
	}

	public static void m14() {
		
		//빈 리턴문 : 값을 반환하는 목적이 아닌 메소드를 중단하는 역할만 한다.
		return;
	}
	
	public static int m13() {
		//모든 경우의 수는 반드시 return문이 존재
		int num = 10; 
		
		if (num % 2 == 0) {
			return 10;
		} else {
			return 0;
		}
		
	}
	
	public static int m12() {
		return 10;
	}

	private static void m11() {
		
		//요구사항] 사용자에게 숫자 입력 받아서 입력받은 숫자 누적(입력 횟수를 모름)
		//추가사항] 홀수만 입력, 짝수를 입력하면 프로그램 중단
		
		int sum = 0; //누적변수
		int num = 0; //사용자 입력 값
		
		Scanner scan = new Scanner(System.in);
		
		//회전수를 예측하기 힘들 때 무한루프 사용
		for (;;) {
			
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) { //짝수 입력
				break;
				//return; 자신이 속한 메소드를 빠져나감 
			}
			
			sum += num;
	
		}
		
		System.out.println(sum);
		
	}

	private static void m10() {

		//학교 담임 선생님이 학생 상담(1번 ~ 30번)
		
		for (int i=1; i<=30; i++) {
			
//			if (i == 16) {
//				break; //중간에 멈추고 싶을 때 표현
//			}
			
			if (i == 10 || i == 15) {
				continue; //결석한 10, 15번 학생빼고 상담할 때 표현
			}
			
			System.out.printf("%d번 학생 상담중...\n", i);
		}
		
	}

	private static void m9() {

		//break, continue : 독립적으로 사용불가, 다른 제어문과 함께 사용
		//break : 자신이 속한 제어문을 탈출(if문 예외, 인식 불가), 루프가 몇 바퀴 남든간에 바로 탈출
		//continue : 실행하면 제어문의 시작으로 이동(처음으로 돌아가세요.)
		
		for (int i=1; i<=10; i++) {
			
			if(i == 5) {
				//break;	//5까지만 실행, 강제적으로 중단 시킬 경우
				continue;	//5만 없음, i가 5일때 출력 못하고 i++로 가서 6이 됨
			}
			System.out.println(i);
		}
	
	}

	private static void m8() {
		//무한 루프, Infinite Loop
		//1. 사용자 실수 > 수정필요
		//2. 사용자 의도 > 어떻게??
		
		//무한 루프에 가깝지만 무한루프는 아님(21억 바퀴)
//		for (int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		int num = Integer.MIN_VALUE;
		System.out.println(num);
		
		num--;
		System.out.println(num);
		
		
		//무한 루프
//		for (int i=0; true; i++) {
//			System.out.println(i);
//		}
		
		//초기식, 조건식, 증감 생략 가능
		for (;;) {
			System.out.println("반복문");
		}
		
	}

	private static void m7() {
		
		/*
		요구사항] 구구단 출력
		 5 x 1 = 5
		 5 x 2 = 10
		 ...
		 5 x 9 = 45
		 */
		
		for(int i=1; i<=9; i++) {
			System.out.printf("5 x %d = %2d\n", i, 5 * i);
		}
		
		//요구사항] 사용자가 원하는 단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("\n단: ");
		int dan = scan.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
		}
		
	}

	private static void m6() {

		//요구사항] 사용자로부터 숫자 10개를 입력받아 누적?
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //누적변수는 꼭 for문 밖에서 생성
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");	//10번 다 안쓰고 for문으로 묶기
			int num = scan.nextInt(); 	//10번 다 안받고 for문으로 묶기
			sum += num; //사용자 입력 숫자를 누적
		}
		System.out.println(sum);
	}

	private static void m5() {
		
		//요구사항] 1 ~ 사용자가 원하는 숫자까지의 합?
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		int sum = 0; //누적변수
		
		//몇 바퀴를 돌지 런타임에 결정됨 
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d\n", num, sum);
	}

	private static void m4() {
		
		//요구사항] 1~10까지의 합(누적 요구)
		
		//누적 시 누적 변수 생성(반드시 초기화)
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			
			sum += i; //sum = sum + i;
			
			//1 = 0 + 1
			//3 = (0 + 1) + 2
			//6 = (0 + 1 + 2) + 3
			//10 = (0 + 1 + 2 + 3) + 4
			//...
			//45 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) + 9
			//55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
			
		}
		System.out.println(sum);
		
	}

	private static void m3() {
	
		//반복문 > 루프 변수?
		//2. 루프 변수의 역할은 회전수뿐만이 아닌 값 자체에 영향을 미침
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println(1); //일일히 치기
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		int num = 1;			//변수 생성 후 증감해서 복붙
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		System.out.println();
		
		num = 1;
		for (int i=0; i<10; i++) {
			System.out.println(num + ":" + i);
			num++;
		}
		System.out.println();
		
		//num을 i로 변환, 유지보수 할 때도 이 방법이 제일 편함!
		for (int i=1; i<=10; i++) { //루프 변수가 회전수와 값 역할을 모두함
			System.out.println(i);
		}
		System.out.println();
	
		//홀수 값 찍기(패턴)
		for (int i=1; i<=10; i+=2) { 
			System.out.println(i);
		}
		System.out.println();
		
		//짝수 값 찍기(패턴)
		for (int i=2; i<=10; i+=2) { 
			System.out.println(i);
		}
		System.out.println();
		
	}

	private static void m2() {
		
		//반복문 > 회전수 ?
		//1. 반복문의 실행 횟수를 내가 제어할 수 있는지?
		
		for (int i=1; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		//초기식, 조건식 변화
		for (int i=5; i<=9; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		//증감식 변화
		for (int i=1; i<=5; i=i+2) {
			System.out.println("실행문");
		}
		System.out.println();
		
		//증감식 변화(감소코드)
		for (int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();
	}

	private static void m1() {
		
		//요구사항] "안녕하세요" x 5회 출력
		
		//Case 1. 가장 비효율적인 방법이지만 급할때 사용 - 유지보수 힘듬
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		//Case 2. 메소드 생성 후 반복호출 - 메소드를 분리시킴으로써 식별 용이하고 유지보수 편함
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case 3.
		// for문 실행 순서
		//1. 메모리에 int i = 1 변수 선언 및 초기화
		//2. i<=5 선언한 값이 5보다 작음 -> 참
		//3. 블럭(문장) 실행 - System.out.println("안녕하세요.");
		//4. }를 만나면 다시 시작위치로 돌아가서 i++(2) 실행
		//5. i<=5
		//6. 블럭(문장) 실행 - System.out.println("안녕하세요.");
		//7. i++(3) 실행
		//8. i<=5
		//9. 계속 반복 후 i++(6)이 되기 전까지 실행하다가 }로 빠져나감
		
		//초기식: 루프 변수(i)를 초기화하는 역할
		//조건식: 루프를 지속할지 결정하는 조건
		//증감식: 루프 변수에 변화를 주는 역할 - 언젠가 루프 탈출을 해야해서(false)
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요."); //for문으로 인해서 자동 5회 반복 
		}
		
	}//m1

	public static void hello() {
		System.out.println("안녕하세요.");
	}//hello
}
