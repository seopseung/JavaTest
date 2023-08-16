package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		
		
		String txt = "";
		String result = "";
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		txt = scan.nextLine();
		
		for (int i = 0; i<txt.length(); i++) {
			sum += Integer.parseInt(txt.substring(i , i+1));
			result += txt.substring(i , i+1);
			
			//sum += txt.charAt(i) - 48;
			//result += txt.charAt(i);
			
			if (i < txt.length() - 1) {
				result += " + " ; 
			}
			
			System.out.printf("%s = %d\n" , result , sum);
			
		}
				
		
	}
	
}
