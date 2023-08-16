package com.test.java.obj;

public class Book {
	
	
	
		
		// 접근 지정자 > 가이드 라인
		// 1. 멤버 변수는 무조건 private을 사용한다.
		// 2. Getter / Setter를 구현한다.
		
		
		public String title;
		public String author;
		public String publisher;
		public int price;
		public int page;
		
		
		// Book 객체
		
		Book book = new Book();
		
		book.title = "자바의 정석";
		book.author = "홍길동";
		book.publisher = "도우출판";
		book.price = 30000;
		book.page = 10000;
	

}
