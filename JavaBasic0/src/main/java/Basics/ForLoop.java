package Basics;

public class ForLoop {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=100;i++) {
			if(i%2==0)
			System.out.println(i);
		}
		int i;
		for(i=100;i>=1;i--) {
			if(i%2==0)
			System.out.println(i);
		}
		
		for(i=1; i<=10;i++) {
			if(i==2||i==5)
				System.out.println(i);
		}
		
		for(i=1; i<=10;i++) {
			if(i!=2&&i!=5&&i!=7)
				System.out.println(i);
		}
		*/
		// break in for loop example
		for (int i=1; i<=5;i++) {
			if(i==3)
				break;
			System.out.println(i);
		}
		
		//continue in for loop example
		for(int i=1;i<=10;i++) {
			if(i==5||i==3)
				continue;
			System.out.println(i);
		}
		
	}

}
