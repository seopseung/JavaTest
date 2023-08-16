package com.test.java.obj;

public class Ex40_Class {
	
	public static void main(String[] args) {
		
		
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setGender("남자");
		
		Person father = new Person();
		
		father.setName("홍아빠");
		father.setAge(50);
		father.setGender("남자");
		
		Person mather = new Person();
		
		mather.setName("홍엄마");
		mather.setAge(48);
		mather.setGender("여자");
		
		hong.setFather(father);
		hong.setMather(mather);
		
		//java.lang.NullPointerException
		// 오류 랭킹 1위 *****
		//System.out.println(father.info());
		
		
	}

}
