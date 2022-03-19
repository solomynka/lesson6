package logos.lesson4part1;

public class Lesson04 {
	public static void main(String[] args) {
		
		Robot r1 = new Robot("я Robot Ц € просто працюю");
		System.out.println(r1);
		
		CoffeRobot r2 = new CoffeRobot("");
		System.out.println(r2);
		
		RobotDancer r3 = new RobotDancer("");
		System.out.println(r3);
		
		RobotCoocker r4 = new RobotCoocker("");
		System.out.println(r4);
		
		Robot [] array = {r1,r2,r3,r4};
		
		for(Robot ar1 : array){
			System.out.println(ar1);
		}
		
	}

}
