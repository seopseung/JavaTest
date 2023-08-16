package com.test.java;

public class Ex15_Operator {
	
	public static void main(String[] args) {
		
	
		/*
		 
		 연산자, Operator
		 - 수학 연산자 > 대부분이 프로그래밍 연산자로 넘어옴
		 - 피연산자를 대상으로 미리 정해진 행동(연산)을 한 후에 행동(연산)의
		 결과를 반환하는 요소
		 - 주로 기호를 많이 사용 + 단어도 많이 사용
		 
		 1. 문장, Statement
		 2. 표현식 , Expression
		 3. 연산자, Operator
		 4. 피연산자, Orerand
		 5. 연산자 우선 순위
		 6. 연산자 연산 방향
		 
		 
		 
		 문장, Statement
		 - 1개 이상의 표현식이 모여서 문장을 만든다.
		 - int sum = 10 + 20;
		 
		 표현식 , Expression
		 - 문장을 구성하는 최소 단위 > 하나의 완성된 문장을 만들 수 있는 최소 표현
		 - int sum;
		 - 10 + 20
		 - sum = 30
		 
		 연산자, Operator
		 - +
		 - =
		 
		 피연산자, Orerand
		 - + : 10, 20
		 - = : sum, 30
		 
		 연산자 우선 순위
		 - 하나의 문장에 속해있는 연산자들 중 누가 먼저 실행하는지에 대한 규칙
		 - 1 + 2 * 3
		
		 연산자 연산 방향
		 - 하나의 문장에 속해있는 연산자들 중 우선 순위가 동일 하면 
		 누구부터 실행 해야 하는지에 대한 규칙
		 - 1 + 2 + 3
		 - 왼쪽에서 부터 오른쪽
		 
		 
		 
		 
		 연산자 종류
		 
		 1. 행동(목적)
		 	a. 산술 연산자
		 	b. 비교 연산자
		 	c. 논리 연산자
		 	d. 대입 연산자
		 	e. 증감 연산자
		 	f. 조건 연산자
		 	g. 비트 연산자
		 
		 2. 용법(피연산자 개수)
		 	a. 1항 연산자
		 	b. 2항 연산자
		 	c. 3항 연산자
		 
		 
		 
		 산술 연산자
		 - + , - , * , /, %(mod, 나머지)
		 - 2항 연산자
		 - 피연산자를 숫자형으로 가진다.(정수, 실수)
		 
		 
		 
		 */
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b); 
		System.out.printf("%d - %d = %d\n", a, b, a - b); 
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b); //10 / 3 = 3(몫)
		System.out.printf("%d %% %d = %d\n", a, b, a % b);//10 % 3 = 1(나머지)
		System.out.println();
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%f / %f = %f\n", c, d, c / d);
		System.out.println();
		System.out.println(10 / 3); 	//정수 / 정수 = 정수 3
		System.out.println(10.0 / 3.0); //실수 / 실수 = 실수 3.333333333333333
		System.out.println(10.0 / 3); 	//실수 / 정수 = 실수 3.333333333333333
		System.out.println(10 / 3.0); 	//정수 / 실수 = 실수 3.333333333333333
		System.out.println();
		
		//System.out.println(100 / 0);
		System.out.println(-100 / 0.0);
		
		
		//*** 모든 산술 연산자의 결과 자료형은 
		//	  두 피연산자의 자료형 중 더 크기가 큰 자료형으로 나타난다.
		
		System.out.println(10 / 3); // int / int = int
		System.out.println(10.0 / 3); // double / int = double
		System.out.println(10 / 3.0); // int / double = double
		System.out.println(10.0 / 3.0); // double / double = double
		
		
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e +  f); //30억 > -1,294,967,296
		System.out.println((long)e +  f); // 3,000,000,000
		
		
		e = 300000;
		f = 500000;
		
		System.out.println(e * f); // -323,855,360
		System.out.println(e * (long)f); // 150,000,000,000
		
		
		e = -2100000000;
		f = 100000000;
		
		System.out.println(e - f); // 2,094,967,296
		
		
		
		
		
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
		//예외 상황 > byte, short 연산 결과는 무조건 int이다 > CPU 처리 단위
		//byte + byte = byte (X) ,int (O)
		//short + short = short(X) , int(O)
		
		//Type mismatch: cannot convert from int to byte
		//명시적 형변환을 해야함
		b3 = (byte)(b1 + b2);
		
		//*** 위와 같은 이유 > 정수 사용 > byte, short를 거의 사용 안함
		//	  정수 > 주로 int 사용
		
		
		
		System.out.println();
		System.out.println(10 % 3);
		System.out.println(10 % 4);
		System.out.println(10 % 5);
		System.out.println(10 % 10);
		System.out.println(10 % 11);
		
		//나머지 연산자
		//- 패턴
		
		System.out.println(10 % 2);
		System.out.println(11 % 2);
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
