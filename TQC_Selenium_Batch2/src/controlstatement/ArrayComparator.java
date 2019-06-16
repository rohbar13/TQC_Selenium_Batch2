package controlstatement;

import java.util.Scanner;

public class ArrayComparator {

	public static void main(String[] args) {

		String[] namesArray = {"Amit","Rahul","Ankit","Rohit"};
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println(name);
		
		for(int x=0;x<namesArray.length;x++)
		{
			if(name.equalsIgnoreCase(namesArray[x])) {
				System.out.println("Match Found "+name.length());
			}
		}
	}
}
