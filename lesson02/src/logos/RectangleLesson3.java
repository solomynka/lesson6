package logos;

public class RectangleLesson3 {
	public static void main(String[] args) {
		Rectangle rectan = new Rectangle(15, 5.5);
		double area = rectan.calcArea();
		double perimeter = rectan.calcPerimeter();
		
		System.out.println("Площа прямокутника= " + area);
		System.out.println("Периметр прямокутника= " + perimeter);
		
		Rectangle rectan2 = new Rectangle();
		double area2 = rectan2.calcArea();
		double perimeter2 = rectan2.calcPerimeter();
		
		System.out.println("Площа прямокутника= " + area2);
		System.out.println("Периметр прямокутника= " + perimeter2);
		
	}
}

class Rectangle{
	private int widht;
	private double height;
	
	public Rectangle() {
		this.widht = 10;
		this.height = 6.6;	
	}
	
	public Rectangle(int widht, double height) {
		this.height = height;
		this.widht = widht;
	}
	double calcArea() {
		double area = widht*height;
		return area;
	}
	double calcPerimeter() {
		double perimeter = (widht+height)*2;
		return perimeter;
	}
	
	
	
}