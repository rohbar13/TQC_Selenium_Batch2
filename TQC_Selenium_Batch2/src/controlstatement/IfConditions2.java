package controlstatement;
import java.util.Scanner;
public class IfConditions2 {
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		long val1 = scan.nextLong();
		long val2 = scan.nextLong();
		compareInteger(val1,val2);
	}
	
	
	public static void compareInteger(long x,long y)
	{
		if(x > y)
		{
			System.out.println(x + " is biggest value");
		}else {
			System.out.println(y + " is biggest value");
		}
	}
	
}
