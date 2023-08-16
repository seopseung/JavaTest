package com.test.java.auth.data;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String lv;
	
	
	public Member(String id, String pw, String name, String lv) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
		
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", lv=" + lv + "]";
	}


	public static void info() {
		
		if (Auth.auth == null) {
			
			System.out.println();
			System.out.println("회원만 접근가능합니다.");
			System.out.println();
			return;
			
		}
		System.out.println("-----------------");
		System.out.println("     회원 정보");
		System.out.println("-----------------");
		
		System.out.println("아이디: " + Auth.auth.getId());
		System.out.println("이름: " + Auth.auth.getName());
		System.out.println("등급: " + (Auth.auth.getLv().equals("1") ? "일반회원" : "관리자"));
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		
		
	}


	public static void something() {
		
		if (Auth.auth == null) {
			
			System.out.println();
			System.out.println("회원만 접근가능합니다.");
			System.out.println();
			return;
			
		}
		
		System.out.println("회원 전용기능입니다.");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}
	
	
	
	

}
