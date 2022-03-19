package logos.lesson4part1;

public class Robot {
	
	private String name;

	public Robot(String name) {
		this.name = name;
	}
	public String work(){
		return name;
	}
	@Override
	public String toString() {
		return work();
	}
	
}
