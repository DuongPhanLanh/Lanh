package Lab4;

public class Circle {
	protected double radius;
	protected String color;

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}

package Lab4;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return this.getArea() *height;
		
	}
}

package Lab4;

import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		System.out.println("Vui long nhap cac gia tri sau: ");
		System.out.println("-------------------------------");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap gia tri radius  ");
			double a = sc.nextDouble();
			System.out.println("Nhap gia tri color  ");
			String b = sc.next();
			System.out.println("Gia tri cua Circle la ");
			Circle  ci = new Circle(a, b);
			System.out.println(ci);
			
			System.out.println("Nhap gia tri  height ");
			double c = sc.nextDouble();
			Cylinder cy = new Cylinder(a, b, c);
			System.out.println("Gia tri volume la: "+cy.getVolume());
		}
		
	}
}
