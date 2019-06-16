package Classes;

public class CallingCar {
	public static void main(String[] args) {
		
		Car car = new Car("Volvo");
		car.getCarName();
		car.printCarName();
		
		Car car1 = new Car("BMW");
		car1.getCarName();
		car1.printCarName();
		
		Car car2 = new Car("Audi");
		car2.getCarName();
		car2.getCarName();
		
		Car car3 = new Car();
		car3.getCarName();
		car3.printCarName();
	}
}
