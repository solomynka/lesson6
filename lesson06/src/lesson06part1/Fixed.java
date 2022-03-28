package lesson06part1;

public class Fixed implements Salary {

	public double s;
	
	public Fixed(double s) {
		this.s=s;
	}

	@Override
	public void salary() {
		System.out.println("Фіксована зарплата працівника " + s + " грн/міс");
	}

}
