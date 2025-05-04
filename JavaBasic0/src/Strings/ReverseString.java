package Strings;

public class ReverseString {
	
	public String reverseString(String str) {
		
		//String string ="";
		StringBuilder revStr = new StringBuilder("");
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr.append(str.charAt(i));
		}
		
		return revStr.toString();
	}

}
