package com.test.question;

import java.util.Scanner;

public class Q025 {
	
	public static void main(String[] args) {
		
		
		//요구사항] 숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
		
		
		int firstNum = 0;
		int secondNum = 0;
		int max = 0;
		int min = 0;
		int gap = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		firstNum = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		secondNum = scan.nextInt();
		
		
	

	if (firstNum > secondNum ) {
		
		max = firstNum;
		min = secondNum;
		
	} else {
		max = secondNum;
		min = firstNum;
	}
	
		gap = max - min;
		
	if(max != min) {
			System.out.printf("큰 수는 %d이고 , 작은 수는 %d입니다. 두 숫자는 %d가 차이가 납니다." , max , min , gap);
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}

	}
}
