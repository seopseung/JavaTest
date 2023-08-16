package com.test.question.q100;

public class Packer {
	
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointCount;
	private static int rulerCount;
	
	public void packing(Pencil pencil) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n ", pencil.info());
		
		if (pencil.getHardness().equals("4B") 
			|| pencil.getHardness().equals("3B")
			|| pencil.getHardness().equals("2B")
			|| pencil.getHardness().equals("B")
			|| pencil.getHardness().equals("HB")
			|| pencil.getHardness().equals("H")
			|| pencil.getHardness().equals("2H")
			|| pencil.getHardness().equals("3H")
			|| pencil.getHardness().equals("4H")) {
			
			Packer.pencilCount++;
			System.out.println("포장을 완료했습니다.");
			
		} else {
			System.out.println("포장을 실패했습니다.");
		}	
	}
	
	
	private void packing(Eraser eraser) {
		
		System.out.printf("포장 전 검수 : %s입니다." , eraser.info());
		
		if (eraser.getSize().equals("Large")
			|| eraser.getSize().equals("Medium")
			|| eraser.getSize().equals("Small")){
			
			Packer.eraserCount++;
			System.out.println("포장을 완료했습니다.");
			
		} else {
			System.out.println("포장을 실패했습니다.");
		}
	}
	
	
	private void packing(BallPointPen ballPointPen) {
		
		System.out.printf("포장 전 검수 : %s입니다." , ballPointPen.info());
		
		if ((ballPointPen.getThickness() == 0.3 ||
			ballPointPen.getThickness()	 == 0.5 ||
			ballPointPen.getThickness()  == 0.7 ||
			ballPointPen.getThickness()  == 1   ||
			ballPointPen.getThickness()  == 1.5)) {
		
		Packer.ballPointCount++;
		System.out.println("포장을 완료했습니다.");
		
	} else {
		System.out.println("포장을 실패했습니다.");
		}
	
	}

}//class
