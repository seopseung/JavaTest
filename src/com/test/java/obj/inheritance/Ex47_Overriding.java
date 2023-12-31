package com.test.java.obj.inheritance;

public class Ex47_Overriding {

	
	
	public static void main(String[] args) {
		
		
		/*
		 
		 	메소드 오버로딩 , Method Overloading
		 	- 메소드 이름 동일한데 여러개 생성 -> 인자 리스트에 변화를 줘서
		 	
		 	
		 	메소드 오버라이딩 , Method Overriding
		 	- 클래스 상속 시에 발생
		 	- 메소드 재정의 -> 상속받은 메소드를 수정하는(덮어쓰는) 기술
		 
		 
		 
		 */
		
		
		OverridingParent hong = new OverridingParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		
		OverridingChild jhong = new OverridingChild();
		
		jhong.name = "홍철수";
		//hong.hi(); 			// 동일한 목적을 가졌는데 메소드 이름을 다르게 하면 개발자가 힘들다.
		jhong.hello(); 
		
		
		
		
	}//main
	
}//class



class OverridingParent{
	
	public String name;
	public void hello(){
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s 입니다.\n" , this.name);
	}
	
}


class OverridingChild extends OverridingParent{
	
	// 시간이 흘러 .. -> 홍철수 중학교 2학년
	// 아빠가 하는 인사 방식이 불만 -> 자신만의 방식으로 인사하고 싶다!!
	// 부모 클래스가 물려준 hello()를 사용하기 싫다!!
	// *** 클래스의 상속은 부모가 물려준 멤버를 자신이 거부할 방법이 없다!! (100%)
	
//	public void hi() {
//		System.out.printf("하이~ 난 %s야~\n" , this.name);
//	}
	
	// 동일한 hello()를 2개 가지고 있다.(부모에서 하나 자식에서 하나) -> 에러 발생 X
	// -> 둘이 붙으면 자식이 이긴다. -> 자식의 hello()가 호출
	
	// 메소드 재정의(오버라이드)
	@Override
	public void hello() {
		
		System.out.printf("하이~ 난 %s야~\n" , this.name);
		
	}
	
}




