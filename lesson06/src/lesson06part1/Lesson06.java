package lesson06part1;

public class Lesson06 {
	public static void main(String[] args) {
		
		Fixed human1 = new Fixed(25200.3);
		human1.salary();
		Hourly human2 = new Hourly(260, 110);
		human2.salary();
	}

}
