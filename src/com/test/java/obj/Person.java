package com.test.java.obj;


// 또 다른 클래스의 데이터를 멤버로 가지는 것도 큰 문제가 되지 않는다는 예시

public class Person {
	
	   private String name;   //이름
	   private int age;       //나이
	   private String gender;   //성별
	   
	   private Person father;	// 아빠
	   private Person mather;	// 엄마
	   
	   
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public int getAge() {
	      return age;
	   }
	   
	   public void setAge(int age) {
	      this.age = age;
	   }
	   
	   public String getGender() {
	      return gender;
	   }
	   
	   public void setGender(String gender) {
	      this.gender = gender;
	   }
	   
	   public void setFather(Person father) {
		   
		this.father = father;
	   }
	   
	   public void setMather(Person mather) {
		
		this.mather = mather;		
	   }
	
	   
	public String info() {
		   
		   String temp ="";
		   
		   temp += "아빠 : " + this.father.getName() + "\n";
		   temp += "엄마 : " + this.mather.getName() + "\n";
		   temp += "본인 : " + this.name + "\n";
		   
		   return temp;
		   
	   }
	   
	   
	}
