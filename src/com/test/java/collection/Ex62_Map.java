package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {
	
	public static void main(String[] args) {
		
		
		/*
		 
		 	ArrayList
		 	- 요소 접근 -> 첨자(index) 사용
		 	- 순서가 있는 데이터 집합(방번호 == 요소의 순서)
		 	ex) 강의실 6개 -> 1강의실 , 2강의실 , 3강의실.. 6강의실
		 	- 스칼라 배열(Scalar Array)
		 	- 요소 일관 접근 -> 루프(for)
		 	- 요소끼리 구분이 힘들다 -> 방번호 -> 의미가 없다.
		 	- 첨자(index)는 유일하다.
		 	- 값(value)은 중복이 가능하다. -> 방번호가 유일해서..
		 	
		 	HashMap
		 	- 요소 접근 -> 키(key) 사용
		 	- 순서가 없는 데이터 집합(방번호X)
		 	ex) 강의실 6개 -> 햇님반 , 달님반 , 별님반.. 지구반
		 	- 키(key) -> 값(value)
		 	- 맵(Map) , 딕셔너리(Dictionary) = 사전 구조
		 	- 연관 배열
		 	- 요소 일관 접근 -> 불가능
		 	- 요소끼리 구분이 용이하다. -> 식별자(key) -> 방의 의미를 알게됨 -> 가독성이 좋음
		 	- 키(key)는 유일하다.
		 	- 값(value)은 중복이 가능하다. -> 키가 유일해서..
		 	
		 
		 */
		
		
		// String - key 자료형 -> 방이름
		// Integer - value 자료형 -> 데이터
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // 타입 변수가 2개짜리임
		
		
		// 1. 요소 추가
		// - V put (K key , V value)
		map.put("국어", 100); // int 국어 = 100
		map.put("영어", 90);
		map.put("수학", 80);
		
		
		// 2. 요소 개수
		// - int size
		System.out.println(map.size());
		
		
		// 3. 요소 읽기
		// - V get(K key)
		System.out.println(map.get("국어")); // (key)를 입력하면 value를 돌려준다.
		System.out.println(map.get("영어")); 
		System.out.println(map.get("수학")); 
		
		
		// 4. 일괄 탐색 -> 불가능 -> 할 순 있음(추후에) , 애초에 루프를 돌릴려면 ArrayList 씀
		
		
		// 5. 요소 수정
		// - V put(K key , V value)
		map.put("국어", 95); // 추가가 아니라 수정임 -> 사용법을 그냥 지들이 하고싶은대로 만든거임
		System.out.println(map.get("국어")); // 95
		
		
		// 6. 요소 검색
		// - boolean containsKey(K Key)
		// - boolean containsKey(V value)
		System.out.println(map.containsKey("국어")); // true : 배열 안에 국어점수가 있니?
		System.out.println(map.containsKey("국사")); // false
		
		System.out.println(map.get("국사")); // null : 없는 애를 요청하면 null값으로 돌려준다.
		
		System.out.println(map.containsValue(90)); // 90점 맞은 과목이 있나? true
		System.out.println(map.containsValue(100)); // 100점 맞은 과목이 있나? false
		
		
		// 7. 요소 삭제
		// - V remove (K key)
		map.remove("국어");
		
		System.out.println(map.size()); // 2
		System.out.println(map.get("국어")); // null 
		
		
		// 8. 초기화
		map.clear();
		
		System.out.println(map.size()); // 0
		
		
		
		// HashMap으로 루프 돌리는 법(잘 안함)
		
		map.put("국어", 100);
		map.put("영어", 90);
		map.put("수학", 80);
		
		Set<String> set = map.keySet();
		
		System.out.println(set);
		
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
		// 교실
		HashMap<String , String> list = new HashMap<String, String>();
		
		list.put("반장" , "홍길동");
		list.put("부반장" , "아무개");
		list.put("미화부장" , "하하하");
		
		
		
		
		
		
		
		
		
	}

}
