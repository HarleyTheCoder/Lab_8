import java.util.Scanner;

public class Student {
	String firstName;
	String lastName;
	String hometown;
	String favoriteFood;
	int    age;
	
	//Get correct info. Repeat if wanted.
	public void getInfo(String command, Scanner scan) {
		boolean tempBool = false;
		while (true) {
			if (command.equalsIgnoreCase("age")) {
				System.out.print("\n" + this.firstName + " is " + this.age + " years old. ");
			} else if (command.equalsIgnoreCase("hometown")) {
				System.out.print("\n" + this.firstName + " is from " + this.hometown + ". ");
			} else if (command.equalsIgnoreCase("favorite food")) {
				System.out.print("\n" + this.firstName + "'s favorite food is " + this.favoriteFood + ". ");
			}
			System.out.print("Would you like to know more? (enter \"yes\" or \"no\"): ");
			tempBool = Validation.isYesNo(scan.nextLine(), scan);
			if (!tempBool) {
				System.out.print("\nThanks!");
				break;
			} else if (tempBool){
				System.out.print("\nWhat would you like to " +
				        "know about " + this.firstName + "? (Enter \"age\" " +
						"or \"hometown\" or \"favorite food\"): ");
				command = Validation.makeRightAnswer(scan.nextLine(), scan);
				this.getInfo(command, scan);
			}
			return;
		}
	}
	
	//First name
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getFirstName(String name) { //redundant
		return this.firstName;
	}
	
	//Last name
		public void setLastName(String name) {
			this.lastName = name;
		}
		
		public String getLastName(String name) { //redundant
			return this.lastName;
		}
	
	//Hometown
	public void setHometown(String town) {
		this.hometown = town;
	}
	
	public String getHometown() { //redundant
		return this.hometown;
	}
	
	//Favorite Food
	public void setFavoriteFood(String food) {
		this.favoriteFood = food;
	}
	
	public String getFavoriteFood() { //redundant
		return this.favoriteFood;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() { //redundant
		return this.age;
	}
	
}
