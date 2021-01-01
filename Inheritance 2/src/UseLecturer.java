
public class UseLecturer {

	public static void main(String[] args) {
		Lecturer prof = new Lecturer("Neil Speirs", 42, "Newcastle University", "Computer Science");
		System.out.println(prof.getName());
		System.out.println(prof.getAge());
		System.out.println(prof.getInstitution());
		System.out.println(prof.getDepartment());
	}

}
