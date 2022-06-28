

import java.util.Scanner;

public abstract class Shape {
	 abstract void printArea() ; 
	 void totalArea() {
		  }		
}
class Rectangle extends Shape{

	@Override
	void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle in centimeters:");
		double length = sc.nextDouble();
		System.out.println("Enter width of rectangle in centimeters:");
		double width = sc.nextDouble();
		System.out.println("Total area of rectangle is:"+(length*width)+"cm");
		
	}
	
}
class Triangle extends Shape{

	@Override
	void printArea() {  //area of Triangle = 1/2*height*base
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of triangle in centimeters:");
		double height = sc.nextDouble();
		System.out.println("Enter length of triangle base in centimeters:");
		double base = sc.nextDouble();
		System.out.println("Total area of triangle is:"+(height*base/2)+"cm");	
		
	}
	
}
class Circle extends Shape{
							//area of circle = Math.PI*radius*radius
	@Override
	void printArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle in centimeters:");
		double radius = sc.nextDouble();
		System.out.println("Total area of circle is:"+(Math.PI*radius*radius)+"cm");
		sc.close();
		
	}
}
class GeoShape {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rc = new Rectangle();
		Triangle tr = new Triangle();
		Circle cr = new Circle();
		System.out.println("Enter choice number.");
		System.out.println("1. Calculate Area of Rectangle.");
		System.out.println("2. Calculate Area of Trianle.");
		System.out.println("3. Calculate Area of Circle.");
		int choice = scanner.nextInt();
	switch (choice) {
		case 1: rc.printArea(); 
				break;
		case 2: tr.printArea();
				break;
		case 3: cr.printArea();	
				break;
		default: System.err.println("Invalid choice");
				break;
    	}
	}
}


