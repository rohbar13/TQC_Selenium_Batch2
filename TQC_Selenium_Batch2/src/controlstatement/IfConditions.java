package controlstatement;
import java.util.Scanner;
public class IfConditions {
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		int val3 = scan.nextInt();

		if(val1 > val2 && val1 > val3)
		{
			System.out.println(val1 + " is biggest value");
		}else if(val2>val3) {
			System.out.println(val2 + " is biggest value");
		}else {
			System.out.println(val3 + " is biggest value");
		}

	}
}
