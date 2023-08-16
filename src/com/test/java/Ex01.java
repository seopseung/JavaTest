

// 단일 라인 주석. 엔터까지 주석 영역(한줄)

/*
 * 다중 라인 주석(여러줄 가능)
 * 주석이 길어지면 구분을 못하니까 (*)이 붙는다.
 * 지저분하면 떼서 쓰도록 해라.
 */

//단축키 사용
// - 단일 라인 : Ctrl + /
// - 다중 라인 : Ctrl + Shift + / , 풀때는 Ctrl + Shift + \


// 패키지 선언
// - 현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;


// 클래스, Class
// - 코드의 집합
// - public class Ex01 : 클래스 선언부(Header)
// - {} : 클래스의 몸통(Body), 구현부

// "Ex01이라는 클래스입니다."

public class Ex01 {
	
	// 메소드 , Method
	// - 코드의 집합
	public static void main(String[] args) {
		
		// 명령어 > 문장 단위 구성
		// 자바의 문장 종결자 : ';'
		
		// - System : 클래스
		// - . : 멤버 접근 연산자(Member Access Operator) 부모.자식
		// - out : 필드 (Field)
		// - println() : 메소드 호출
		// - "안녕하세요." : 문자열 리터럴
		System.out.println("안녕하세요.");
		
		/*
		
		특수문자(영문 표현)
		- ~,!,#,$,%,^(caret,xor),&,*,-,_,+,=
		- ;,:,',",?,/,\, `(역따옴표, back quote, back tick)
		- |(pipe, vertical bar, or)
		- (),{},[],<>(화살표 괄호)
		
		폰트 > 프로그래밍 폰트 추천(나눔고딕코딩, D2 Coding)
		- 1, l, I, ㅣ, i
			
		
		이클립스 > 코드 자동 완성 > Ctrl + Space
		- 현재 상태에서 사용 가능한 문법만 보여준다.(****)
		
		*/
		
		// Ctrl + Alt + 방향키 (문장 복사)
		// Alt + 방향키 (문장 통째로 움직이기)
		// Shift + 방향키
		// Shift + Ctrl + 방향키
		// Ctrl + D (해당 줄 삭제)
		// Ctrl + Shift + L (단축키)
		// Ctrl + Tab (탭 전환)
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	
	
	}
