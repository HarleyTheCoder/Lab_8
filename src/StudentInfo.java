import java.util.Scanner;

public class StudentInfo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] students = new Student[10];
		
		String[]  firstNames    = {"Anna", "Billy", "Karen", "Jack", "Fred",
							       "Rebecca", "Neil", "Mandy", "Janice", "Jake"};
		String[]  lastNames     = {"Thompson", "Macklemore", "Swartz", "Jenson", "Vancouver",
								   "Wilborough", "Dunn", "Davis", "Carter", "Williams"};
		String[]  hometowns     = {"Brimley, MI", "Lansing, MI", "Austin, TX", "Lake Tahoe, CA",
								   "Dayton, OH", "St. Johns, MI", "Jacksonville, FL",
								   "Madison, WI", "Greenboro, NC", "St. Paul, MN"};
		String[]  favoriteFoods = {"General Tso's chicken", "potato salad", "lasagna", "pizza",
								   "a burger", "liver and onions", "chicken noodle soup",
								   "vegetable lo mein", "beef curry", "bacon"};
		int[]     ages          = {21, 32, 37, 19, 27, 20, 30, 22, 18, 46};
		int       tempNum       = 0;
		String    tempString    = "";
		
		//Assign array elements to students 1-10
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].setFirstName(firstNames[tempNum]);
			students[i].setLastName(lastNames[tempNum]);
			students[i].setHometown(hometowns[tempNum]);
			students[i].setFavoriteFood(favoriteFoods[tempNum]);
			students[i].setAge(ages[i]);
		}
		//Get student num
		System.out.print("Welcome to our Java class. Which student would you like to " +
							"learn more about? (enter a number 1-10): ");
		tempNum = Validation.makeInt(scan.nextLine(), scan);
		tempNum = Validation.putInRange(tempNum, students, scan);
		
		//Get what info they want
		System.out.print("\nStudent " + tempNum + " is " + students[tempNum - 1].firstName +
						" " + students[tempNum - 1].lastName + ". What would you like to " +
				        "know about " + students[tempNum - 1].firstName + "? (enter \"age\" " +
						"or \"hometown\"\nor \"favorite food\"): ");
		tempString = Validation.makeRightAnswer(scan.nextLine(), scan);
		students[tempNum - 1
		         ].getInfo(tempString, scan);
		
	
	}
}
