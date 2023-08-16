package com.test.java.collection;

import java.util.TreeMap;

public class Ex71_TreeMap {
	
	public static void main(String[] args) {
		
		
		// TreeMap
		// - Tree -> 이진 탐색 트리 -> 자동정렬
		// - Map -> 키+값 -> 연관배열
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white" , "흰색");
		map.put("black" , "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map.size());
		
		System.out.println(map);
		
		System.out.println(map.get("green"));
		
		map.put("green", "녹색");
		
		System.out.println(map.get("green"));
		
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r", "y"));
		
		/*
		 
		 List
		 - ArrayList -> 배열이 필요할 때 사용 / 삽입 , 삭제X
		 -LinkedList -> ArrayList 대체제(가끔식 사용) / 극심한 삽입 , 극심한 삭제O
		 - Queue -> 큐 구조 필요할 때
		 - Vector
		
		 
		 
		 
		 */
		
		
	}

}
