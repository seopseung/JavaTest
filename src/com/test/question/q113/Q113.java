package com.test.question.q113;

import java.io.File;

public class Q113 {

	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\음악 파일"; // 작업할 폴더 경로를 설정
		
		File dir = new File(path); // dir 변수 만들어서
		int n = 1; // 숫자를 세기 위한 변수
		
		File[] list = dir.listFiles(); // 폴더 안에 있는 파일 목록 가져오기
		
		for (File file : list) {
			
			if (file.getName().substring(file.getName().lastIndexOf(".") + 1).toLowerCase().equals("mp3")) {
				// 확장자가 mp3인지 확인하기
				File temp = new File(path + "\\" + String.format("[%03d]%s", n , file.getName())); 
				// 새로운 파일 이름 만들기!  ex) [001]파일이름.mp3
				file.renameTo(temp); // 파일 이름 변경
				n++; // 누적 -> 다음 목록 변경
			}
			
		}
		
		
		
		
	}
}
