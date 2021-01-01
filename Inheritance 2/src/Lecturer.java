
public class Lecturer extends UniversityPerson{

	private String department;
	
	public Lecturer(String n, int a, String inst, String dep) {
		super(n, a, inst);
		department = dep;
	}

	public String getDepartment() {
		return department;
	}

	public void printDetails() {
		super.printDetails();
		System.out.println("Department: " + department);
	}

}
