package constructor;

public class CarInstruction {
	
	public static void main(String arg[])
	{
		Car car = new Car(1000000);
		car.createNewCar();
		car.colorTheCar();
		car.packTheCar();
		
		
		Car car2 = new Car(3300000);
		car2.createNewCar();
		car2.colorTheCar();
		car2.packTheCar();
		
		if(car==car2)
		{
			System.out.println("Both the objects are same");
		}else
		{
			System.out.println("Both the objects are not same");
		}
		
		
	}
	
}
