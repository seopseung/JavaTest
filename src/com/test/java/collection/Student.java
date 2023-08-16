package com.test.java.collection;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 기존 데이터를 가지고 만들 수 있는 값은 안 만들어도 됨(변화가 있으면 다시 만들어야함)
	//private int total;
	//private double avg;
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
	
}





























