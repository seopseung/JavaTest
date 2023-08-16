package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;


public class Ex32_Array {
	
	public static void main(String[] args) {
		
		//Ex32_Array.java
		
		/*
		 
		  배열, Array
		  - 자료형 : 참조형
		  - 자료 구조
		  - 집합 자료형 : 데이터를 여러개 저장할 수 있는 자료형
		  - 같은 자료형과 같은 성격의 데이터를 집어넣는 집합
		  
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
		//q64();
		//q65();
		//q67();
		q68();
		
		
	}//main

	private static void q68() {
		
		//배열의 요소를 삭제하시오.
		
		//배열 삭제 : Left Shift 구현
		
		int[] nums = {5, 6, 1, 3, 2, 8, 7, 10, 4, 9};
		
		int index = 2;
		
		for (int i=index; i<nums.length-1; i++) {
			//왼쪽방 = 오른쪽방
			nums[i] = nums[i+1];
		}
		
		nums[nums.length-1] = 0; //9 중복 안되려면 이렇게 추가구현
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void q67() {
		//배열에 요소를 삽입하시오.
		
		//배열 삽입 : Right Shift 구현
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		System.out.print("삽입 위치: ");
		int index = scan.nextInt();
		
		System.out.print("값: ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//Right Shift
		for (int i=nums.length-2; i>=index; i--) { //8번방 표기
			//오른쪽방 = 왼쪽방
			nums[i+1] = nums[i];
		}

		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
	}

	private static void q65() {
		
		//중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		int[] lotto = new int[6];
		
		for (int j=0; j<5; j++) {
			
			for (int i=0; i<lotto.length; i++) {
				int n = (int)(Math.random() * 45) + 1;
				
				if(isDuplicate(lotto,n)) { 
					i--;
				} else
					lotto[i] = n; 
			}
		
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
		}
		
	}

	private static boolean isDuplicate(int[] lotto, int n) {
		
		for (int i=0; i<lotto.length; i++) {
			
			if(lotto[i] == n) {
				
				return true;
			}
		}
		
		return false;
	}

	private static void q64() {
		
		//1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
		
		int max = 0;
		int min = 21; //가장 큰수보다 조금 크게 설정
		
		
		int[] nums = new int[20];
		
		for (int i=0; i<nums.length; i++) {
			
			nums[i] = (int)(Math.random() * 20) +1;
		}
		
		System.out.println(Arrays.toString(nums));
		
		//각각의 값을 max, min과 비교해서 처리
		
		for (int i=0; i<nums.length; i++) {	//하나씩 가져와서 최댓값 구하는 코드
			if (nums[i] > max) 	{
				max = nums[i]; 
			}
			
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

	private static void m13() {
		
		//자바 구현 - 퀵 정렬
		int[] nums = {5, 3, 1, 4, 2};
		
		Arrays.sort(nums); //Quicksort implementations. : 퀵 정렬
		
		System.out.println(Arrays.toString(nums));
	}

	private static void m12() {
		/*
		정렬 - 요소간의 크기 비교 후 재배치

		1. 오름차순
			a. 숫자: 작은 수 > 큰수
			b. 문자열: 문자코드값 순으로 정렬
			c. 날짜시간: 과거 > 미래
		2. 내림차순
			a. 숫자: 큰수 > 작은수
			b. 문자열: 문자코드값 역순으로 정렬
			c. 날짜시간: 미래 > 과거
		
		정렬 구현
		1. 개발자 구현
		2. JDK or Library 사용
		*/
		
		//개발자 구현 - 버블 정렬
		int[] nums = {5, 3, 1, 4, 2};
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		for (int i=0; i<nums.length-1; i++) { //0,1,2,3 : cycle
		
			for (int j=0; j<nums.length-1-i; j++) { //비교 후 스왑
				
				if (nums[j] > nums[j+1]) { //오름차순
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					}
				}
			}//for
		
		System.out.println(Arrays.toString(nums));
		
		for (int i=0; i<nums.length-1; i++) { //0,1,2,3 : cycle
			
			for (int j=0; j<nums.length-1-i; j++) { //비교 후 스왑
				
				if (nums[j] < nums[j+1]) { //내림차순
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}//for
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m11() {
		//배열 초기화 리스트
		int[] nums = new int[3];
		System.out.println(Arrays.toString(nums));
		
		//초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		System.out.println(Arrays.toString(nums));
		
		//초기화 리스트
		int[] nums2 = new int[] {100, 200, 300};
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {100, 200, 300};
		System.out.println(Arrays.toString(nums3));
		
		
		String[] names1 = new String[3];
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";
		
		String[] names2 = {"홍길동", "아무개", "하하하"};
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
		
	}

	private static void m10() {
		
		/*
		변수 선언 후 초기화 안하면 실행 불가(컴파일 에러)
		int a; 
		System.out.println(a);
		*/
		
		//배열의 자동 초기화 - 배열 선언 후 값 안넣어도 실행 됨
		//- 배열(참조형)은 생성 직후에 자동으로 초기화가 된다.
		
		//초기화 규칙
		//1. 정수배열: 0
		//2. 실수배열: 0.0
		//3. 문자배열: \0 (null문자)
		//4. 논리배열: false
		//5. 나머지 모든 참조형배열: null
		
		//정수배열
		int[] nums = new int[3]; //int x 3
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums)); 
		
		//실수배열
		double[] nums2= new double[3];
		System.out.println(Arrays.toString(nums2));
		
		//문자배열
		char[] list1 = new char[3];
		System.out.println(Arrays.toString(list1));
		
		//논리배열
		boolean[] list2 = new boolean[3];
		System.out.println(Arrays.toString(list2));
		
		//참조형 배열
		String[] list3 = new String[3];
		System.out.println(Arrays.toString(list3));
	}

	private static void m9() {
		//유틸리티 클래스
		//-int > Integer
		//-double > Double
		
		//Arrays 클래스
		//- 배열 유틸리티 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열의 상태가 궁금? 출력해보자
		printArray(nums);
		
		//덤프(dump): 객체의 상태를 하나의 문자열로 풀어내는 행동(Arrays.toString + 자료형)
		System.out.println(nums); //[I @ 7d6f77cc : 해시코드
		System.out.println(Arrays.toString(nums));
		
		//깊은 복사 메소드 
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 1000;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
	}
	
	public static void printArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void m8() {
		//배열 복사
		//1. 얕은 복사, Shallow Copy - 주소값 복사, Side Effect 발생 (*)
		//2. 깊은 복사, Deep Copy - 요소 복사, Side Effect 없음
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for(int i=0; i<nums.length; i++) {
			
			//배열을 배열에 복사가 아님
			//int = int : 값형 복사형태
			copy[i] = nums[i];
			
		}
		
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
	}

	private static void m7() {
		//값형 복사 시엔 원본과 복사본이 간섭을 안함 = Side Effect가 발생하지 않음
		int a = 10;
		int b;
		b = a;
		
		//원본 수정 > 복사본에게 영향을 미치는지 확인??
		a = 20;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//**** 개발자가 만드는 모든 지역 변수는 Stack에 생성된다.
		
		int n = 10;
		
		
		//배열 복사
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy;
		
		//int[] = int[]
		//*** 배열 변수끼리의 복사는 값 복사가 아닌 주소값 복사다.
		copy = nums;
		
		//원본 수정
		//*** 현재 nums와 copy는 같은 주소값을 가지고 같은 배열을 가리킨다
		//    둘 중 하나를 조작하면 나머지 배열도 영향을 받는다 = Side Effect가 발생한다(조심!!!!!!)
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
	}

	private static void m6() {
		
		//배열의 길이는 런타임 때 정할 수도 있다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생수: ");
		int count = scan.nextInt();
		
		int[] kors = new int[count];
		
		System.out.println(kors.length);
	}

	private static void m5() {
		//*** 메모리의 공간은 한번 할당되면 절대(100%)로 공간을 더 늘리거나 줄일 수 없다
		
		int n; //4byte
		
		//*** 배열은 처음부터 사용하는 최대 길이를 미리 예측하는게 중요!!(나중에 수정 불가능하기 때문)
		
		int[] nums = new int[3]; //4byte x 3= 12byte
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//갑자기 방이 하나 더 필요해지면?
		//nums[3] = 400; 100% 불가능 
	}

	private static void m4() {
		
		//각 자료형별 배열
		
		//정수배열(byte, short, int, long)
		long[] list1 = new long[5];
		list1[0] = 100;
		System.out.println(list1[0]);
		
		//실수배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//문자배열(char)
		char[] list3 = new char[5];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		//논리배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		//참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//주의
		//캘린더 5개 생성한 게 아닌 캘린더 저장 변수를 5개 만든 것!
		//Calendar c1 = Calendar.getInstance();
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]); 
		
	}

	private static void m3() {
		
		int[] nums = new int[3];
		
		//길이(방의 개수): 3
		//인덱스(방 번호): 0 ~ 2, 0 ~ 길이-1
		//방 1개(데이터): 요소(Element)
		
		//nums[0] = 100;
		//nums[1] = 200;
		//nums[2] = 300;
		
		//java.lang.ArrayIndexOutOfBoundsException: 배열의 인덱스가 범위를 벗어났다
		// - Index 3 out of bounds for length 3
		//nums[3]	= 400; 길이는 3인데 방번호를 하나 더 함, 컴파일 에러X 런타임 에러O
		
		//입력(일괄처리)
		//배열의 방을 원하는 순서대로 접근 = 탐색 (for문 사용)
		for (int i=0; i<nums.length; i++) {
			nums[i] = i;
		}
		
		//출력
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}

	private static void m2() {
		
		//요구사항] 학생 3명의 국어 점수 총점과 평균(실수)을 구하시오
		//추가사항] 학생 수 200명으로 증가

		//배열 선언하기(생성하기)
		//형태: 자료형[] 배열명 = new 자료형[길이];
		
		int[] kors = new int[200];
		
		//[3] 배열의 방 개수 == 배열의 길이를 확인할 수 있는 방법
		System.out.println(kors.length); //3
		
		//int = int
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		//kors[3] = 80;
		//..
		//kors[299] = 100;
		
		
		//int total = kors[0] + kors[1] + kors[2];
		int total = 0;
		
		for (int i=0; i<kors.length; i++) {
			total += kors[i]; //배열의 존재 이유
		}
		
		double avg = (double)total / kors.length;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
	}

	private static void m1() {
		
		//요구사항] 학생 3명의 국어 점수 총점과 평균(실수)을 구하시오
		//추가사항] 학생 수 300명으로 증가
		
		int kor1;
		int kor2;
		int kor3;
		//+297
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297
		
		int total = kor1 + kor2 + kor3; //kor4 + ... + kor300
		
		double avg = total / 3.0; //300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
		
	}

}//class
