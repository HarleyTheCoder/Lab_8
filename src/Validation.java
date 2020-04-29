import java.util.Scanner;

public class Validation {
	
	//Check if yes or no
	public static boolean isYesNo(String ans, Scanner scan) {
		boolean trueFalse;
		try {
			if (ans.toLowerCase().startsWith("y")) {
				trueFalse = true;
			} else if (ans.toLowerCase().startsWith("n")) {
				trueFalse =  false;
			} else {
				System.out.print("\nThat answer does not work. Please try again. (Enter \"yes\" or \"no\"): "); 
				trueFalse = Validation.isYesNo(scan.nextLine(), scan);
			}
			return trueFalse;
		} catch (Exception e) {
			System.out.print("\nSomething weird happened. Please try again. (Enter \"yes\" or \"no\"): ");
				return Validation.isYesNo(scan.nextLine(), scan);
		}
	}
	
	//Check if it's an integer using "try catch"
	public static int makeInt(String input, Scanner scan) {
		int num;
		while (true) {
			try {
				num = Integer.parseInt(input);
				return num;
			} catch (NumberFormatException e) {
				System.out.print("\nThat is not a valid integer. Please try again. (Enter a number 1-10): ");
				input = scan.nextLine();
			}
		}
		
	}
	
	//Check if int is in range of array with "try catch";
	//Connected to makeInt();
	public static int putInRange(int num, Student[] students, Scanner scan) {
		Student testStudent;
		
		while (true) {
			try {
				testStudent = students[num - 1];
				return num;
			} catch (ArrayIndexOutOfBoundsException aie) {
			
					System.out.print("\nThat student does not exist. Please try again. (Enter a number 1-10): ");
					num = makeInt(scan.nextLine(), scan);
			}
			
		}
	}
	//Check string for correct words
	public static String makeRightAnswer(String string, Scanner scan) {
		try {
			while (true) {
				if (!string.equalsIgnoreCase("age") && !string.equalsIgnoreCase("hometown") &&
						!string.equalsIgnoreCase("favorite food")) {
					System.out.print("\nThat data does not exist. Please try again. (enter " +
							 "\"age\" or \"hometown\" or \"favorite food\"): ");
						string = makeRightAnswer(scan.nextLine(), scan);
				} else {
					return string;
				}
			} 
		} catch (Exception e) {
				System.out.print("\nThat data does not exist. Please try again. (Enter " +
						 "\"age\" or\n\"hometown\" or \"favorite food\"): ");
				string = makeRightAnswer(scan.nextLine(), scan);
		}
		return string;
	}
}
	
