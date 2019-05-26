package arithmeticoperator;

public class ArithmeticOperation6 {
	
	public static void main(String[] args) {
		
		int x = 20;
		int y = 10;
		
		int sum = add(x,y);
		System.out.println("Added value is : "+sum);
		
		int min = minus(x,y);
		System.out.println("Remaining value is : "+min);
		
	}
	
	public static int add(int a,int b) {
		int z = a+b;
		return z;
	}
	
	public static int minus(int x, int y) {
		return x-y;
	}
	
}
