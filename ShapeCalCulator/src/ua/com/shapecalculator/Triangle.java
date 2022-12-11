package ua.com.shapecalculator;

public class Triangle {

	private double sideA, sideB, sideC, height, baseOfTriangle;
	private double areaOfTriangle;
	private double semiPerimeter;
	
	
	public double getAreaOfTriangle() {
		return areaOfTriangle;
	}

	public double getBaseofTriangle() {
		return baseOfTriangle;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}
	
	public double getSemiPerimeter() {
		return semiPerimeter;
	}
	

	public void setAreaOfTriangle() {
		areaOfTriangle = 0.5 * baseOfTriangle * height;
	}

	public void setBaseofTriangle(double base) {
		baseOfTriangle = base;
	}

	public void setSideA(double A) {
		sideA = A;
	}

	public void setSideB(double B) {
		sideB = B;
	}

	public void setSideC(double C) {
		sideC = C;
	}

	public void setHeight(double H) {
		height = H;
	}
}
