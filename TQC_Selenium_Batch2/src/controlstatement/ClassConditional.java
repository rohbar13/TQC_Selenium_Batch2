package controlstatement;

public class ClassConditional {

	public static void main(String arg[]) {
		
		int perc = 75;
		int attendance = 75;
		
		if(perc>=80 || attendance>=80) {
			if(perc>=80 && attendance <80){ // nested statement
				System.out.println("GradeA_B");
			}
			else {
				System.out.println("Grade A");
			}
		}else {
			System.out.println("Grade B");
		}
				
	}
	
}
