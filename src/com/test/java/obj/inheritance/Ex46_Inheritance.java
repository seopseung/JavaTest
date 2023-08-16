package com.test.java.obj.inheritance;

public class Ex46_Inheritance {

	
	public static void main(String[] args) {
		
		
		/*
		 
		 	Object 클래스
		 	- JDK에서 제공 되는 클래스
		 	- 모든 클래스의 근원 -> Root Class , 루트 클래스
		 	- 9개의 메소드 -> 모든 클래스들에게 공통으로 필요하다 생각하는 기능 구현
		 	- Class Object is the root of the class hierarchy.
		 	  Every class has Object as a superclass. 
		 	  All objects,including arrays, implement the methods of this class.
		 	
		 
		 
		 */
		
		Object o1 = new Object();
		
		
		
		TestChild c = new TestChild();
		
		// 어떤 멤버?
		// - a , b
		// - c , d
		c.a = 10;
		c.b = 20;
		c.c = 30;
		c.d = 40;
		
		
		
		
		
		
	}
	
}

// 개발자가 만드는 모든 클래스는 명시적으로 상속을 구현하지 않으면 자동으로 Object 클래스의 자식이 된다.

class TestParent { // extends Object { -> 자동생성됨
	
	public int a;
	public int b;
	
}

class TestChild extends TestParent{
	
	public int c;
	public int d;
	
}