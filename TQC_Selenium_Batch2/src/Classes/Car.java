package Classes;

public class Car {

private String name;
	
	public Car() {
		this.name = "dummy";
	}

	public Car(String name) {
		this.name = name;
	}
	
	public void getCarName() {
		System.out.println(name);
	}
	
	public void printCarName() {
		System.out.println(name);
	}
	
}
