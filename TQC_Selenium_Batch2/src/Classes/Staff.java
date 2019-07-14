package Classes;

public class Staff {

	public static void main(String[] args) {
		int x = 10;
		add(x); // call by value
		System.out.println(x);
	
		// ----------------------------------------------------------------

		Person p = new Person();

		System.out.println(p.name);
		System.out.println(p.age);

		displayStaffInfo(p); // call by reference

		System.out.println(p.name);
		System.out.println(p.age);
	}

	public static void displayStaffInfo(Person v) {
		v.name = "Ashok";
		v.age = 24;
	}

	public static void add(int x) {
		x += 10;
	}
}
