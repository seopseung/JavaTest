package com.test.java;

public class Ex34_String {
	
	
	public static void main(String[] args) {
		
		
		//m6(); Ctrl + 1 > Method 단축키
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
		
		
		
	}

	private static void m13() {
		
		//문자열 분리
		//- String[] split(String delimiter)
		//- 구분자를 기준으로 쪼개는 메소드
		
		
		String name = ",홍길동,아무개,,,,,,유재석,강호동,박명수,,,,"; // 끝에 있는건 무시함
		
		String[] temp = name.split(","); // 구분자는 사라진다.
		
		for (int i=0; i<temp.length; i++) {
			System.out.println(i + ":" + temp[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m12() {
		
		//문자열 치환(바꾸기)
		//- String replace(String old , String new)
		//- 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. 홍길동입니다. 홍길동입니다.";
		
		int index = txt.indexOf("홍길동");
		
		String temp1 = txt.substring(0 , index); //"안녕하세요. "
		String temp2 = txt.substring(index + 3); //"입니다. "
		
		System.out.println(temp1 + "아무개" + temp2);
		
		
		
		System.out.println(txt.replace("홍길동" , "아무개"));
		
		
		
		txt = "         하나          둘      셋               ";
		System.out.println(txt.trim());
		//*** replace로 무언가를 삭제하고 싶으면 찾아서 ""로 교체하면 된다.
		System.out.println(txt.replace("하나" , ""));
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m11() {
		
		
		//문자열 검색
		//- indexOf() , lastIndexOf()
		//- startsWith() , endsWith()
		
		//- boolean contains(String) > 범위가 두루뭉실
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));

		
	}

	private static void m10() {
		
		
		//문자열 추출
		//- String substing(int beginIndex , int endIndex)
		//- String substing(int beginIndex)
		//- beginIndex : 포함(inclusive)
		//- endIndex : 미포함(exclusive)
		
		//*** 자바에서는 범위를 나타낼 때 > 시작(포함) ~ 끝(미포함)
		//Math.random() > 0 ~ 1 사이 난수
		
		String txt ="가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3 , 7)); //라마바사 > 3의 위치에서 7의 위치(아) 앞(6의 위치)까지 문자열로 추출
		System.out.println(txt.charAt(5)); 		  // '바' > 문자 코드 값 변환 O
		System.out.println(txt.substring(5 , 6)); // "바" > 문자 코드 값 변환 X
		System.out.println(txt.substring(3)); 	  // 기준(3)부터 끝까지 추출함
		System.out.println();
		
		
		//주민등록번호
		String jumin = "970728-1012345";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7 , 8) .equals("1") ? "남자" : "여자"); // 문자열은 .equals를 써야함
		
		//몇년생?
		System.out.println(+ jumin.charAt(0) + jumin.charAt(1)); // 112(?) > '9(57)' + '7(55)' 문자끼리의 더하기는 숫자가 됨 ""빈문자열 더해서 만들수도 있음
		System.out.println(jumin.substring(0 , 2)); // 97
		
		//몇월생?
		System.out.println(jumin.substring(2 , 4));
		
		//몇일생?
		System.out.println(jumin.substring(4 , 6));
		System.out.println();
		
		
		
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//1. 파일명 추출 > "Ex34_String.java"
		int index = path.lastIndexOf("\\");		
		String fileName = path.substring(index + 1);
		System.out.println(fileName);
		
		
		//2. 확장자 없는 파일명 추출 > "Ex34_String"
		index = fileName.lastIndexOf(".");
		String fileNameWithoutExtension = fileName.substring(0 , index);
		System.out.println(fileNameWithoutExtension);
		
		
		//3. 확장자 추출 > ".java"
		String extension = fileName.substring(index);
		System.out.println(extension);
		
		
		
		
		
	}

	private static void m9() {
		
		//패턴 검색
		//- boolean startsWith(String)
		//- boolean endsWith(String)
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		System.out.println();
		
		String name = "홍길동";
		
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length() -1) == '동');
		System.out.println(name.indexOf('동') == name.length() -1);
		System.out.println();
		
		
		//파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		//해당 파일이 '자바 소스 파일' 입니까? > 확장자 검사
		if(path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}
		
		
		
		
		
		
	}

	private static void m8() {
		
		//대소문자 변경
		//- String toUpperCase()
		//- String toLowerCase()
		
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content); 				 // 오늘 수업은 Java입니다.
		System.out.println(content.toUpperCase());  // 오늘 수업은 JAVA입니다.
		System.out.println(content.toLowerCase());  //오늘 수업은 java입니다.
		
		
		//대소문자 구분(Case senstive)
		//- 정확도 높음
		//- 검색율 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 O");			
		} else {
			System.out.println("결과 X");
		}
		
		//대소문자 구분X (Case insensitive)
		//- 정확도 낮음
		//- 검색율 높음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 O");			
		} else {
			System.out.println("결과 X");
		}
		
	}

	private static void m7() {
		
		//주민등록번호 . '-' 기입
		String jumin = "970728-2012345";
		
		if(jumin.charAt(6) == '-') {
			System.out.println("0");
		} else {
			System.out.println("X");
		} 
		
		if (jumin.indexOf("-") == 6) {
			System.out.println("0");
			
		} else {
			System.out.println("X");
		}
		
		
		
		//게시판 글쓰기 > 관리자 > 금지어!!
		
		
		String word = "바보";
		String content = "안녕하세요. 반갑습니다~ 자바를 공부하고 있어요. 메롱";
		
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 진행~");
		}
		
		
		
		String[] words = { "바보" , "멍청이" , "메롱" , "ㅂㅏㅂㅗ" };
		
		for (int i=0; i<words.length; i++) {
			
			if(content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			}
		}
		
		
		
	}

	private static void m6() {
		
		
		//문자열 조작
		//1. int length()
		//2. char charAt(int)
		//3/ String trim()
	
	
		//문자열 검색
		//- int indexOf(char)
		//- int indexOf(String)
		//- int indexOf(char , int)
		//- int indexOf(String , int)
		
		//- int lastIndexOf(char)
		//- int lastIndexOf(String)
		//- int lastIndexOf(char , int)
		//- int lastIndexOf(String , int)
		

		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1; // 없음(무심코 0으로 초기화 하지마라)
		
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf("홍길동"); //7 - 여러글자를 찾더라도 첫번째 글자의 index를 반환
		System.out.println(index);
		System.out.println();
		

		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
		/*
		index = txt.indexOf("홍길동"); //7 - 첫번째 홍길동 , 몇번을 하더라도 첫번째 index만 찾는다.
		System.out.println(index);
		
		index = txt.indexOf("홍길동" , 10); //22 - 두번째 홍길동
		System.out.println(index);
		
		index = txt.indexOf("홍길동" , 25); //38 - 세번째 홍길동 
		System.out.println(index);
		
		*/
		
		index = -1;
		
		//for (int i=0; i<3; i++) {
		
		while (true) {
			
			index = txt.indexOf("홍길동" , index);
			
			if (index == -1) { //홍길동을 못찾았냐?
				break;
			}
			
			System.out.println(index);
			
			index += 3;
			
			System.out.println();
			
		}
		
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		//검색 방향 : 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("홍길동"));			//7
		
		//검색 방향 : 오른쪽 > 왼쪽
		System.out.println(txt.lastIndexOf("홍길동"));		//22
		System.out.println(txt.lastIndexOf("홍길동" , 21)); //7
		
		
	}


	
}
