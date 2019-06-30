package question;

public class OverloadingQ1 {
	
	/*
	 * 1 : Constructor and class name should be same
	 * 2 : Constructor cannot return a value
	 * 3 : Constructor cannot be static
	 * 4 : Constructor cannot be abstract
	 * 5 : Constructor cannot be final
	 */
	
	public OverloadingQ1() {
		
	}
	
	public static void main(String[] arg) {
		printInfo(10l);
	}
	
	public static void printInfo(long x) {
		System.out.println("long : "+x);
	}
	
	public static void printInfo(int x) {
		System.out.println("int : "+x);
	}
	
}
