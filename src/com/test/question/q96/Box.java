package com.test.question.q96;

public class Box {
	
	private Macaron[] list = new Macaron[10];
	
	public void cook() {
		
		String[] color = { "red" , "blue" , "yellow" , "pink" , "purple"
						 , "green" , "black" };
		
		for (int i = 0; i < list.length; i++) {
			
			Macaron m = new Macaron();
			
			m.setSize((int)(Math.random() * 11) + 5);
			m.setColor(color[(int)(Math.random() * color.length)]);
			m.setThickness((int)(Math.random() * 20) + 1);
			
			this.list[i] = m;
			
			
		}
		
		System.out.printf("마카롱을 %d개 만들었습니다.\n" , this.list.length);
		System.out.println();
	}

	public void check() {
		
		int pass = 0;
		int failed = 0;
		
		for (int i = 0; i < list.length; i++) {
			
			Macaron m = this.list[i];
			
			if (check(m)) {
				pass++;
			} else {
				failed++;
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n" , pass);
		System.out.printf("QC 불합격 개수 : %d개\n" , failed);
		System.out.println();
		
		
	}
	
	public void list() {
		
		System.out.println("[마카롱 목록]");
		
		for (int i = 0; i < list.length; i++) {
			
			Macaron m = this.list[i];
			
			System.out.printf("%d번 마카롱 : %dcm(%s , %dmm) : %s\n"
							 , i , m.getSize() , m.getColor()
							 , m.getThickness() , check(m)
							 ? "합격" : "불합격");
			
		}
		System.out.println();
		
	}
	
	private boolean check(Macaron m) {
		
		if (!(m.getSize() >= 8 && m.getSize() <= 14)) {
			return false;
		}
		
		if (m.getColor().equals("black")) {
			return false;
		}
		
		if (!(m.getSize() >= 3 && m.getSize() <= 18)) {
			return false;
		}
		
		return true;
	}
	
	
	
}//Class
