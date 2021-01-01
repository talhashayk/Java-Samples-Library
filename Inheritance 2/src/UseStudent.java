
public class UseStudent {

	public static void main(String[] args) {
		
		Student whizKid = new Student("Talha Sheikh", 18, "Newcastle University", 1);
		System.out.println(whizKid.getName() + "\n" + whizKid.getAge());
		System.out.println(whizKid.getInstitution() + "\n" + whizKid.getStage() + "\n");
		
		Person p = new Person("Moeez Shahid", 18);
		p.printDetails();
		
		System.out.println();
		
		Student s = new Student("Talha Sheikh", 18, "Newcastle University", 1);
		s.printDetails();
		
		System.out.println();
		
		p = s;
		p.printDetails();	
		
	}
	
}
