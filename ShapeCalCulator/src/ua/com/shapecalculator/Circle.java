package ua.com.shapecalculator;

public class Circle {
	private double areaOfCircle;
	private double radius;
	
	public void setRadius (double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setAreaOfCircle() {
		areaOfCircle = Math.round((3.14*Math.pow(radius, 2)));
	}
	
	public double getAreaOfCircle() {
		return areaOfCircle;
	}
	
}
	
	
	

	