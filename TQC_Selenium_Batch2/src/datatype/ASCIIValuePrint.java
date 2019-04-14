package datatype;

public class ASCIIValuePrint {

	public static void main(String[] args) {
		
		for(int x=0;x<128;x++) {
			char c = (char) x;
			System.out.println(x+" -> "+c);
		}
		
	}
}
