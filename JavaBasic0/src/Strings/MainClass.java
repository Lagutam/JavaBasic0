package Strings;

public class MainClass {

	public static void main(String[] args) {
		// Reverse a given string		
		/*ReverseString revStr = new ReverseString();
		String reversedString=revStr.reverseString("Jharsuguda");
		System.out.println(reversedString);
		*/
		//check if given string is pallindrome
		CheckPallindrome chkPallindrome = new CheckPallindrome();
		boolean isPallindrome=chkPallindrome.isPallindrome("LEVELS");
		System.out.println(isPallindrome);

	}

}
