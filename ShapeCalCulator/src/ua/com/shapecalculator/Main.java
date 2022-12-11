package ua.com.shapecalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Shape sh1 = new Shape();
		System.out.println("Input number of the shape");
		System.out.println("1 - Circle");
		System.out.println("2 - Triangle");
		System.out.println("3 - Square");


		switch (sc1.nextInt()) {

		case 1:
			System.out.println("Input radius value");
			sh1.cir1.setRadius(sc1.nextDouble());
			sh1.cir1.setAreaOfCircle();
			System.out.println(sh1.cir1.getAreaOfCircle());

			break;

		case 2:
			System.out.println("Input kind of triangle");
			System.out.println("1 - Scalene Triangle");
			System.out.println("2 - Isosceles Triangle");
			System.out.println("3 - Equilateral Triangle");
			System.out.println("4 - Acute Angle Triangle");
			System.out.println("5 - Right Angle Triangle");
			System.out.println("6 - Obtuse Angle Triangle");
			System.out.println("7 - Unic area method by base and height");
			switch (sc1.nextInt()) {
				case 1:
//					System.out.println("Input side A");
//					sh1.tr1.setSideA(sc1.nextDouble());
//					System.out.println("Input side B");
//					sh1.tr1.setSideB(sc1.nextDouble());
//					System.out.println("Input side C");
//					sh1.tr1.setSideC(sc1.nextDouble());
//					sh1.tr1.setSemiPerimeter();
//					sh1.tr11.setAreaOfTriangle();
//				
					
				
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
						
				case 4:
					
				break;
				
				case 5:
					
				break;
				
				case 6:
					
				break;
				
				case 7:
					System.out.println("Input base");
					sh1.tr1.setBaseofTriangle(sc1.nextDouble());
					System.out.println("Input height");
					sh1.tr1.setHeight(sc1.nextDouble());
					
					sh1.tr1.setAreaOfTriangle();
					System.out.println(sh1.tr1.getAreaOfTriangle());
				break;
			}
			break;

		case 3:
			System.out.println("Input side of the square");
			sh1.sq1.setSideOfSquare(sc1.nextDouble());
			sh1.sq1.setAreaOfSquare();
			System.out.println(sh1.sq1.getAreaOfSquare());
			break;
		default:
			System.out.println("Somthing went wrong. Try again");
		}

	}

}
