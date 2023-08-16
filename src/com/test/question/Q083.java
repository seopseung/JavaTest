package com.test.question;

import java.util.Scanner;

public class Q083 {
	
	public static void main(String[] args) {
		
		m1();
		m2();
		
	}

	private static void m2() {
		
		String file = "";
		int index = -1;
		int sumMp3 = 0;
		int sumJpg = 0;
		int sumJava = 0;
		int sumHwp = 0;
		int sumDoc = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) {
			
			System.out.print("파일명 : ");
			file = scan.nextLine();
			
			index = file.lastIndexOf(".");
			
			file = file.toLowerCase();
			
			if (file.substring(index).equals(".mp3")) {
				sumMp3++;
			} else if (file.substring(index)) {
				
			}
			
			
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
	} //m2
	

	
	
	private static void m1() {
		
		String file = "";
		int index = -1;
		int sumMp3 = 0;
		int sumJpg = 0;
		int sumJava = 0;
		int sumHwp = 0;
		int sumDoc = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) {
			System.out.print("파일명 : ");
			file = scan.nextLine();
			
			index = file.lastIndexOf(".");
			
			if (file.substring(index).equals(".mp3")) {
				sumMp3++;
			} else if (file.substring(index).equals(".jpg")) {
				sumJpg++;
			} else if (file.substring(index).equals(".java")) {
				sumJava++;
			} else if (file.substring(index).equals(".hwp")) {
				sumHwp++;
			} else if (file.substring(index).equals(".doc")) {
				sumDoc++;
			}
		
	}
		
		System.out.printf("mp3 : %d개\n" , sumMp3);
		System.out.printf("jpg : %d개\n" , sumJpg);
		System.out.printf("java : %d개\n" , sumJava);
		System.out.printf("Hwp : %d개\n" , sumHwp);
		System.out.printf("doc : %d개\n" , sumDoc);
		
	}	
	
	
	
	
	
}
