package Basics;

public class IfElseCon {

	public static void main(String[] args) {
		//If condition Control statements
		System.out.println("If Condition control statement examples");
		int person_age = 11;
		
		if(person_age>=18) {
			System.out.println("Person is eligible to Vote.");
		}
		
		
		
		//If Else condition control statements
		System.out.println("If Else Condition control statement examples");
		if(person_age>=18) {
			System.out.println("Person is eligible to Vote.");
		}
		else {
			System.out.println("Person is not eligible to Vote.");
		}
		int num = 22;
		if(num%2==0) {
			System.out.println("Number is Even number.");
		}
		else {
			System.out.println("Number is odd number.");
		}
		
		if(num>0) {
			System.out.println("Number is Positive number.");
		}
		else if (num<0) {
			System.out.println("Number is number number.");
		}
		else
			System.out.println("Number is Zero.");
		
		// Largest of 3 numbers
		int x = 100, y=200, z = 300;
		if(x>y && x>z) {
			System.out.println("Largest number is x: " + x);
		}
		else if (y> x && y > z) {
			System.out.println("Largest number is y: " + y);
		}
		else
			System.out.println("Largest number is z: " + z);
		
		
		//Nested If Else condition control statements
		System.out.println("Nested If Else Condition control statement examples");
		
		if(x>y) {
			if (x>z)
				System.out.println("Largest number is x: " + x);
			else if(z>y)
				System.out.println("Largest number is z: " + z);
		}
			else if (y>z) {
				System.out.println("Largest number is y: " + y);
		}
		
			else 
				System.out.println("Largest number is z: " + z);
		
		
		
		// Switch control statement.
		System.out.println("Switch Condition control statement examples");
		int day_no = 4;
		
		switch (day_no) {
		case 1: System.out.println("The day is Sunday."); break;
		case 2: System.out.println("The day is Monday."); break;
		case 3: System.out.println("The day is Tuesday."); break;
		case 4: System.out.println("The day is Wednesday."); break;
		case 5: System.out.println("The day is Thursday."); break;
		case 6: System.out.println("The day is Friday."); break;
		case 7: System.out.println("The day is Saturday."); break;
		default: System.out.println("Given number is invalid");
		}
		
		
	}	
}
