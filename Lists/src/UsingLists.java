import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UsingLists {

	public static void main(String[] args) {

		List<String> studentName = new ArrayList<String>();

		studentName.add("Talha");
		studentName.add("Moeez");
		studentName.add("Arman");
		studentName.add("Imran");
		studentName.add("Robin");
		System.out.println(studentName.get(0));
		System.out.println(studentName.size());
		System.out.println("List:\t\t" + studentName);
		System.out.println("Sublist:\t" + studentName.subList(2, 4));

		Collections.rotate(studentName, 1);
		System.out.println("Rotated:\t" + studentName);

		Collections.reverse(studentName);
		System.out.println("Reverse:\t" + studentName);

		Collections.shuffle(studentName);
		System.out.println("Shuffled:\t" + studentName);

		Collections.sort(studentName);
		System.out.println("Sorted:\t\t" + studentName);

		System.out.println("Max:\t\t" + Collections.max(studentName));

		studentName.add(1, "------> Added here by specification");

		for (String s : studentName) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Input ten numbers on seperate lines");
		Scanner s = new Scanner(System.in);
		List<Integer> studentNo = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			studentNo.add(s.nextInt());
		}
		
		for (int number: studentNo) {
			System.out.print(number + ", ");
		}

	}

}
