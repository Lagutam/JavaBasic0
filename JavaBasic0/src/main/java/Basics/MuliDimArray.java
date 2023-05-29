package Basics;

public class MuliDimArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2]; //declaration
		
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		
		int b[][] = {{700, 800}, {900, 1000}, {1100, 1200}};
		
		
		//size of array
		System.out.println(a.length); //returns row size.
		System.out.println(a[0].length); //returns column size. need to pass row num as args.
		
		System.out.println(b.length); //returns row size.
		System.out.println(b[1].length);
		
		// reading data
		// specific
		System.out.println(a[2][1]);
		System.out.println(b[1][0]);
		
		//all
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		
		
		// Using enhanced For loop
		for (int x[]:a) {
			for(int y:x) {
				System.out.println(y);
			}
		}

	}

}
