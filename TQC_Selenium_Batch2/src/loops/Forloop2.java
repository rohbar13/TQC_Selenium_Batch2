package loops;

public class Forloop2 {
	public static void main(String[] args) {
		
		for(int x=0;x<5;x++) {
			for(int y=5;y>x;y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
