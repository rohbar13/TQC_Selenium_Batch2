package constructor;

public class Car {

	
	/*
	 * A constructor is a special method that is used to initialize a newly created object and 
	 * is called just after the memory is allocated for the object. 
	 * It can be used to initialize the objects to desired values or default values at the time of 
	 * object creation.
	 * It is not mandatory for the coder to write a constructor for a class.
	 */
	
	
	private String carName;

	public Car(int price) {
		System.out.println("Checking the price range...");
		if(price<=1000000)
		{
			carName = "Maruti";
		}else {
			carName = "Merc";
		}
		
	}
	
	
	public void createNewCar() {
		System.out.println("Create New Car : "+carName);
	}
	
	public void colorTheCar() {
		System.out.println("Color the Car : "+carName);
	}
	
	public void packTheCar() {
		System.out.println("Pack the Car : "+carName);
	}
	
}
