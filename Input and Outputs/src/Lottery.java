import java.io.*;
import java.util.*;

public class Lottery {

	public static void main(String[] args) throws IOException {

		int noOfPlayers;
		int winnings;
		int biggestWinnings = 0;
		String forename;
		String surname;
		String forenameW = "";
		String surnameW = "";
		boolean moreThanOne = false;

		FileReader inData = new FileReader(
				"C:\\Users\\Talha\\Desktop\\University\\1022\\Files\\Lecture 1\\\\lottery.txt");
		Scanner inFile = new Scanner(inData);

		noOfPlayers = inFile.nextInt();
		String restOfLine = inFile.nextLine();
		for (int i = 0; i < noOfPlayers; i++) {
			String inputLine = inFile.nextLine();
			Scanner lineScanner = new Scanner(inputLine);
			forename = lineScanner.next();
			surname = lineScanner.next();
			winnings = 0;
			while (lineScanner.hasNext()) {
				winnings += lineScanner.nextInt();
			}
			if (winnings >= biggestWinnings) {
				moreThanOne = (winnings == biggestWinnings);
				biggestWinnings = winnings;
				forenameW = forename;
				surnameW = surname;
			}
		}

		inData.close();

		PrintWriter outFile = new PrintWriter(
				"C:\\Users\\Talha\\Desktop\\University\\1022\\Files\\Lecture 1\\results.txt");
		printResults(outFile, forenameW, surnameW, biggestWinnings, moreThanOne);
		outFile.close();

	}

	public static void printResults(PrintWriter file, String forename, String surname, int winnings,
			boolean moreThanOne) {

		if (winnings > 0) {
			if (!moreThanOne) {
				file.print("The overall winner is: ");
				file.println(forename + " " + surname);
			} else {
				file.println("There are multiple winners.");
			}
			file.println("The winning sum of money: £" + winnings);
		} else {
			file.println("There are no winners.");
		}

	}

}
