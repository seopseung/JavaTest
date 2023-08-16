package com.test.question.q114;

import java.io.File;
import java.util.HashMap;

public class Q114 {

	
	
	public static void main(String[] args) {
		
		
		// 목록
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		
		for (File f : list) {
			//System.out.println(f.getName());
			
			String ext = getExtension(f.getName());
			
			if (!count.containsKey(ext)) {
			count.put(ext, 1); // 새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext) + 1); // count = count +1 누적
			}
			
		}
		
		System.out.println(count);
		
		
	}

	private static String getExtension(String name) {
		
		// test.png
		// test.test.png -> 이경우는 세 덩어리 -> 마지막 단어만 가져오면 됨
		//System.out.println(name); // 마우스01.jpg
		String[] temp = name.split("\\."); // split 쓸 때 \\. 으로 해야함
		//System.out.println(temp.length); // 0
		String ext = temp[temp.length-1].toLowerCase();
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		//return ext;
		return name.split("\\.")[temp.length-1].toLowerCase(); // 한줄로도 가능
	}
}
