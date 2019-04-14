package controlstatement;

public class ClassIF {

	public static void main(String arg[]) {
		
		int x = 10;
		int y = 56;
		int z = 30;
		int p = 40;
		
		if(x>y && x>z && x>p)
		{
			System.out.println("x is greater than y, z and p");
		}else if(y>z && y>p)
		{
			System.out.println("y is greater than x, z and p");
		}else if(z>p)
		{
			System.out.println("z is greater than x,y and p");
		}else {
			System.out.println("p is greater than x,y and z");
		}
		
	}
	
}
