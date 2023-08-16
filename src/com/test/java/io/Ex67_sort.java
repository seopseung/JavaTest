package com.test.java.io;

import java.util.Arrays;
import java.util.Comparator;

public class Ex67_sort {
	
	public static void main(String[] args) {
		
		
		
		
		/*
		 
		 // 배열 or 컬렉션
		 // - 오름차순 정렬 , 내림차순 정렬
		 // 1. 직접 알고리즘 구현
		 // 2. JDK 제공 기능
		 
		 // 2 + 1 -> JDK 제공 + 커스터 마이징 + 익명 클래스 사용(선택)
		 
		  
		 
		 */
		//int[]
		Integer[] nums = { 1 , 5 , 2 , 4 , 3 };
		
		System.out.println(Arrays.toString(nums));
		
		// 오름차순 정렬
		Arrays.sort(nums); // Quick Sort
		System.out.println(Arrays.toString(nums));
		
		// 내림차순 정렬 -> 지원을 안해서 직접 만들어야함(ㄷㄷ)
		//Arrays.sort(배열 , Comparator);
		Arrays.sort(nums , new MyComparator());
		
		System.out.println(Arrays.toString(nums));
		
		
		
		// 쓸모 없음
		MyComparator mc1 = new MyComparator();
		
		System.out.println(mc1.compare(10, 20));
		
		
		
//		Double[] nums2 = { 2.5 , 7.1 , 3.8 , 9.2 , 8.9 };
//		
//		Arrays.sort(nums2 , new MyComparator<Double>(){
//			
//			@Override
//			public int compare(Double o1, Double o2) {
//				
//				
//				if (o1 > o2) {
//					return 1;
//				} else if (o1 < o2) {
//					return -1;
//				} else {
//					return 0;
//				}
//				
//			}
//			
//		});
		
		m2();
		
	}//main

	private static void m2() {
		
		// 자료형별 정렬
		// 1. 숫자
		// 2. 문자(열) -> 문자코드값 -> 숫자
		// 3. 날짜시간 -> 숫자
		
		
		String txt1 = "ABC";
		String txt2 = "abc";
		
		//System.out.println(txt1 > txt2); // 참조파일이 오면 에러가 난다. 주소값은 연산자의 피연산자가 될 수 없다.
		// 문자열 > 문자열 : 불가능(참조값)
		// 문자 > 문자 : 가능(값) , 정수끼리 비교 == 글자(char)를 하나씩 비교하는건 가능
		
		int n = 0;
		
		for (int i=0; i<3; i++) {
			
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1 > c2) {
				n = 1;
				break;
			} else if (c1 < c2) {
				n = -1;
				break;
			}
			
		}
		
		System.out.println(n);
		
		System.out.println(txt1.compareTo(txt2)); // 조건이 true면 양수를 뱉어냄 , false면 음수
		System.out.println(txt1.compareToIgnoreCase(txt2)); // 대소문자 구분 없이 문자가 같으면 양수
		System.out.println();
		
		String[] names = { "홍길동" , "아무개" , "유재석" , "박명수" , "이순신" , "훈" , "김철" };
		
		// 가나다순으로 정렬
		System.out.println(Arrays.toString(names)); // [홍길동, 아무개, 유재석, 박명수, 이순신]
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names)); // [박명수, 아무개, 유재석, 이순신, 홍길동]
		
		Arrays.sort(names , new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				//return o2.compareTo(o1); // 문자 코드값 비교해서 가나다순 
				
				//글자수로 비교 -> 외자 먼저
				
				return o1.length() - o2.length(); // 글자수 비교
			}
		});
		
		System.out.println(Arrays.toString(names));
		
	}
}

// 정렬 때문에 선언한 클래스
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		// o1 vs o2
		// 1. 오름 차순
		//	a. o1이 더 크면 양수 반환
		//	b. o2가 더 크면 음수 반환
		//	c. 같으면 0 반환
		
		if (o1 > o2) {
			return 1;
		} else if (o1 < o2) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
}