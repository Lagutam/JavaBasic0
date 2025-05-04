package Strings;

public class CheckPallindrome {
	
	public boolean isPallindrome(String string) {
		int left =0;
		int right=string.length()-1;
		
		while(left<right) {
			if(string.charAt(left)!=string.charAt(right)) {
				return false;
			}
			left++;
			right--;
		} return true;
	}

}
