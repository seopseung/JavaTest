package com.test.question.q100;

public class BallPointPen {
	
	private double thickness;
	private String color;

	public double getThickness() {
		
		return thickness;
	}

	public void setThickness(double thickness) {
		
		this.thickness = thickness;
	}

	
	public String getColor() {
		
		return color;
	}

	public void setColor(String color) {
		
		this.color = color;
	}

	public String info() {
		
		return String.format("%s 색상 %.1f 볼펜입니다." , this.color , this.thickness);
		

	}
	
}
