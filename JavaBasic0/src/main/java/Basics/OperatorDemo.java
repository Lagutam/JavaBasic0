package Basics;

public class OperatorDemo {

	public static void main(String[] args) {
		//Arithmetic operators + - * / %
		System.out.println("Arithmetic Operators examples");
		int a = 100, b = 200;
		System.out.println("The sum of a and b is :" + (a+b));
		System.out.println("The diff of a and b is :" + (a-b));
		System.out.println("The multiplication of a and b is :" + (a*b));
		System.out.println("The Division of a and b is :" + (a/b));
		System.out.println("The Modulo Division of a and b is :" + (a%b));
		
		
		//Relational/ Comparison operators > < >= <= != ==
		//Always returns True/ False (Boolean)
		System.out.println("Relational Operators examples");
		a =10; b =15;
		System.out.println(a>b); //False
		System.out.println(a<b); //True
		System.out.println(a>=b); //False
		System.out.println(a<=b); //True
		System.out.println(a!=b); //True
		System.out.println(a==b); //False
		
		//Logical operators && || !		
		//Works between 2 or more boolean values
		//returns boolean value (True/ False)
		System.out.println("Logical Operators examples");
		Boolean x= true;
		Boolean y= false;
		
		System.out.println(x&&y); //False 		
		System.out.println(x||y); //True	
		System.out.println(!x);  //False
		System.out.println(!y); //True 
		
		Boolean b1 = 10>20; //False
		Boolean b2 = 10<20; //True
		
		System.out.println(b1&&b2); //False 		
		System.out.println(b1||b2); //True	
		System.out.println(!b1);  //True
		System.out.println(!b2); //False 

		
		//Increment & Decrement operators ++ --
		System.out.println("Increment Operator examples");
		// Increment operator - ++ - Pre or Post
		// ++a - Pre
		// a++ = Post
		// ++a -> a= a+1;
		// a++ -> a = a+1;
		
		a=10;
		a++;
		System.out.println(a);
		
		a=10;
		++a;
		System.out.println(a);
		
		//scenario 1
		int result;
		a=10;
		result = a++;
		System.out.println(result); //10 - First assignment then increment
		System.out.println(a); //11
		
		//scenario 2
		b=10;
		result = ++b;
		System.out.println(result); //11 - First increment then assignment
		System.out.println(b); //11
		
		// Decrement operator --, Pre or Post
				// --a - Pre
				// a-- = Post
				// --a -> a= a-1;
				// a-- -> a = a-1;
		System.out.println("Decrement Operator examples");
		a=100;
		a--;
		System.out.println(a);
		
		a=100;
		--a;
		System.out.println(a);
		
		//scenario 1
		a=100;
		result = a--;
		System.out.println(result); //100 - First assignment then increment
		System.out.println(a); //99
		
		//scenario 2
		b=100;
		result = --b;
		System.out.println(result); //99 - First increment then assignment
		System.out.println(b); //99
		
				
		//Assignment operators= += -= *= /= %=
		// += -= *= /= %= -> Also known as short hand operators
		System.out.println("Assignment Operators examples");
		// = - assignment of data to the variable		
		int p = 10;
		System.out.println(p); //10
		
		// +=
		// p+=5 -> p = P+5;
		p+=5;
		System.out.println(p); //15
		
		// -=
		//p-=5 -> p = p-5;
		p=10;
		p-=5;
		System.out.println(p); //5
		
		// *=
		//p*=5 -> p = p*5;
		p=10;
		p*=5;
		System.out.println(p); //50
		
		// /=
		//p/=5 -> p = p/5;
		p=10;
		p/=5;
		System.out.println(p); //2
		
		
		// %=
		//p%=5 -> p = p%5;
		p=10;
		p%=5;
		System.out.println(p); //0	
		
		
		//Conditional/ ternary operator ?:
		// var = expression ? Result1 : Result2;
		System.out.println("Ternary Operators examples");
		
		int u = 100, v = 200;
		int w = u>v ? u : v; //200
		System.out.println("The value of w is: " + w); //200
		
		w = u<v ? u : v; //100
		System.out.println("The value of w is: " + w); //100
		
		int age = 31;
		String var = age>=18? "Eligible to Vote":"Not eligible to Vote";
		System.out.println("The candidate is " + var +", as the age of the candidate is " + age);
		
	}

}
