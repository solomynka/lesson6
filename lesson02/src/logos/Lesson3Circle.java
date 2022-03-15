package logos;

public class Lesson3Circle {
	public static void main(String[] args) {
		Circle circle = new Circle(10.6 ,5.3);
		double area = circle.calcArea();
		System.out.println("Площа = " + area);
		System.out.println("Довжина = " + circle.getLine());
	}

}
class Circle{
	private double r;
	private double d;
	
	public Circle(double d, double r) {
		this.d = d;
		this.r = r;
	}
	
	double calcArea(){
		double area = (3.14*d*d)/4;
		return area;	
	}
	double getLine() {
		return 2*3.14*r;
	}
	
}
