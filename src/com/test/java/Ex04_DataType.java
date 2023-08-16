package com.test.java;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Ex04_DataType {
	
	public static void main(String[] args) {
		
		
		//변수 생성 방법, 주의할 점
		
		byte kor;
		kor = 100;
		
		System.out.println(kor); // 출력
		
		//문장(Statement) > 1개 이상의 표현식
		//문장 종결자 > ;
		
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		byte math;
		math = 80;
		System.out.println(math);
		
		//Duplicate local variable kor
		// - 같은 이름의 변수명을 2개 이상 선언 불가
		// - 변수명은 유일해야 한다.
		
		//byte kor;
		//kor = 70;
		
		//System.out.println(kor);
		
		
		//***폴더 > 한글 사용 지양(X)
		
		
		//변수명을 만들 때 규칙(*****) > 모든 것의 식별자를 만들 때 규칙
		//1. 영문자 + 숫자 + '_' 만 사용 > 관습 + 물리적
		//2. 숫자로 시작 불가능 > 물리
		//3. 예약어(키워드) 사용 불가능
		//4. 의미있게(********************) > 풀네임(**********)
		//5. 대소문자 구분
		
		
		//변수(변하는 데이터) vs 상수(변하지 않는 데이터)
		// - 표현은 동일한데, 그 값이 변하는지? 안 변하는지?
		// - 프로그래밍의 상수 > 데이터(*****)
		
		byte score;
		score = 100;
		System.out.println(score); //100
		
		score = 90;
				
		System.out.println(score); //100 > 90
		
		score = 80;
		System.out.println(score); //100 > 80
		
		kor = 100;
		System.out.println(kor);
		
		
		//프로그래밍 발전 방향 > 코드 재사용
		
		
		//변수 생성하기
		byte b2;
		b2 = 100;
		
		//선언 + 초기화
		byte b3 = 100;
		
		byte b4;
		byte b5;
		
		byte b6, b7;
		
		//지도 좌표(x, y)
		
		byte x1, y2; //마트 x좌표, 마트 y좌표
		
		byte x3, //마트 x좌표
			 y3; //마트 y좌표
		
	
		
		//변수명 명명법 패턴
		
		//1. 헝가리언 표기법
		// - 식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법(ex.byte_weight 등)
		// - 자바에서 많이 사용 안함
		// - 가끔 사용 > 인터페이스명
		
		
		
		//2. 파스칼 표기법
		// - 식별자 단어의 첫 문자를 대문자 표기 + 나머지 문자는 소문자 표기
		// - 2개 이상 단어로 만든 합성어 > 모든 단어를 붙임 > 각 단어의 첫문자를 대문자로 표기
		// - 사용) 클래스명
		
		byte height;
		byte Height; // 파스칼 표기법
		
		byte englishscore; // 가독성 낮음
		byte EnglishScore; // 파스칼 표기법
		
		
		
		//3. 캐멀 표기법
		// - 식별자 단어의 첫 문자를 소문자 표기 + 나머지 문자는 소문자 표기
		// - 2개 이상 단어로 만든 합성어 > 모든 단어를 붙임 > 각 단어의 첫문자를 대문자로 표기
		// - 사용) 변수명 , 메소드명
		
		byte mathscore;
		byte MathScore; // 파스칼
		byte mathScore; // 캐멀
	
		
		
		//4. 스네이크 표기법
		// - 전부 소문자 표기
		// - 합성어 > 각 단어를 '_'로 연결
		
		byte english_score;
		
		
		
		//5. 케밥 표기법
		// - 전부 소문자 표기
		// - 합성어 > 각 단어를 '-'로 연결
		// - 자바에서는 사용 불가능 > minus 연산자로 인식함
		// - 사용) HTML, CSS
		
		byte english-score;
		
		
		
		
		
		
		
	}

}
