package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {
	
	
	public static void main(String[] args) {
		
		
		/*
		 
		 	컬렉션 , Collection
		 	- JCF , Java Collection Framework
		 	- (향상된) 배열
		 	- 기존의 순수 배열
		 		- 사용법 개량
		 		- 용도로 따른 입출력 방식 / 효율성 개량
		 	- 클래스 + 내부 순수 배열을 가지고 있다.
		 	- 길이 가변 -> 방의 개수를 마음대로 늘리고 줄이는게 가능
		 	- 자료 구조 
		 	
		 	
		 	컬렉션 종류
		 	
		 	1. List 계열						legacy : 오래 되서 사라질 애들 , 요즘 잘 안쓴다.
		 		- ArrayList(*****)
		 		- LinkedList
		 		- Queue
		 		- Stack
		 		- Vector(legacy)
		 	
		 	2. Set 계열
		 		- HashSet(***)
		 		- TreeSet
		 	
		 	3. Map 계열
		 		- HashMap(****)
		 		- TreeMap
		 		- Proerties(legacy)
		 		- HashTable(legacy)
		 	
			
			Collection(I)
			- List(I)
			- Set(I)
			
			Map(I) // 독립적
		
		
			ArrayList 클래스
			- ArrayLict(C) -> List(I) -> Collection(I) // 상속 받은 순서 (C): 클래스 , (I): 인터페이스
		 	- 순수 배열과 구조가 가장 유사함
		 	- 첨자(index)를 사용해서 요소(element)에 접근
		 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
		//m5();
		//m6();

		
	}//main

	private static void m6() {
		
		// 컬렉션 초기 용량 -> 내부 배열의 초기 길이
		// (10) : initialCapacity - 배열만큼의 공간을 확보하고 시작한다. 복사과정 없이 한번에 채울 수 있음
		ArrayList<Integer> list = new ArrayList<Integer>(10); 
		
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10); // 이젠 더이상 추가 계획 없음(확신)
		
		list.trimToSize(); // 데이터가 들어있는만큼의 길이로 재조정 , 진짜로 확신이 들때만 써라 , 굳이 따지면 안해도 됨.
		
		
		
		
	}

	private static void m5() {
		
		// ArrayList(컬렉션) 특징
		// 1. 내부에 배열을 가지고 있다.
		// 2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성
		// 3. ??? 길이가 가변 -> 데이터를 계속 넣으면.. 계속 공간이 늘어난다며
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=0; i<1000000; i++) {
//			list.add(i);
//			
//		}
//		
//		System.out.println(list.size());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(10);
		System.out.println(list.size()); // 1
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size()); // 5
		
		list.add(50);
		System.out.println(list.size()); // 6
		
		
	}
		

	private static void m4() {
		
		// 성적표
		// 학생 클래스(이름 , 국어 , 영어 , 수학 , 총점 , 평균)
		// 학생 여러명 만들꺼임
		
		// 배열을 만들지 컬렉션으로 할지?
		// - 길이로 판단 -> 학생이 몇명인지
		// - 배열(고정) vs ArrayList(불확실) -> 판단을 못하겠으면 그냥 ArrayList 써라 ㅋ
		
		//Student[] list;
		ArrayList<Student> list = new ArrayList<Student>(); 
		
		for (int i=0; i<10; i++) {
			
			int kor = (int)(Math.random() * 41) + 60; 	// 60점 ~ 100점
			int eng = (int)(Math.random() * 41) + 60; 	// 60점 ~ 100점
			int math = (int)(Math.random() * 41) + 60; 	// 60점 ~ 100점
			
			Student s = new Student("학생" + i, kor, eng, math);
			
			list.add(s); // 배열에 학생 추가
		}

		
		//System.out.println(list);
		System.out.println("===============================================");
		System.out.println("                   성적표");
		System.out.println("===============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]\t");
		
		// 하나씩 꺼내옴
		for (Student s : list) {
			
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n" , s.getName() , s.getKor() , s.getEng() , s.getMath() , total , avg);
		}
		
		
	}

	private static void m3() {
		
		// 차원
		int [] 		ns1 = new int [3];
		int [][] 	ns2 = new int [3][3];
		int [][][]  ns3 = new int [3][3][3];
		
		ArrayList<Integer> ms1 = new ArrayList<Integer>(); // 1차원
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>(); // 2차원
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>(); // 3차원
		
		
		
	}

	private static void m2() {
		
		
		// CRUD
		// - Create(쓰기)
		// - Read(읽기)
		// - Update(수정)
		// - Delete(삭제)
		
		
		
		// ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. 요소 추가하기
		// - boolean add(T value)
		// - 배열의 맨 마지막에 추가하기 -> Append
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		
		
		
		// 2. 요소의 개수
		// - int size()
		System.out.println(list.size()); //5
		
		
		
		
		// 3. 요소 접근(읽기)
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.get(list.size() - 1)); // 마지막 방
		
		// ArrayOutOfBoundsException: 배열에서 오류
		// StringOutOfBoundsException: 문자열에서 오류
		// IndexOutOfBoundsException: 방번호에서 오류
		// java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
		//System.out.println(list.get(5)); // 없는 방번호
		
		
		
		
		// 4. 요소 수정
		// - list[0] = 10; 대입 or 수정
		// - String set(int index , T newValue) // 수정 되기 바로 직전의 값을 돌려준다. 평상시에는 return값 안받음.
		String temp = list.set(2, "포도");
		System.out.println(list.get(2));
		System.out.println(temp);		// return 값
		System.out.println();
		
		
		
		
		// 5. 요소 삭제
		// - 순수 배열의 요소(방) 삭제 할 수 있냐? -> 불가능 : 정해져있어서
		// - 컬렉션은 요소 삭제 가능? -> 쌉가능
		// - T remove(int index) -> 방번호로 찾아서 삭제
		// - boolean remove(T value) -> 값을 찾아서 삭제
		// - *** 즉, 시프트가 발생한다!! -> 삭제된 방 이후의 모든 요소는 모두 방번호 -1 감소. ex) 3을 삭제하면 4가 3이 된다.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		list.remove(2);
		//list.remove("포도"); // 이건 잘 안씀 : ** 포도가 2개 이상이면? 첫번째 만나는 포도를 삭제함 , 두번째 만나는 포도는 못지우게 됨.
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		
		
		
		// 6. 탐색
		// - 루프
		
		for (int i = 0; i<list.size(); i++){
			System.out.printf("list.get(%d) = %s\n" , i , list.get(i) );
		} 
		System.out.println();

//		list.get(0) = 바나나
//		list.get(1) = 딸기
//		list.get(2) = 귤
//		list.get(3) = 사과
//		list.get(4) = 파인애플
		
		
		// 향상된 for문(foreach문)
		
//		for (변수 : 배열/컬렉션 )  {
//			
//		}
		// 컬렉션을 먼저 작성하고 변수를 작성하는데 배열의 방 하나를 가져왔을 때 저장할 수 있는 변수
		for (String item : list) {
			System.out.println(item);
		} 
		System.out.println();
		
		
		
		
		// 7. 덤프 (배열의 상태를 보는것)
		// - Arrays.toString(배열)
		System.out.println(list.toString());
		System.out.println(list);
		
		
		
		
		// 8. 요소 추가
		// - 배열의 원하는 위치에 요소를 추가 -> Insert -> 원하는 위치에 끼워넣기
		// - void add(index index , T value) == (삽입될 위치 , 삽입될 값)
		// - *** 시프트가 발생한다. -> 삽입된 방 이후의 모든 요소의 방번호 +1 , 끼워 넣은애 뒤로 다 1씩 증가
		list.add(2,"망고");
		System.out.println(list);
		
		
		
		
		// 9. 기타 등등
		System.out.println(list.indexOf("사과")); // -1 , 못찾으면 -1뜸
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("파인애플")); // 리스트 끝에서부터 확인하는 거
		System.out.println(list.contains("망고")); // 리스트에 해당 값이 있냐 없냐를 boolean값으로 나타냄
		System.out.println();
		
		
		
		
		// 10.
		System.out.println(list.isEmpty()); // 값이 비어있니? boolean값으로 나타냄
		
		list.clear(); // 모든 요소를 삭제 -> 초기화
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		
		
		

		
		
		
		
		
	}

	private static void m1() {
		
		// 순수 배열 선언
		// - 타입 명시(int)
		// - 길이 명시(3)
		int[] num1 = new int[3];
		
		// 요소 접근 -> 첨자(index) 사용 -> Indexer 표기법([0])
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);
		System.out.println();
		
		
		//---------------------------------------------------
		
		
		// 컬렉션
		// - 타입 명시(Integer) -> 제네릭
		// - 길이 명시(???) -> 가변
		// - Indexer를 지원하지 않음 -> Method로 처리해야함(.add , get() 등) -> 데이터를 넣을때나 뺄 때 Method로 해야함
		ArrayList<Integer> num2 = new ArrayList<Integer>(); // 하고 배열 누르고 add하기
		
		// 요소 추가 -> add() == append -> 차례대로 마지막 방에 넣어라 -> 0번째부터 들어가고 0,1,2번째 순서대로...
		num2.add(10); // 0번째 방
		num2.add(20); // 1번째 방
		num2.add(30); // 2번째 방
	
		System.out.println(num2.get(0)); // num1[0] 처럼 방번호를 요소로 출력
		System.out.println(num2.get(1)); // num1[0] 처럼 방번호를 요소로 출력
		System.out.println(num2.get(2)); // num1[0] 처럼 방번호를 요소로 출력
		
		System.out.println(num2.size()); // 길이 3 == .length
		
		num2.add(40);
		num2.add(50);
		
		System.out.println(num2.size()); // 길이 5 -> 넣고싶은만큼 맘대로 넣어도 됨
		
		
	}

}



















