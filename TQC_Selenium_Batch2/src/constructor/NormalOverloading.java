package constructor;

public class NormalOverloading {
	
	/*
	 * Method Overloading is a feature that allows a class to 
	 * have more than one method having the 
	 * same name but different signature/parameter
	 */
	
	/**
	 * Provide two values to get the sum
	 * @param x
	 * @param y
	 */
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	/**
	 * Provide two values to get the sum
	 * @param x
	 * @param y
	 * @param z 
	 */
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	
	/**
	 * Provide two float values to get the sum
	 * @param x
	 * @param y
	 * @param z 
	 */
	public void add(float x,float y,float z) {
		System.out.println(x+y+z);
	}
	
	/**
	 * Provide int array to get the sum
	 * @param array
	 */
	public void add(int[] array) {
		
	}
	
	public void add() {
		
	}
	
	public void subtract() {
		
	}
	
	public void subtract(int x,int y) {
		
	}

}
