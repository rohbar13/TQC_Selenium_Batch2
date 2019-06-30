package static_nonaccessifier;

public class ManagerCalling {

	public static void main(String[] args) {

		Manager obj = new Manager();
		Director obj2 = new Director();
		
		Manager.age = 40;
		Manager.emp_id = 201;
		Manager.grade = 'C';
		Manager.salary = 50000;
		
		Director.age = 50;
		Director.emp_id = 255;
		Director.grade = 'C';
		Director.salary = 45000;
		
		obj.printManagerInfo();
		System.out.println("------------------------");
		obj2.printManagerInfo();

	}

}
