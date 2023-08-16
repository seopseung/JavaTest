package com.test.java.dummy;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.parser.JSONParser;

public class Ex76 {
	
	public static void main(String[] args) {
		
		
		
		// OpenAPI , Open Application Programming Interface
		// - 공개된 프로그래밍 기능
		// - 공공 데이터 포털
		// - 구글 , 아마존 , 네이버 , 다음 등... 가장 많이 쓰는거 : 지도 , 지하철 , 버스
		
		// OpenAPI -> 데이터 확보 -> 전부 진짜 데이터
		

		
		//m1();
		m2();
		
	}//main

	private static void m2() {
		
		
		/*
		 
		 {
		 		"name" : "홍길동" ,
		 		"age" : 20
		 }
		 
		 */
		
		String json = {""
				+ "              \"name": \"홍길동" \,""
				+ "				 \"age" : 20 "
						+ " }";
		
		JSONParser parser = new JSONParser();
		
		
		
		
		
		
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[지하철 정보 검색]");
		System.out.print("역 검색 : ");
		
		String name = scan.nextLine();
				
		
		// 1. 요청 URL 만들기
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		
		// 2. 서비스 요청 자격 
		url += "ServiceKey=GetNkAs0ixpEva%2FCgKElLMXeGkZHYPgbANnDSHFK8paMfKgl1Erg27mXLfBglW4ttkIH6WS3RfvvHnlFrG9X9Q%3D%3D" ;
		
		url += "&_type=json"; //XML or JSON : 어떤 타입으로 받을거냐
		
		url += "&numOfRows=10"; // 데이터를 n개씩 가져오겠다
		
		url += "&pageNo=1"; // 1~10까지 가져오겠다 , 2 하면 11~20까지
		
		url += "&subwayStationName=" + URLEncoder.encode(name);
		
		
		// 콘솔창 복사 후 새창 주소창에 입력 -> 해당 내용 복사해서 json viewer로 확인하기
		
		// QueryString
		// 주소 뒤에 ?키=데이터&키=데이터&키=데이터 붙이기 -> 주소 호출하면서 데이터도 같이 보내겠다는 예약어
		
		
		
		// URL 객체 생성
		try {
			
			URL obj_url = new URL(url);
			
			// URL과 연결하는 객체 생성 -> 브라우저 대신 접속해줌
			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200
				&& conn.getResponseCode() <= 300){
					
				reader = new BufferedReader(new java.io.InputStreamReader(conn.getInputStream()));
				} else {
					reader = new BufferedReader(new java.io.InputStreamReader(conn.getErrorStream()));
				}
			
			
			//reader -> 검색 결과 읽기 가능
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			conn.disconnect();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}//m1

}
