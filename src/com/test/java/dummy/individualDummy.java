package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class individualDummy {
	
	public static void main(String[] args) throws IOException {
		
		// 회원번호(자동), 아이디, 비밀번호, 이름, 생년월일(8자리), 전화번호, 계좌번호, 주소
		
		Random rnd = new Random();
		
		String [] id = {""};
		
		String[] firstName = { "김" , "이" , "박" , "최" , "강" , "조" , "차" , "손"};
		
		String[] lastName = { "승" , "민" , "인" , "범" , "희" , "경" , "수" , "현" , "혜" , "유" , "진" , "재" , "용" , "훈" , "원"};
		
		String[] address1 = { "서울시","부산시","대전시","광주시","제주시" };
		String[] address2 = { "강동구","강남구","강서구","강북구","중구" };
		String[] address3 = { "역삼동","대치동","압구정동","천호동","방배동" };
		
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("Data\\indidummy.txt"));
		
		
		for (int i=0; i<100; i++) {
			
			// 회원 번호
			int no = i + 1;
			
			
			// 회원명
			String name = firstName[rnd.nextInt(firstName.length)] + lastName[rnd.nextInt(lastName.length)] + lastName[rnd.nextInt(lastName.length)];
			System.out.print(name);
			
			
			
			// 8자리를 두자리씩 나누기
			// - 2자리 : 19 or 20
			// - 2자리 : 00~99까지
			// - 2자리 : 01 ~ 12까지
			// - 2자리 : 01 ~ 28까지(최소 일수)
			
			// 생년월일
			
//			String age1 = ;

			
			
			
			// 전화번호
			
			String tel = "010-" 
							+ (rnd.nextInt(9000) + 1000) 
							+ "-" 
							+ (rnd.nextInt(9000) + 1000);
			System.out.print(tel);
			
			
			// 계좌번호
			
			int bank = rnd.nextInt(900000000) + 1111111111;
			System.out.print(bank);
			
			
			// 주소
			
			String address = address1[rnd.nextInt(address1.length)]
					+ " "
					+ address2[rnd.nextInt(address2.length)]
					+ " "
					+ address3[rnd.nextInt(address3.length)]
					+ (rnd.nextInt(100) + 20)
					+ "번지" ;
			System.out.println(address);
			
			
			
		} //for
		

		
	}//main

}
