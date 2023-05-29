package Basics;

public class StringsDemo {

	public static void main(String[] args) {
	
		String s1 = "Welcome to";
		String s2 = " Java World.";
		String s3 = "Do well.";
		
		//String length
		System.out.println(s1.length());
		
		//Joining strings
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//Trimming strings
		//remove right and left spaces
		String s = "     Test      ";
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//charAt() - returns char based on index that we pass.
		s="Automation";
		System.out.println(s.charAt(3));
		
		//contains() - returns Boolean - To check if a value is present or not in the string
		System.out.println(s.contains("Aut"));
		System.out.println(s.contains("Mat"));
		System.out.println(s.contains("mat"));


		//equals - returns boolean - 
		System.out.println(s1.equals(s2));
		String s4= "AUTOMATION";
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));
		
		
		//replace() - replace single/ multiple characters in a string
		s = "Selenium Java training";
		System.out.println(s.replace('i', 'X'));
		System.out.println(s.replace("Java", "JAVA"));
		
		//subString() - to extract string from the main string
		System.out.println(s.substring(0, 5));
		
		//split() - to divide string into multiple part using delimiter.
		//String a[] = new String[5];
		String a[] = s.split(" ");
		
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		
		
		//toUpperCase(), toLowerCase()
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//String compare
		//Case 1
		s1 = "Welcome";
		s2 = "Welcome";
		
		System.out.println(s1==s2); //true - compares objects - same object
		System.out.println(s1.equals(s2)); //true - compares value of the objects
		
		//Case 2
		String x = new String("Welcome");
		String y = new String("Welcome");
		
		System.out.println(x==y); //false - compares objects - different objects
		System.out.println(x.equals(y)); //true - compares value of the objects
		
		//Case 3
		String u = "abc";
		String v = new String("abc");
		String w = v;
		
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);
		System.out.println(u==v); //false - compares objects
		System.out.println(u==w); //false - compares objects
		System.out.println(v==w); //true - compares objects - same object
		System.out.println(u.equals(v)); //true - compares value of the objects
		System.out.println(u.equals(w)); //true - compares value of the objects
				
	}

}
