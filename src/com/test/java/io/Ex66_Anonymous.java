package com.test.java.io;

public class Ex66_Anonymous {
	
	public static void main(String[] args) {
		
		/*
		 
		 익명 객체 , Anonymous Object
		 - 익명 클래스 , Anonymous Class
		 - 이름 없는 클래스
		
		 
		 
		 */
		
		// 요구사항] 인터페이스를 구현한 클래스 선언 하고 객체를 생성하라
		
		// 1. 본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		// 2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		// 3.
//		AAA b3 = new AAA(); // Cannot instantiate the type AAA
//		b3.aaa();
		
		// The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		AAA b3 = new AAA() {

			@Override
			public void aaa() {
				System.out.println("aaa");
				
			}
			
		};
		
		
		b3.aaa();
		
		// b2 vs b3
		// b2
		// - AAA 인터페이스 선언
		// - BBB 클래스 상속 받아서 구현
		
		// b3
		// - AAA 인터페이스 선언
		// - 실명 클래스 구현 X -> 익명 클래스 구현함
		
		// 익명 클래스 구현 하는 이유 -> 클래스의 재사용성 때문
		// 익명 클래스 -> 클래스를 재사용 할 의사가 없음
		// 실명 클래스 -> 재사용 할 의사가 있음
		
		// 클래스 사용 목적 -> 객체 생성
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		// 익명 클래스는 붕어빵을 만드는 틀이긴 한데 붕어빵을 딱 1개만 만들기 위한 틀임
		AAA t4 = new AAA() {

			@Override
			public void aaa() {
				
				
			}
			
		};
		
		
		
		AAA t5 = new AAA() {

			@Override
			public void aaa() {
				
				
			}
			
		};
		
		
		
	}

}

class Test{
	
	public int a;
	public int b;
	public void ccc() {
		
	}
}

interface AAA {
	
	void aaa();
	
}

// The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA{

	@Override
	public void aaa() {
		System.out.println("aaa");
		
	}
	
	
	
	
}