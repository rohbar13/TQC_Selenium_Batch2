package Classes;

public class Student {

	int studentid;
	String studentName;

	public static void main(String[] args) {
		Student st = new Student();
		
		st.studentid = 101;
		st.studentName = "Rahul";
		
		st.printStudentInfo(st);

	}
	
	public void printStudentInfo(Student st) {
		System.out.println(st.studentid);
		System.out.println(st.studentName);
	}
	
}
