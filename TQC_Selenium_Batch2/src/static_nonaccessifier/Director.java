package static_nonaccessifier;

public class Director {

	String str = "temp";
	final String compName;
	
	public Director(String compName) {
		this.compName = compName;
	}
	
	public Director() {
		compName = "ICICI";
	}
	
	
	static int emp_id;
	static int age;
	static int salary;
	static char grade;
	
	public void printManagerInfo() {
		System.out.println(emp_id);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(grade);
	}
}
