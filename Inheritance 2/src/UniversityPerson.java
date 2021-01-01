
public class UniversityPerson extends Person{

	private String institution;
	
	public UniversityPerson(String n, int a, String inst) {
		super(n, a); // Calls the Person class constructor
		institution = inst;
	}

	public String getInstitution() {
		return institution;
	}

	public void printDetails() {
		super.printDetails();
		System.out.println("Institution: " + institution);
	}
	
}
