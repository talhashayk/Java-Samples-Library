
public class Student extends UniversityPerson{

	private int stage;
	
	public Student(String n, int a, String inst, int st) {
		super(n, a, inst); // Calls the UniversityPerson class constructor
		stage = st;
	}

	public int getStage() {
		return stage;
	}

	public void printDetails() {
		super.printDetails();
		System.out.println("Stage: " + stage);
	}
	
}
