import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO {

	public static void main(String[] args) throws IOException {
		
		PrintWriter outFile = new PrintWriter("C:\\Users\\Talha\\Desktop\\University\\1022\\Files\\data.txt");
		outFile.println(11);
		outFile.close();
		
		FileReader inData = new FileReader("C:\\Users\\Talha\\Desktop\\University\\1022\\Files\\data.txt");
		Scanner inFile = new Scanner(inData);
		System.out.println(inFile.next());
		inData.close();
		
		test();
	}

	public static void test() {
		List<String[]> tokens = new ArrayList<String[]>();
		Scanner source = new Scanner(System.in);
		for (int i = 0; i <2; i++) {
		String[] s = source.next().split("\\s");
		tokens.add(s);
		}
		for (String[] s: tokens) {
			System.out.println(s);
		}
	}
	
}
