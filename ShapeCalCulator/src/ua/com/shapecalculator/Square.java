package ua.com.shapecalculator;

public class Square {

	private double sideOfSquare;
	private double areaOfSquare;
	
	public double getSideOfSquare() {
		return sideOfSquare;
	}
	public double getAreaOfSquare() {
		return areaOfSquare;
	}
	
	
	
	public void setSideOfSquare(double side) {
		sideOfSquare = side;
	}
	
	public void setAreaOfSquare() {
		areaOfSquare = Math.round(Math.pow(sideOfSquare, 2));
	}

}
