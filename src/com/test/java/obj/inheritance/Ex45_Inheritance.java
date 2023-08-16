package com.test.java.obj.inheritance;

import com.test.java.obj.cast.Child;
import com.test.java.obj.cast.Parent;

public class Ex45_Inheritance {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 	상속 ,  Inheritance
		 	- 부모가 가지는 재산을 자식에게 물려주는 행동
		 	- 부모 클래스가 가지는 재산(변수 , 메소드)을 자식 클래스에게 물려주는 행동
		 	- 자식 클래스가 코드를 구현하지 않아도 , 부모 클래스로부터 구현된 멤버를 물려 받는 행동
		 	
		 	왜 이걸 함?
		 	- 비용 절감
		 	- 코드 재사용(*************************)
		 	
		 	상속 관계에 있는 클래스 호칭
		 	- 부모 클래스 <-> 자식 클래스
		 	- 슈퍼 클래스 <-> 서브 클래스
		 	- 기본 클래스 <-> 확장 클래스
		 	- 기본 클래스 <-> 파생 클래스
		 
		 
		 
		 
		 */
		
		Parent p = new Parent();
		
		p.a = 10;
		p.b = 20;
		
		
		
		Child c = new Child();
		
		c.a = 10; // 부모 클래스가 물려준 멤버
		c.b = 20;
		c.aaa();
		
		c.c  = 30;
		c.d = 40;
		c.ccc();
		
		
		
	}//main

}//class


// 부모 클래스
class Parent {
	
	public int a;
	public int b;
	
	public void aaa() {
		System.out.println("aaa");
	}
	
}


// 자식 클래스 -> 부모 클래스에 속한 모든 것(변수 , 메소드) 다 상속 받음 (copy느낌)
class Child extends Parent{
	
	public int c;
	public int d;
	
	public void ccc() {
		System.out.println("ccc");
	}
}




// 부모 클래스
class Member{
	
	public String name;
	public String id;
	public String pw;
	
}

// 일반 회원
class User extends Member{
	
	public String email;
	
}

// 관리자 회원
class Administrator extends Member{
	
	public String lv;
	
}
	


class AAA{
	
	public int a = 10;
	
}


class BBB extends AAA{
	
	public int b = 20;
	
}


class CCC extends BBB{
	
	public int c = 30;
	
}


class DDD extends CCC{
	
	public int d = 40;
	
}
	

	








