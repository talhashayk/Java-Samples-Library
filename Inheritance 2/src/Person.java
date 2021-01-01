
public class Person {

	private String name;
	private int age;
	
	public Person(String personName, int personAge) {
		name = personName;
		age = personAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
}
