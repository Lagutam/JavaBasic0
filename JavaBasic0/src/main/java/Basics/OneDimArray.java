package Basics;

import java.util.Arrays;

public class OneDimArray {

	public static void main(String[] args) {
		
		//Initialization : Method 1
		int a[] = new int[6]; //Declaration
		a[0] = 100;
		a[1] = 200;
		a[5] = 300;
		
		//Initialization : Method 2
		int b[]= {700, 800, 900, 400, 500, 600};
		
		
		// Size/ length of an array.
		System.out.println("The size of the array a is: "+ a.length);
		System.out.println("The size of the array b is: "+ b.length);
		
		
		// Get single value of the array
		System.out.println("The value in 3rd position of array is: "+ a[1]);
		System.out.println("The value in 5th position of array is: "+ b[4]);
		
		// Getting all the data from array
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		// Getting all the data from array one by one
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		
		
		// Getting data using enhanced for loo
		for(int x:a)
		{
			System.out.println(x);
			
		}
		
		for(int y:b) {
			System.out.println(y);
		}
		
	}		

}
