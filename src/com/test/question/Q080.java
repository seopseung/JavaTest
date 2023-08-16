package com.test.question;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class Q080 {
	
	public static void main(String[] args) {
		
		
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		txt = scan.nextLine();
		
		System.out.print("역순 결과 : \"");
		for (int i=txt.length()-1; i>=0; i--) {
			
			System.out.print(txt.charAt(i));
			
		}
		
		System.out.println("\"");
	}

}
