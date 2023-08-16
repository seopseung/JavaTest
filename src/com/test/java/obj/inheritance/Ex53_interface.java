package com.test.java.obj.inheritance;

public class Ex53_interface {
	
	public static void main(String[] args) {
		
		MxKeys keyboard = new MxKeys();
		
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBattery());
		keyboard.powerOff();
		
	}//main

}//class



// *** Keyboard는 객체를 생성할 수 없다. -> 실체화할 수 없다.

interface Keyboard {
	
	// 키보드로서 갖춰야할 행동들 정의(선언부 O , 구현부 X) -> 호출 사용법
	
	//public 생략 가능
	void keyDown(char c);
	void powerOn();
	public void powerOff();
	public int checkBattery();
	//static void aaa();
	
}

class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		// 구현? -> 자기 맘대로~
		System.out.println(c + "눌렀음");
		
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public int checkBattery() {
		
		return 80;
	}
	
	
	
}