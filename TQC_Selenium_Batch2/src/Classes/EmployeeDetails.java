package Classes;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.id=101;
		e.name="Rohit";
		e.print();
		
		
		Employee e1 = new Employee();
		e1.id=102;
		e1.name="Rahul";
		e1.print();
		
		
		Employee e2 = new Employee();
		e2.id=103;
		e2.name="Ankit";
		e2.print();
		
		for(int x=0;x<=99;x++) {
			Employee e3 = new Employee();
			e.id=x;
			e.name="Employee"+x;
			e.print();
			
		}
		
		
		
		
		
	}
}
