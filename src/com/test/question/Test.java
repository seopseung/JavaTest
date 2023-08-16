package com.test.question;

public class Test {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.Person();
		
		
		
		
		
	}

}

class Person {
	
	private String name;
	private int age;
	
	public Person(String name , int age) {
		System.out.printf(name, age);
	}

	public Person() {
		
	}

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
	
	
}