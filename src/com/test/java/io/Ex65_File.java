package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {
	
	
	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
	
	
	public static void main(String[] args) {
		
		
		/*
		 
		 
		 	파일 입출력
		 	- 응용 프로그램 <- 데이터 -> 저장 장치(*.txt)
		 	
		 	저장 장치
		 	- 데이터 1,0으로 저장
		 	- 데이터의 자료형 존재 X -> 모두 다 문자로 저장됨
		 	
		 	인코딩, Encoding
		 	- 문자 코드(자바의 데이터)를 부호화(1,0) 시키는 작업
		 	- 자바 프로그램("홍길동") -> 텍스트 파일(1001010001000110)로 부호화
		 	
		 	디코딩 , Decoding
		 	- 부호화 된 데이터를 문자 코드로 변환하는 작업
		 	- 텍스트 파일(1001010001000110) -> 자바 프로그램("홍길동")로 부호화
		 	
		 	인코딩/디코딩 규칙
		 	1. ISO-8859-1
		 	2. EUC-KR
		 	3. ANSI
		 	4. MS949(CP949)
		 	5. UTF-8
		 	6. UTF-16
		 	7. ASCII
		 	
		 	ANSI(ISO-8859-1, EUC-KR, MS949)
		 	1. 영어(숫자, 특수문자, 서유럽) : 1byte
		 	2. 한글(한자, 일본어 등) : 2byte
		 	
		 	UTF-8(Unicode) ***** 무조건 이거 사용 -> 국제 표준
		 	1. 영어 : 1byte
		 	2. 한글 : 3byte
		 	
		 	UTF-16(Unicode)
		 	1. 영어 : 2byte
		 	2. 한글 : 2byte
		 	
		 	
		 
		 
		 
		 
		 */
		
		//m1();
		//m2();
		
		//m3();
		//m4();
		
		//m5();
		//m6();
		
		//m7();
		m8();
		
	}//main

	private static void m8() {
		
		
		try {
			
			BufferedReader reader = 
					new BufferedReader(new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex32_Array"));
			
			String line = null;
			int n = 1;
			
			while((line = reader.readLine()) != null) {
				
				System.out.printf("%3d: %s\n" , n , line);
				n++;
				
			}
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("at Ex65_File.m8");
			e.printStackTrace();
			
		}
		
		
	}

	private static void m7() {
		
		// 메모장 쓰기
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("저장할 파일명 : ");
			String filename = scan.nextLine();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt"));
					//new BufferedWriter(new BufferedWriter("C:\\class\\code\\java\\file\\" + filename + ".txt"));
			
			boolean loop = true;
			
			while (loop) {
				
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("exit")) {
					break;
				}
				
				writer.write(line); // 한 줄 입력(scan) -> 한 줄 쓰기(writer)
				writer.write("\r\n");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("at Ex65_File.m7");
			e.printStackTrace();
			
		}
		
		
	}

	private static void m6() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			;
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
			
			// - reader2.read()
			// - reader2.readLine()
			
//			String line = reader2.readLine();
//			System.out.println(line);
			
			String line = null;
			
			while ((line = reader2.readLine()) != null) {
				
				System.out.println(line);
				
			}
			
			reader.close();
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("at Ex65_File.m6");
			e.printStackTrace();
			
		}
		
	}

	private static void m5() {
		
		// 쓰기
		// - FileOutputStream -> FileWriter -> BufferedWriter
		
		// 읽기
		// - FileInputStream -> FileReader -> BuffueredReader
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));
			
			writer.write("하나");
			writer.write('A');
			writer.write("\r\n");
			writer.write("둘");
			writer.newLine();
			writer.write('셋');
			
			writer.close();
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m4() {
		
		try {
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\list.txt");
			
//			int code = reader.read();
//			
//			System.out.println((char)code);
			
			int code = -1;
					
			while ((code = reader.read()) != -1){
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {
		
		try {
			FileWriter writer = new FileWriter();
			
		} catch (Exception e) {
			
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
		
		// 쓰기
		// - FileOutputStream -> FileWriter
		
		// 읽기
		// - FileInputStream -> FileReader 
		
	}

	private static void m2() {
		
		try {
			
			// 파일 읽기
			// - FileOutputStream
			// - FileInputStream
			
			FileInputStream stream = new FileInputStream(Ex65_File.FILE);
			
			int code = -1;
			
			
			while((code = stream.read()) != -1) {
			// 1. 대문자 유니코드 읽음 -> 글자가 있냐 없냐 -> 진입해서 찍고 -> 두번째 글자 읽음 -> 또 찍고.. 
			//	-> -1이 더이상 읽을 글자가 없으면 출력 되므로 밖으로 나오고
			
				System.out.print((char)code);
			
			}
			System.out.println();

			stream.close();
				
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
			e.printStackTrace();
		}
		
		
	}

	private static void m1() {
		
		// 파일 쓰기
		// - 스트림 객체
		
		// 쓰기 스트림 객체
		// 1. 생성 모드 , Create mode -> 덮어쓰기 -> 더 많이 사용!!
		// - 기본값
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 덮어쓰기를 한다.
		
		// 2. 추가 모드 , Append mode -> 기존 내용 -> 이어쓰기 (기존 내용 유지)
		// - 생성자에 true값을 추가 (없거나 false면 생성모드로 됨)
		// a. 파일이 존재하지 않으면 자동으로 생성한다.
		// b. 파일이 존재하면 항상 이어쓰기를 한다.
		
		

		
		try {
			File file = new File("C:\\class\\code\\java\\file\\list.txt");
			
			// 스트림 객체 생성을 스트림을 연다(open)라고 말함
			// FileOutputStream - 바이트 단위 쓰기(1byte) -> 한글을 뽑아내려면 깨짐
			FileOutputStream stream = new FileOutputStream(file, true);
			
			
			
//			stream.write('홍'); // 'A'라는 글자를 적고 싶어 -> 문자코드값 써야함
//			stream.write('길');
//			stream.write('동');
			
			
			String txt = "Hello ~ Hong!!";
			
			for (int i=0; i<txt.length(); i++) {
				stream.write(txt.charAt(i));
			}
			
			
			// 스트림은 무조건 닫아야함
			// - 저장이 안된다.
			// - 잠긴 파일이 된다.
			stream.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m1");
			e.printStackTrace();
		}
		
	}

}
