package Classes;

public class QA {

	//encapsulation 
	
	/*
	 * Technically in encapsulation, 
	 * the variables or data of a class is hidden from any other class and 
	 * can be accessed only through any member 
	 * function of own class in which they are declared.
	 */
	
	private String skills;
	private String role;
	private String technology;
	private String domain;
	private String exp;
	private String grade;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
}
