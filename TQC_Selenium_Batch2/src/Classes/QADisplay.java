package Classes;

public class QADisplay {

	public static void main(String arg[]) {
		QA q = new QA();
		q.setRole("Testing Engineer");
		String skills = q.getRole();
		inserQARecord(q);
	}
	
	public static void inserQARecord(QA q) {
		if(q.getSkills()!=null)
		{
			System.out.println(q.getSkills());
		}
		if(q.getDomain()!=null)
		{
			System.out.println(q.getDomain());
		}
		if(q.getExp()!=null)
		{
			System.out.println(q.getExp());
		}
		if(q.getGrade()!=null)
		{
			System.out.println(q.getGrade());
		}
		if(q.getTechnology()!=null)
		{
			System.out.println(q.getTechnology());
		}
		if(q.getRole()!=null)
		{
			System.out.println(q.getRole());
		}
	}
}
