package switching;

import Classes.Tutorial;

public class CallerClass {

	public static void main(String[] args) {
		
		Tutorial tl = new Tutorial();
		System.out.println(tl.x);
		System.out.println(tl.y);
		
		
		Tutorial tl2 = new Tutorial();
		System.out.println(tl2.x);
		System.out.println(tl2.y);
		
	}
}
