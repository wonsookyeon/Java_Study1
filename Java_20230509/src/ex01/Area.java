package ex01;

interface Shape{
	double getArea();
	
}

class Rectangle implements Shape{
	private double width;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	private double height;

	@Override
	public double getArea() {
		return width*height;
	}
}

class Circle implements Shape{
	Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

public class Area {

	public static void main(String[] args) {
		
		Shape r = new Rectangle(75.2,173.5);
		System.out.printf("사각형 면적 : %.2f" , r.getArea());
		
		System.out.println();
		
		Shape c = new Circle(10.6);
		System.out.printf("원의 면적 : %.2f", c.getArea());

	}

}
